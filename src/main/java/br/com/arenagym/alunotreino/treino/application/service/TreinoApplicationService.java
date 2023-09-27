package br.com.arenagym.alunotreino.treino.application.service;

import br.com.arenagym.alunotreino.aluno.application.service.AlunoService;
import br.com.arenagym.alunotreino.treino.application.api.*;
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
        List<Treino> treinosDoAluno = treinoRepository.getTreinosDoAluno(idAluno);
        log.info("[finish] -> TreinoApplicationService -> getTreinosDoAluno");
        return TreinoListResponse.converte(treinosDoAluno);
    }

    @Override
    public TreinoResponseId getTreinoById(UUID idAluno, UUID idTreino) {
        log.info("[start] -> TreinoApplicationService -> getTreinoById");
        alunoService.getAlunoById(idAluno);
        Treino treino = treinoRepository.getTreinoById(idTreino);
        log.info("[finish] -> TreinoApplicationService -> getTreinoById");

        return new TreinoResponseId(treino);
    }

    @Override
    public TreinoResponseId deleteTreinoById(UUID idAluno, UUID idTreino) {
        log.info("[start] -> TreinoApplicationService -> deleteTreinoById");
        alunoService.getAlunoById(idAluno);
        Treino treino = treinoRepository.getTreinoById(idTreino);
        treinoRepository.deleteTreino(treino);
        log.info("[finish] -> TreinoApplicationService -> deleteTreinoById");

        return null;
    }

    @Override
    public void patchTreinoById(UUID idAluno, UUID idTreino, TreinoPatchRequest treinoPatchRequest) {
        log.info("[start] -> TreinoApplicationService -> patchTreinoById");
        alunoService.getAlunoById(idAluno);
        Treino treino = treinoRepository.getTreinoById(idTreino);
        treino.patchTreinoById(treinoPatchRequest);
        treinoRepository.postTreino(treino);
        log.info("[finish] -> TreinoApplicationService -> patchTreinoById");

    }
}
