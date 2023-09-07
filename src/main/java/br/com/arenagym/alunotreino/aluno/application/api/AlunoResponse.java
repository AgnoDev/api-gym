package br.com.arenagym.alunotreino.aluno.application.api;

import lombok.Value;
import org.hibernate.validator.constraints.UUID;

@Value
public class AlunoResponse {
    private UUID idAluno;
}
