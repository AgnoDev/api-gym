package br.com.arenagym.alunotreino.treino.application.api;

import br.com.arenagym.alunotreino.aluno.application.api.*;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("/v1/aluno/{idAluno}/treino")
public interface TreinoAPI {

        @PostMapping
        @ResponseStatus(code = HttpStatus.CREATED)
        TreinoResponse postTreino(@PathVariable UUID idAluno,
                                  @Valid @RequestBody TreinoRequest treinoRequest);
//
//        @GetMapping
//        @ResponseStatus(code = HttpStatus.OK)
//        List<AlunoListResponse> getAllAluno();
//
//        @GetMapping(value = "/{idAluno}")
//        @ResponseStatus(code = HttpStatus.OK)
//        AlunoResponseId getAlunoById(@PathVariable UUID idAluno);
//
//        @DeleteMapping(value = "/{idAluno}")
//        @ResponseStatus(code = HttpStatus.NO_CONTENT)
//        void deleteAlunoById(@PathVariable UUID idAluno);
//
//        @PatchMapping(value = "/{idAluno}")
//        @ResponseStatus(code = HttpStatus.NO_CONTENT)
//        void patchAluno(@PathVariable UUID idAluno, @Valid
//        @RequestBody AlunoPatchRequest alunoPatchRequest);
}
