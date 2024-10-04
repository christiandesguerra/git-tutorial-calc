package com.example.git_tutorial.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
    @InjectMocks
    private CalculatorService calculatorService;

    @Test
    public void add_shouldReturnSum() {
        assertThat(calculatorService.add(1, 1)).isEqualTo(2);
    }
}
