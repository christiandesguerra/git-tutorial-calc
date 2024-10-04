package com.example.git_tutorial.controller;

import com.example.git_tutorial.service.CalculatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class CalculatorController {
    private final CalculatorService calculatorService;

    @GetMapping("/add/{firstNum}/{secondNum}")
    public Integer add(Integer firstNum, Integer secondNum) {
        return calculatorService.add(firstNum, secondNum);
    }
}
