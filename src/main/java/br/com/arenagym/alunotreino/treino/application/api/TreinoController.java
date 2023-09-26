package br.com.arenagym.alunotreino.treino.application.api;

import br.com.arenagym.alunotreino.treino.application.service.TreinoService;
import br.com.arenagym.alunotreino.treino.domain.Treino;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class TreinoController implements TreinoAPI {
    private final TreinoService treinoService;

    @Override
    public TreinoResponse postTreino(UUID idAluno, TreinoRequest treinoRequest) {
        log.info("[start] -> TreinoController -> postTreino");
        log.info("[idAluno] {}", idAluno);
        TreinoResponse treino = treinoService.postTreino(idAluno, treinoRequest);
        log.info("[finish] -> TreinoController -> postTreino");
        return treino;
    }

    @Override
    public List<TreinoListResponse> getTreinosDoAluno(UUID idAluno) {
        log.info("[start] -> TreinoController -> getTreinosDoAluno");
        log.info("[idAluno] {}", idAluno);
        List<TreinoListResponse> treinosDoAluno = treinoService.getTreinosDoAluno(idAluno);
        log.info("[finish] -> TreinoController -> getTreinosDoAluno");
        return treinosDoAluno;
    }

    @Override
    public TreinoResponseId getTreinoById(UUID idAluno, UUID idTreino) {
        log.info("[start] -> TreinoController -> getTreinoById");
        log.info("[idAluno] {} - [idTreino] {}", idAluno, idTreino);
        TreinoResponseId treino = treinoService.getTreinoById(idAluno, idTreino);
        log.info("[finish] -> TreinoController -> getTreinoById");
        return treino;
    }
}
