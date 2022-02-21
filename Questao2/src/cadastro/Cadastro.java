package cadastro;

import java.util.Scanner;

public class Cadastro {

	public static final int LENGHT_SENHA = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cadastro cadastro = new Cadastro();
		cadastro.verificaSenha();
	}

	private void verificaSenha() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Digite uma senha: ");

			String str = input.nextLine();

			if (isSenhaValida(str)) {
				System.out.println("Senha segura");
			} else {
				System.out.println("Não é uma senha segura");
			}
		}
	}

	private boolean isSenhaValida(String password) {
		
		boolean temSeis = false;
		boolean temNumero = false;
		boolean temCaracterEspecial = false;
		boolean temMaior = false;
		boolean temMenor = false;
		int tamanhoSenha = 0;
		

		if (password.length() >= LENGHT_SENHA) {
            temSeis = true;

			for (int i = 0; i < password.length(); i++) {
				char ch = password.charAt(i);
				
                if(!temNumero)
				temNumero =isNumero(ch);
                
                if(!temCaracterEspecial)
				temCaracterEspecial = isCaracterEspecial(ch);
                
                if(!temMaior)
                temMaior = isMaiusculo(ch);
                
                if(!temMenor)
                temMenor = isMinusculo(ch);
			}
		}else {
			tamanhoSenha = LENGHT_SENHA - password.length() ;
		}
		if (!temSeis) {
			System.out.println("Faltam " + tamanhoSenha + " caracteres para senha segura.");
		}
		if(!temNumero) {
		System.out.println("A senha precisa ter no mínimo 1 dígito.");
		}
		if (!temMaior) {
			System.out.println("A senha precisa ter no mínimo 1 letra em maíscula.");
		}
		if (!temMenor) {
			System.out.println("A senha precisa ter no mínimo 1 letra em minúscula.");
		}
		if (!temCaracterEspecial) {
			System.out.println("A senha precisa ter no mínimo 1 caractere especial.");
		}
		return (temSeis && temNumero && temMaior && temMenor && temCaracterEspecial);
	}

	// Verifica se tem letra maíscula
	private boolean isMaiusculo(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	// Verifica se tem letra minúscula
	private boolean isMinusculo(char ch) {
		return (ch >= 'a' && ch <= 'z');
	}

	// Verifica se tem número
	private boolean isNumero(char ch) {
		return (ch >= '0' && ch <= '9');
	}

	// Verifica se tem carater especial
	private boolean isCaracterEspecial(char ch) {
		return (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*'
				|| ch == '(' || ch == ')' || ch == '-' || ch == '_' || ch == '+');
	}
}
