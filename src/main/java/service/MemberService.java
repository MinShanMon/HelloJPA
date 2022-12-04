package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Member;

public class MemberService {
    protected EntityManager em;

    public MemberService(EntityManager em){
        this.em = em;
    }

    public Member createFacility(String surname, String fname, String secName, int memberNumber ){
        Member emp = new Member(surname, fname, secName, memberNumber);
        em.persist(emp);
        return emp;
    }

    public Member findMember(int id){
        return em.find(Member.class, id);
    }

    public Member updatMember(int id, String surname, String fname,
    String secName, Integer memberNumber){
        Member member = findMember(id);
        if(member == null){
            return null;
        }
        if(surname != null){
            member.setfName(surname);
        }
        if(fname != null){
            member.setfName(fname);
        }
        if(secName != null){
            member.setSecname(secName);
        }

        if(memberNumber != null){
            member.setMemberNumber(memberNumber);
        }

        return member;
    }

    public void removeMember(int id){
        Member member = findMember(id);
        if(member !=null){
            em.remove(member);
        }
    }

    public List<Member> listAllMembers(){
        String q = "select f from Member f";

        TypedQuery<Member> query = em.createQuery(q,Member.class);
        return query.getResultList();
    }

    public List<Member> listMemberWithName(String names){
        String q = "select f from Member f where f.surename = :name"+
            "OR f.firstName = :name OR f.secondName = :name";
        
        TypedQuery<Member> query = em.createQuery(q,Member.class).setParameter("name", names);
        return query.getResultList();
    }
}
