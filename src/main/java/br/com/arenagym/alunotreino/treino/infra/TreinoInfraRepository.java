package br.com.arenagym.alunotreino.treino.infra;

import br.com.arenagym.alunotreino.treino.application.service.TreinoRepository;
import br.com.arenagym.alunotreino.treino.domain.Treino;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class TreinoInfraRepository implements TreinoRepository {
    private final TreinoJPARepository treinoJPARepository;
    @Override
    public Treino postTreino(Treino treino) {
        log.info("[start] -> TreinoInfraRepository -> postTreino");
        treinoJPARepository.save(treino);
        return treino;
    }

    @Override
    public List<Treino> getTreinosDoAluno(UUID idAluno) {
        log.info("[start] -> TreinoInfraRepository -> getTreinosDoAluno");
        //List<Treino> treinos = treinoJPARepository.findByIdAlunoRef(idAluno);
        var treinos = treinoJPARepository.findByIdAlunoRef(idAluno);
        log.info("[finish] -> TreinoInfraRepository -> getTreinosDoAluno");
        return treinos;
    }

    @Override
    public Treino getTreinoById(UUID idTreino) {
        log.info("[start] -> TreinoInfraRepository -> getTreinoById");
        var treino = treinoJPARepository.findById(idTreino)
                .orElseThrow(() ->  new RuntimeException("### Treino Não Encontrado! ###"));
        log.info("[finish] -> TreinoInfraRepository -> getTreinoById");
        return treino;
    }

    @Override
    public void deleteTreino(Treino treino) {
        log.info("[start] -> TreinoInfraRepository -> deleteTreino");
        treinoJPARepository.delete(treino);
        log.info("[finish] -> TreinoInfraRepository -> deleteTreino");

    }
}
