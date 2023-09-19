package br.com.arenagym.alunotreino.aluno.application.service;

import br.com.arenagym.alunotreino.aluno.application.api.*;
import br.com.arenagym.alunotreino.aluno.application.repository.AlunoRepository;
import br.com.arenagym.alunotreino.aluno.domain.Aluno;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class AlunoApplicationService implements AlunoService {
    private final AlunoRepository alunoRepository;

    @Override
    public AlunoResponse postAluno(AlunoRequest alunoRequest) {
        log.info("[start] AlunoApplicationService - postAluno");
        Aluno aluno = alunoRepository.postAluno(new Aluno(alunoRequest));
        log.info("[finish] AlunoApplicationService - postAluno");
        return AlunoResponse.builder().idAluno(aluno.getIdAluno()).build();
    }

    @Override
    public List<AlunoListResponse> getAllAluno() {
        log.info("[start] AlunoApplicationService - getAllAluno");
        List<Aluno> alunos = alunoRepository.getAllAluno();
        log.info("[finish] AlunoApplicationService - getAllAluno");
        return AlunoListResponse.converte(alunos);
    }

    @Override
    public AlunoResponseId getAlunoById(UUID idAluno) {
        log.info("[start] AlunoApplicationService - getAlunoById");
        Aluno aluno = alunoRepository.getAlunoById(idAluno);
        log.info("[finish] AlunoApplicationService - getAlunoById");
        return new AlunoResponseId(aluno);
    }

    @Override
    public void deleteAlunoById(UUID idAluno) {
        log.info("[start] AlunoApplicationService - deleteAlunoById");
        Aluno aluno = alunoRepository.getAlunoById(idAluno);
        alunoRepository.deleteAlunoById(aluno);
        log.info("[finish] AlunoApplicationService - deleteAlunoById");
    }

    @Override
    public void patchAluno(UUID idAluno, AlunoPatchRequest alunoPatchRequest) {
        log.info("[start] AlunoApplicationService - patchAluno");
        Aluno aluno = alunoRepository.getAlunoById(idAluno);
        aluno.atualizaAluno(alunoPatchRequest);
        alunoRepository.postAluno(aluno);
        log.info("[finish] AlunoApplicationService - patchAluno");
    }
}
