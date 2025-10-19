package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;
    public Long save(Member member) {
        em.persist(member);
        return member.getId(); // 커맨드랑 쿼리랑 분리해라 커맨드는 왠만해서 리턴 값을 안 만들려한다.
    }
    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
