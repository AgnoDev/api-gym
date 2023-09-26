package br.com.arenagym.alunotreino.treino.application.api;

import br.com.arenagym.alunotreino.treino.domain.Exercicio;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Value
public class TreinoResponseId {
    private UUID idTreino;
    private String nomeTreino;
    private Exercicio exercicio;
    private LocalDate dataInicio;
}

