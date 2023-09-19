package br.com.arenagym.alunotreino.treino.application.api;

import br.com.arenagym.alunotreino.treino.application.service.TreinoService;
import br.com.arenagym.alunotreino.treino.domain.Treino;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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
}
