package br.com.arenagym.alunotreino.aluno.application.api;

import br.com.arenagym.alunotreino.aluno.domain.Sexo;
import lombok.Value;

import java.time.LocalDate;
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
    private LocalDate dataHoraDoCadastro;
}
