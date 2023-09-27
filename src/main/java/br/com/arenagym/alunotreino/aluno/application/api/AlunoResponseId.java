package br.com.arenagym.alunotreino.aluno.application.api;

import br.com.arenagym.alunotreino.aluno.domain.Aluno;
import br.com.arenagym.alunotreino.aluno.domain.Sexo;
import lombok.Value;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@Value
public class AlunoResponseId {

    private UUID idAluno;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;
    private String telefone;
    private Sexo sexo;
    private Boolean aceitaTermos;
    private LocalDateTime dataHoraDoCadastro;

    public AlunoResponseId(Aluno aluno) {
        this.idAluno = aluno.getIdAluno();
        this.nomeCompleto = aluno.getNomeCompleto();
        this.cpf = aluno.getCpf();
        this.email = aluno.getEmail();
        this.celular = aluno.getCelular();
        this.telefone = aluno.getCelular();
        this.sexo = aluno.getSexo();
        this.aceitaTermos = aluno.getAceitaTermos();
        this.dataHoraDoCadastro = aluno.getDataHoraDoCadastro();
    }
}
