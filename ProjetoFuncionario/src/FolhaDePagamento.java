import nucleo.Funcionario;

public class FolhaDePagamento {
	public void main(String[] args) {
		Funcionario f1, f2, f3;
		f1 = new Funcionario(1234, "rafael", "programador", 3600);
		f2 = new Funcionario(2345, "francisco", "analista de qualidade", 2900);
		f3 = new Funcionario(3456, "mateus", "engenheiro", 4300);
		/*
		 * f1.setNumeroFuncional(1234); f1.setNome("rafael");
		 * f1.setCargo("programador"); f1.setSalario(3600); f2.setNumeroFuncional(2345);
		 * f2.setNome("francisco"); f2.setCargo("analista de qualidade");
		 * f2.setSalario(2900); f3.setNumeroFuncional(3456); f3.setNome("mateus");
		 * f3.setCargo("engenheiro"); f3.setSalario(4300);
		 */
		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados();
		f1.aumentarSalario(10);
		f1.mostrarDados();
	}
}
