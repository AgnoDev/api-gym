package br.com.arenagym.alunotreino.aluno.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/aluno")
public interface AlunoAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    AlunoResponse postAluno(@Valid @RequestBody AlunoRequest alunoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<AlunoListResponse> getAllAluno();

    @GetMapping(value = "/{idAluno}")
    @ResponseStatus(code = HttpStatus.OK)
    AlunoResponseId getAlunoById(@PathVariable UUID idAluno);
}
