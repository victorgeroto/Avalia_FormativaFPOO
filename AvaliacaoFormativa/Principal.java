package AvaliacaoFormativa;

public class Principal {

	public static void main(String[] args) {
		
		Fisica fisica = new Fisica ("Vitinho","567-678-900.98","14252535-9");
		System.out.println("---------------------------");
		System.out.println("Nome: "+ fisica.getNome());
		System.out.println("Cpf: "+ fisica.getCpf());
		System.out.println("Rg: "+ fisica.getRg());

	}

}
