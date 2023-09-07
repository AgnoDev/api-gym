package br.com.arenagym.alunotreino.aluno.domain;

import br.com.arenagym.alunotreino.aluno.application.api.AlunoRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UUID;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
//@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idAluno;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String celular;
    private String telefone;
    private Sexo sexo;
    @NotNull
    private LocalDate dataNascimento;
    @CPF
    private String cpf;
    @NotNull
    private Boolean aceitaTermos;
    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaAtualizacao;

    public Aluno(AlunoRequest alunoRequest) {

        this.nomeCompleto = alunoRequest.getNomeCompleto();
        this.email = alunoRequest.getEmail();
        this.celular = alunoRequest.getCelular();
        this.telefone = alunoRequest.getTelefone();
        this.sexo = alunoRequest.getSexo();
        this.dataNascimento = alunoRequest.getDataNascimento();
        this.cpf = alunoRequest.getCpf();
        this.aceitaTermos = alunoRequest.getAceitaTermos();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}
