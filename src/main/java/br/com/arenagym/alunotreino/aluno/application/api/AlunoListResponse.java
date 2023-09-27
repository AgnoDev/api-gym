package br.com.arenagym.alunotreino.aluno.application.api;

import br.com.arenagym.alunotreino.aluno.domain.Aluno;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class AlunoListResponse { // essa é a resposta que vai pro front

    private UUID idAluno;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;

    public AlunoListResponse(Aluno aluno) { //esse cara alimenta a resposta pro front
        this.idAluno = aluno.getIdAluno();
        this.nomeCompleto = aluno.getNomeCompleto();
        this.cpf = aluno.getCpf();
        this.email = aluno.getEmail();
        this.celular = aluno.getCelular();
    }

    public static List<AlunoListResponse> converte(List<Aluno> alunos) {
        return alunos.stream()      //põe a lista de alunos dominio pra rodar
                .map(AlunoListResponse::new)    //transforma em alunos response
                .collect(Collectors.toList());  // cria nova lista com alunos response
    }
}
