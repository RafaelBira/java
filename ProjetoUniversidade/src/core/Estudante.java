package core;

public class Estudante extends Pessoa {
	private int matricola;
	private String curso;

	public Estudante(String nome, String email, String telefone, int matricola, String curso) {
		super(nome, email, telefone);
		this.matricola = matricola;
		this.curso = curso;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	void imprimir() {
		System.out.println("nome: " + nome);
		System.out.println("e-mail: " + email);
		System.out.println("telefone: " + telefone);
		System.out.println("matrícola: " + matricola);
		System.out.println("curso: " + curso);
	}
}
