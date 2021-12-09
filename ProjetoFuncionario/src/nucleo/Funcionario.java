package nucleo;

public class Funcionario {
	private int numeroFuncional;
	private String nome;
	private String cargo;
	private double salario;

	public Funcionario(int numeroFuncional, String nome, String cargo, double salario) {
		super();
		this.numeroFuncional = numeroFuncional;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	public int getNumeroFuncional() {
		return numeroFuncional;
	}

	public void setNumeroFuncional(int numeroFuncional) {
		this.numeroFuncional = numeroFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void mostrarDados() {
		System.out.println("nome: " + nome);
		System.out.println("funcional: " + numeroFuncional);
		System.out.println("cargo: " + cargo);
		System.out.println("salário: " + salario);
	}

	public void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
	}
}
