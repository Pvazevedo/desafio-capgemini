package cadastro;

import java.util.Scanner;

/**Classe com algoritmo que verifica se a senha est� cumprindo a regra de valida��o para uma senha segura.
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
				System.out.println("N�o � uma senha segura.");
			}
		}
	}
	
	
	 /**M�todo para verifica��o de senha 
	 * @param senha - senha inserida pelo usu�rio
	 * @return boolean - Valor do resultado da verifica��o de todos os quesitos de valida��o da senha
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
		System.out.println("A senha precisa ter no m�nimo 1 d�gito.");
		}
		if (!temMaior) {
			System.out.println("A senha precisa ter no m�nimo 1 letra em mai�sculo.");
		}
		if (!temMenor) {
			System.out.println("A senha precisa ter no m�nimo 1 letra em min�sculo.");
		}
		if (!temCaracterEspecial) {
			System.out.println("A senha precisa ter no m�nimo 1 caractere especial.");
		}
		return (temSeis && temNumero && temMaior && temMenor && temCaracterEspecial);
	}

	/**M�todo que verifica se possui pelo menos uma letra mai�scula na senha
	 * @param ch - caracter que ser� verificado
	 * @return boolean - Valor do resultado da verifica��o
	 */	
	private boolean isMaiusculo(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}

	/**M�todo que verifica se possui pelo menos uma letra min�scula na senha
	 * @param ch - caracter que ser� verificado
	 * @return boolean - Valor do resultado da verifica��o
	 */
	private boolean isMinusculo(char ch) {
		return (ch >= 'a' && ch <= 'z');
	}

	/**M�todo que verifica se possui pelo menos um d�gito na senha
	 * @param ch - caracter que ser� verificado
	 * @return boolean - Valor do resultado da verifica��o
	 */	private boolean isNumero(char ch) {
		return (ch >= '0' && ch <= '9');
	}

	 /**M�todo que verifica se possui pelo menos um caracter especial
		 * @param ch - caracter que ser� verificado
		 * @return boolean - Valor do resultado da verifica��o
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
