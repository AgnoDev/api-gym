package br.com.arenagym.alunotreino.aluno.application.api;

import br.com.arenagym.alunotreino.aluno.domain.Aluno;

import java.util.List;
import java.util.UUID;

public class AlunoListResponse {

    private UUID idAluno;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;

    public static List<AlunoListResponse> converte(List<Aluno> alunos) {
        return null;
    }
}
