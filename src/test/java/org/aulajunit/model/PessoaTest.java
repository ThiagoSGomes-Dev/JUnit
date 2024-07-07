package org.aulajunit.model;

import jdk.jfr.Description;
import org.aulajunit.service.ValidaSaque;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

//+55 21 98374-0085
class PessoaTest {
    @Test
        // Todos os métodos JUnit não tem retorno, são (Void).
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDate.of(1997, 5, 10));
        Assertions.assertEquals(27, jessica.getIdade());
    }
}