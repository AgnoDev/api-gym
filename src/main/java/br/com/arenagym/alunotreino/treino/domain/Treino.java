package br.com.arenagym.alunotreino.treino.domain;

import br.com.arenagym.alunotreino.treino.application.api.TreinoRequest;
import jakarta.persistence.*;
import jakarta.validation.Valid;
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
    @NotNull
    private UUID idAlunoRef;
    @NotBlank
    private String nomeTreino;
    @Enumerated(EnumType.STRING)
    private Exercicio exercicio;
    @NotNull
    private LocalDate dataInicio;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaAtualizacao;

    public Treino(UUID idAluno, @Valid TreinoRequest treinoRequest){
        this.idAlunoRef = idAluno;
        this.nomeTreino = treinoRequest.getPeriodico();
        this.exercicio = treinoRequest.getExercicio();
        this.dataInicio = treinoRequest.getDataInicio();
        this.dataHoraDoCadastro = LocalDateTime.now();
    }

}
