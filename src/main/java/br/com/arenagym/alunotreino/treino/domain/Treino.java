package br.com.arenagym.alunotreino.treino.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Treino {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idTreino", updatable = false, unique = true, nullable = false)
    private UUID idTreino;
    @NotBlank
    private String nomeTreino;
    @Enumerated(EnumType.STRING)
    private Exercicio exercicio;
    @NotNull
    private LocalDate dataInicio;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaAtualizacao;

}
