package br.com.arenagym.alunotreino.aluno.infra;

import br.com.arenagym.alunotreino.aluno.application.repository.AlunoRepository;
import br.com.arenagym.alunotreino.aluno.domain.Aluno;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class AlunoInfraRepository implements AlunoRepository {
   private final AlunoJPARepository alunoJPARepository;
    @Override
    public Aluno postAluno(Aluno aluno) {
        log.info("[start] - AlunoInfraRepository - postAluno");
        alunoJPARepository.save(aluno);
        log.info("[finish] - AlunoInfraRepository - postAluno");
        return aluno;
    }

    @Override
    public List<Aluno> getAllAluno() {
        log.info("[start] - AlunoInfraRepository - getAllAluno");
        List<Aluno> getAllAluno = alunoJPARepository.findAll();
        log.info("[finish] - AlunoInfraRepository - getAllAluno");
        return getAllAluno;
    }

    @Override
    public Aluno getAlunoById(UUID idAluno) {
        log.info("[start] - AlunoInfraRepository - getAlunoById");
        log.info("[finish] - AlunoInfraRepository - getAlunoById");
        Aluno aluno = alunoJPARepository.findById(idAluno)
                .orElseThrow(()-> new RuntimeException("Cliente Não Encontrado"));
        return aluno;
    }

    @Override
    public void deleteAlunoById(Aluno aluno) {
        log.info("[start] - AlunoInfraRepository - deleteAlunoById");
        alunoJPARepository.delete(aluno);
        log.info("[finish] - AlunoInfraRepository - deleteAlunoById");


    }
}
