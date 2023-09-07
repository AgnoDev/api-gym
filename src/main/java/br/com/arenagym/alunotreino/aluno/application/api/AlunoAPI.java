package br.com.arenagym.alunotreino.aluno.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/aluno")
public interface AlunoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    AlunoResponse postAluno(@RequestBody AlunoRequest alunoRequest);

}
