package br.com.arenagym.alunotreino.aluno.application.api;

import br.com.arenagym.alunotreino.aluno.application.service.AlunoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class AlunoController implements AlunoAPI {
    private final AlunoService alunoService;

    @Override
    public AlunoResponse postAluno(AlunoRequest alunoRequest) {
        log.info("[start] AlunoController - postAluno");
        AlunoResponse alunoResponse = alunoService.postAluno(alunoRequest);
        log.info("[finish] AlunoController - postAluno");
        return alunoResponse;
    }

    @Override
    public List<AlunoListResponse> getAllAluno() {
        log.info("[start] AlunoController - getAllAluno");
        List<AlunoListResponse> alunoListResponse = alunoService.getAllAluno();
        log.info("[finish] AlunoController - getAllAluno");
        return alunoListResponse;
    }

    @Override
    public AlunoResponseId getAlunoById(UUID idAluno) {
        log.info("[start] AlunoController - getAlunoById");
        log.info("[idAluno] {}", idAluno);
        AlunoResponseId alunoResponseId = alunoService.getAlunoById(idAluno);
        log.info("[finish] AlunoController - getAlunoById");
        return alunoResponseId;
    }

    @Override
    public void deleteAlunoById(UUID idAluno) {
        log.info("[start] AlunoController - deleteAlunoById");
        log.info("[idAluno] {}", idAluno);
        alunoService.deleteAlunoById(idAluno);
        log.info("[finish] AlunoController - deleteAlunoById");

    }

    @Override
    public void patchAluno(UUID idAluno, AlunoPatchRequest alunoPatchRequest) {
        log.info("[start] AlunoController - patchAluno");
        log.info("[idAluno] {}", idAluno);
        alunoService.patchAluno(idAluno, alunoPatchRequest);
        log.info("[finish] AlunoController - patchAluno");

    }

}
