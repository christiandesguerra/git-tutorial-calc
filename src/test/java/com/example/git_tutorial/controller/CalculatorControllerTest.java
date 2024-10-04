package com.example.git_tutorial.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CalculatorControllerTest {
   @Autowired
   private CalculatorController calculatorController;

    @Test
    void add_shouldReturnSum() {
        Integer sum = calculatorController.add(1, 1);
        assertThat(sum).isEqualTo(2);
    }
}
