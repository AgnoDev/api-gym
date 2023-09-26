package br.com.arenagym.alunotreino.treino.infra;

import br.com.arenagym.alunotreino.treino.domain.Treino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TreinoJPARepository extends JpaRepository<Treino, UUID> {
    List<Treino> findByIdAlunoRef(UUID idAlunoRef);
}
