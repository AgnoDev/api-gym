package br.com.arenagym.alunotreino.aluno.domain;

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

    public Aluno(UUID idAluno, String nomeCompleto, String email,
                 String celular, String telefone, Sexo sexo,
                 @NotNull LocalDate dataNascimento, String cpf,
                 @NotNull Boolean aceitaTermos) {
        this.idAluno = idAluno;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.aceitaTermos = aceitaTermos;
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}
