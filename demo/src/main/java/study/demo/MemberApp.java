package study.demo;

import study.demo.member.Grade;
import study.demo.member.Member;
import study.demo.member.MemberService;
import study.demo.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(1L);
        System.out.println("newMember = " + memberA.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
