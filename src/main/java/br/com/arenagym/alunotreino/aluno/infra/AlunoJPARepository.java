package br.com.arenagym.alunotreino.aluno.infra;

import br.com.arenagym.alunotreino.aluno.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface AlunoJPARepository extends JpaRepository<Aluno, UUID> {
}
