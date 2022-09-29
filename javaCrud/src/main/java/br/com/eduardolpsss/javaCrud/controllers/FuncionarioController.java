package br.com.eduardolpsss.javaCrud.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.eduardolpsss.javaCrud.model.entities.Funcionario;
import br.com.eduardolpsss.javaCrud.model.repositories.FuncionarioRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	// Buscando no banco
	@GetMapping("/")
	List<Funcionario> obterFuncionarios() {
		return funcionarioRepository.findAll();
	}

	// Buscando no banco por id
	@GetMapping("/{id}")
	Funcionario obterUmFuncionario(@PathVariable int id) {
		return funcionarioRepository.findById(id).orElse(null);
	}

	@PostMapping("/")
	Funcionario novoFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
	
	// Inserindo no banco
	@PutMapping("/{id}")
	Funcionario alterarFuncionario(@PathVariable int id, @RequestBody Funcionario funcionario) {
		Funcionario funcionarioAntigo = funcionarioRepository.findById(id).orElse(null);
		funcionarioAntigo.setIdSetor(funcionario.getIdSetor());
		funcionarioAntigo.setSetor(funcionario.getSetor());
		funcionarioAntigo.setNome(funcionario.getNome());
		funcionarioAntigo.setEmail(funcionario.getEmail());
		funcionarioAntigo.setDataNasc(funcionario.getDataNasc());
		funcionarioAntigo.setSalario(funcionario.getSalario());
		return funcionarioRepository.save(funcionarioAntigo);
	}
	
	// Deletando no banco
	@DeleteMapping("/{id}")
	Integer excluirFuncionario(@PathVariable int id) {
		funcionarioRepository.deleteById(id);
		return id;
	}
}
