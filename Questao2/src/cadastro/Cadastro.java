package cadastro;

import java.util.Scanner;

/**Classe com algoritmo que verifica se a senha está cumprindo a regra de validação para uma senha segura.
* @author Paulo Victor
* @version 1.0
*/
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
				System.out.println("Senha segura.");
			} else {
				System.out.println("Não é uma senha segura.");
			}
		}
	}
	
	
	 /**Método para verificação de senha 
	 * @param senha - senha inserida pelo usuário
	 * @return boolean - Valor do resultado da verificação de todos os quesitos de validação da senha
	 */
	private boolean isSenhaValida(String senha) {
		
		boolean temSeis = false;
		boolean temNumero = false;
		boolean temCaracterEspecial = false;
		boolean temMaior = false;
		boolean temMenor = false;
		int tamanhoSenha = 0;
		

		if (senha.length() >= LENGHT_SENHA) {
            temSeis = true;

			for (int i = 0; i < senha.length(); i++) {
				char ch = senha.charAt(i);
				
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
			tamanhoSenha = LENGHT_SENHA - senha.length() ;
		}
		if (!temSeis) {
			System.out.println("Faltam " + tamanhoSenha + " caracteres para senha segura.");
		}
		if(!temNumero) {
		System.out.println("A senha precisa ter no mínimo 1 dígito.");
		}
		if (!temMaior) {
			System.out.println("A senha precisa ter no mínimo 1 letra em maiúsculo.");
		}
		if (!temMenor) {
			System.out.println("A senha precisa ter no mínimo 1 letra em minúsculo.");
		}
		if (!temCaracterEspecial) {
			System.out.println("A senha precisa ter no mínimo 1 caractere especial.");
		}
		return (temSeis && temNumero && temMaior && temMenor && temCaracterEspecial);
	}

	/**Método que verifica se possui pelo menos uma letra maiúscula na senha
	 * @param ch - caracter que será verificado
	 * @return boolean - Valor do resultado da verificação
	 */	
	private boolean isMaiusculo(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	/**Método que verifica se possui pelo menos uma letra minúscula na senha
	 * @param ch - caracter que será verificado
	 * @return boolean - Valor do resultado da verificação
	 */
	private boolean isMinusculo(char ch) {
		return (ch >= 'a' && ch <= 'z');
	}

	/**Método que verifica se possui pelo menos um dígito na senha
	 * @param ch - caracter que será verificado
	 * @return boolean - Valor do resultado da verificação
	 */	private boolean isNumero(char ch) {
		return (ch >= '0' && ch <= '9');
	}

	 /**Método que verifica se possui pelo menos um caracter especial
		 * @param ch - caracter que será verificado
		 * @return boolean - Valor do resultado da verificação
		 */
	 private boolean isCaracterEspecial(char ch) {
		return (ch == '!' || ch == '@' ||
				ch == '#' || ch == '$' ||
				ch == '%' || ch == '^' ||
				ch == '&' || ch == '*' ||
				ch == '(' || ch == ')' || 
				ch == '-' || ch == '_' || ch == '+');
	}
}
