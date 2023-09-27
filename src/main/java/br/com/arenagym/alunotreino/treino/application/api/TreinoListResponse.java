package br.com.arenagym.alunotreino.treino.application.api;

import br.com.arenagym.alunotreino.aluno.application.api.AlunoListResponse;
import br.com.arenagym.alunotreino.aluno.domain.Aluno;
import br.com.arenagym.alunotreino.treino.domain.Exercicio;
import br.com.arenagym.alunotreino.treino.domain.Treino;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class TreinoListResponse {
    private UUID idTreino;
    private Exercicio exercicio;
    private LocalDate dataInicio;

    public static List<TreinoListResponse> converte(List<Treino> treinosDoAluno) {
        return treinosDoAluno.stream().map(TreinoListResponse::new).collect(Collectors.toList());
    }

    public TreinoListResponse(Treino treino) {
        this.idTreino = treino.getIdTreino();
        this.exercicio = treino.getExercicio();
        this.dataInicio = treino.getDataInicio();
    }
}
