package org.aulajunit.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidaSaque {
    private String nome;
    private BigDecimal saldo;

    public ValidaSaque(String nome, double saldo) {
        this.nome = nome;
        this.saldo = BigDecimal.valueOf(saldo).setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo = saldo.add(BigDecimal.valueOf(quantia).setScale(2, RoundingMode.HALF_EVEN));
        } else {
            throw new IllegalArgumentException("Quantia de saque inválida.");
        }
    }

    public void sacar(double quantia) {
        BigDecimal quantiaBD = BigDecimal.valueOf(quantia).setScale(2, RoundingMode.HALF_EVEN);
        if(quantia > 0 && saldo.compareTo(quantiaBD) >= 0) {
            saldo = saldo.subtract(quantiaBD);
        } else {
            throw new IllegalArgumentException("Valor para saque é invalido");
        }
    }


    public static void main(String[] args) {
        ValidaSaque bancoDigital = new ValidaSaque("João", 2000.0);
        System.out.println(bancoDigital.getSaldo());
        bancoDigital.sacar(30.0);
        System.out.println(bancoDigital.getSaldo());
        bancoDigital.depositar(30.0);
        System.out.println(bancoDigital.getSaldo());
    }
}
