package com.example.demo.controller;

import com.example.demo.form.CalcForm;
import com.example.demo.validator.CalcValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class ValidationController {

    @ModelAttribute
    public CalcForm setUpForm() {
        return new CalcForm();
    }

    @GetMapping("show")
    public String showView() {
        return "entry";
    }

    @PostMapping("calc")
    public String confirmView(@Validated CalcForm calcForm, BindingResult bindingResult, Model model) {

        if(bindingResult.hasErrors()) {
            log.info("errors={}", bindingResult);
            return "entry";
        }

        Integer result = calcForm.getLeftNum() + calcForm.getRightNum();

        model.addAttribute("result", result);

        return "confirm";
    }

    //주입
    @Autowired
    CalcValidator calcValidator;

    //커스텀 유효성 검사기 등록
    @InitBinder("calcForm")
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.addValidators(calcValidator);
    }
}
