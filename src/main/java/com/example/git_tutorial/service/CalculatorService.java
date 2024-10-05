package com.example.git_tutorial.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Integer add(Integer firstNum, Integer secondNum) {
        return firstNum + secondNum;
    }

    public Integer subtract(Integer firstNum, Integer secondNum) {
        return firstNum - secondNum;
    }
}
