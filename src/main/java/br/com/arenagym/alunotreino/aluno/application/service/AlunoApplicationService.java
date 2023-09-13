package br.com.arenagym.alunotreino.aluno.application.service;

import br.com.arenagym.alunotreino.aluno.application.api.AlunoListResponse;
import br.com.arenagym.alunotreino.aluno.application.api.AlunoRequest;
import br.com.arenagym.alunotreino.aluno.application.api.AlunoResponse;
import br.com.arenagym.alunotreino.aluno.application.repository.AlunoRepository;
import br.com.arenagym.alunotreino.aluno.domain.Aluno;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

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
        log.info("[finish] AlunoApplicationService - getAllAluno");
        return null;
    }
}
