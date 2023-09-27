package br.com.arenagym.alunotreino.aluno.application.api;

import br.com.arenagym.alunotreino.aluno.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import java.time.LocalDate;

@Value
public class AlunoPatchRequest {
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    @NotBlank
    private String celular;
    private String telefone;
    private Sexo sexo;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private Boolean aceitaTermos;
}
