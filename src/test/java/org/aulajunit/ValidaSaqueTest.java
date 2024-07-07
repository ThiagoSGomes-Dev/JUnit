package org.aulajunit;

import org.aulajunit.service.ValidaSaque;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidaSaqueTest {

    private ValidaSaque bancoDigital;

    @BeforeEach
    public void setUp() {
        bancoDigital = new ValidaSaque("João", 2000.00);
    }

    @Test
    public void testDepositar() {
        bancoDigital.depositar(500.0);
        assertEquals(new BigDecimal("2500.00"), bancoDigital.getSaldo());
    }
}
