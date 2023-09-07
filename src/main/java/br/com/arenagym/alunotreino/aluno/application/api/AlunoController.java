package br.com.arenagym.alunotreino.aluno.application.api;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class AlunoController implements AlunoAPI {
    @Override
    public AlunoResponse postAluno(AlunoRequest alunoRequest) {
        log.info("[start] AlunoController - postAluno");
        log.info("[finish] AlunoController - postAluno");
        return null;
    }
}
