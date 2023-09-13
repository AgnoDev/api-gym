package br.com.arenagym.alunotreino.aluno.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class AlunoResponse {
    private UUID idAluno;
}
