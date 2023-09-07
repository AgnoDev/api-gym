package br.com.arenagym.alunotreino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/home")
public class AlunoTreinoApplication {
	@GetMapping
	public String getHomeTest(){
		return "API HOME: ArenaGym - AlunoTreino";
	}

	public static void main(String[] args) {
		SpringApplication.run(AlunoTreinoApplication.class, args);
	}

}
