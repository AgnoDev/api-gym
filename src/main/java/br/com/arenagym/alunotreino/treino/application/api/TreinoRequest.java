package br.com.arenagym.alunotreino.treino.application.api;

import br.com.arenagym.alunotreino.treino.domain.Exercicio;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class TreinoRequest {

    @NotNull
    private Exercicio exercicio;
    @NotBlank
    private String periodico;
    @NotNull
    private LocalDate dataInicio;

}
