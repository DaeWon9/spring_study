package study.firstSample.discount;

import org.springframework.stereotype.Component;
import study.firstSample.member.Grade;
import study.firstSample.member.Member;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return price / 100 * discountPercent;
        }
        else{
            return 0;
        }
    }
}
