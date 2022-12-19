package com.example.demo.controller;

import com.example.demo.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    @GetMapping("show")
    public String showView(Model model) {
        //Member를 생성
        Member member = new Member(1, "회원01");
        //Model에 데이터 추가
        model.addAttribute("name", "이순신");
        model.addAttribute("mb", member);
        //반환값으로 뷰 이름을 설정
        return "useThymeleaf";
    }
}
