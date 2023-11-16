package AvaliacaoFormativa;

import AvaliacaoFormativa.Usuario;

public class PrincipalUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario (1,"victor",1234567, "sim", "victorxn");
		System.out.println("id: "+ usuario.getId());
		System.out.println("Nome: " + usuario.getNome());
		System.out.println("senha: "+ usuario.getPassword());
		System.out.println("permissao: " + usuario.getPermissao());
		System.out.println("Usuario: " + usuario.getUsuario());
		
		

	}

}
