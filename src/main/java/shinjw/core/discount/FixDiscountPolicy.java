package shinjw.core.discount;

import org.springframework.stereotype.Component;
import shinjw.core.member.Grade;
import shinjw.core.member.Member;

@Component
public class FixDiscountPolicy implements DiscountPolicy {
    private final int discountFixAmount = 1000; //1000원 할인
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) return discountFixAmount;
        return 0;
    }
}
