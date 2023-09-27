package br.com.arenagym.alunotreino.treino.application.api;

import br.com.arenagym.alunotreino.treino.domain.Exercicio;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class TreinoPatchRequest {
    @NotNull
    private Exercicio exercicio;
    @NotBlank
    private String periodico;
    @NotNull
    private LocalDate dataInicio;
}
