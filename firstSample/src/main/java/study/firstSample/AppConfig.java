package study.firstSample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.firstSample.discount.DiscountPolicy;
import study.firstSample.discount.RateDiscountPolicy;
import study.firstSample.member.MemberRepository;
import study.firstSample.member.MemberService;
import study.firstSample.member.MemberServiceImpl;
import study.firstSample.member.MemoryMemberRepository;
import study.firstSample.order.OrderService;
import study.firstSample.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
