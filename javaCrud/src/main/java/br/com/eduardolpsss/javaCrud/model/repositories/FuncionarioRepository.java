package br.com.eduardolpsss.javaCrud.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.eduardolpsss.javaCrud.model.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
	
	public Iterable<Funcionario> findByNomeContainingIgnoreCase(String parteNome);
}
