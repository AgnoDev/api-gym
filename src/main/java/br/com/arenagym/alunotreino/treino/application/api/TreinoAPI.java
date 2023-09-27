package br.com.arenagym.alunotreino.treino.application.api;

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

        @GetMapping
        @ResponseStatus(code = HttpStatus.OK)
        List<TreinoListResponse> getTreinosDoAluno(@PathVariable UUID idAluno);

        @GetMapping(value = "/{idTreino}")
        @ResponseStatus(code = HttpStatus.OK)
        TreinoResponseId getTreinoById(@PathVariable UUID idAluno, @PathVariable UUID idTreino);

        @DeleteMapping(value = "/{idTreino}")
        @ResponseStatus(code = HttpStatus.NO_CONTENT)
        void deleteTreinoById(@PathVariable UUID idAluno, @PathVariable UUID idTreino);

        @PatchMapping(value = "/{idTreino}")
        @ResponseStatus(code = HttpStatus.NO_CONTENT)
        void patchTreino(@PathVariable UUID idAluno, @PathVariable UUID idTreino, @Valid
        @RequestBody TreinoPatchRequest treinoPatchRequest);
}
