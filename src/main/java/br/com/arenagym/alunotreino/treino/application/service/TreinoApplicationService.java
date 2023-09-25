package br.com.arenagym.alunotreino.treino.application.service;

import br.com.arenagym.alunotreino.aluno.application.service.AlunoService;
import br.com.arenagym.alunotreino.treino.application.api.TreinoAPI;
import br.com.arenagym.alunotreino.treino.application.api.TreinoListResponse;
import br.com.arenagym.alunotreino.treino.application.api.TreinoRequest;
import br.com.arenagym.alunotreino.treino.application.api.TreinoResponse;
import br.com.arenagym.alunotreino.treino.domain.Treino;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class TreinoApplicationService implements TreinoService {
    private final AlunoService alunoService;
    private final TreinoRepository treinoRepository;

    @Override
    public TreinoResponse postTreino(UUID idAluno, TreinoRequest treinoRequest) {
        log.info("[start] -> TreinoApplicationService -> postTreino");
        log.info("[idAluno] {}", idAluno);
        alunoService.getAlunoById(idAluno);
        Treino treino = treinoRepository.postTreino(new Treino(idAluno, treinoRequest));
        log.info("[finish] -> TreinoApplicationService -> postTreino");
        return new TreinoResponse(treino.getIdTreino());
    }

    @Override
    public List<TreinoListResponse> getTreinosDoAluno(UUID idAluno) {
        log.info("[start] -> TreinoApplicationService -> getTreinosDoAluno");
        alunoService.getAlunoById(idAluno);
       // Treino treino = treinoRepository.postTreino(new Treino(idAluno, treinoRequest));
        log.info("[finish] -> TreinoApplicationService -> getTreinosDoAluno");
        return null;
    }
}
