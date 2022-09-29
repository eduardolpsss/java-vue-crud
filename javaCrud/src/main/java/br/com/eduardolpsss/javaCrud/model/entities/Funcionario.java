package br.com.eduardolpsss.javaCrud.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue
	public int id;
	public int idSetor;
	public String setor;
	public String nome;
	public String email;
	public String dataNasc;
	public double salario;

	public Funcionario() {

	}

	public Funcionario(int idSetor, String setor, String nome, String email, String dataNasc, double salario) {
		super();
		this.idSetor = idSetor;
		this.setor = setor;
		this.nome = nome;
		this.email = email;
		this.dataNasc = dataNasc;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdSetor() {
		return idSetor;
	}
	
	public void setIdSetor(int idSetor) {
		this.idSetor = idSetor;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
