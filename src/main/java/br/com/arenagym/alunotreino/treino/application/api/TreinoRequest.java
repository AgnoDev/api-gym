package br.com.arenagym.alunotreino.treino.application.api;

import br.com.arenagym.alunotreino.treino.domain.Exercicio;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Value
public class TreinoRequest {

    @NotBlank
    private String nomeTreino;
    @NotNull
    private Exercicio exercicio;
    @NotNull
    private LocalDate dataInicio;

}
