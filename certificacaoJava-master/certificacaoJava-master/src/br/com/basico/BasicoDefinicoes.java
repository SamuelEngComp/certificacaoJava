package br.com.basico;

public class BasicoDefinicoes {

	private String nome;
	
	public static void main(String[] args) {
		
		/**
		 * O básico de Java
		 */
		
		/**
		 * 3.1 Defina o escopo de variáveis
		 */
		
		//VARIAVEIS LOCAIS:
		int variavelLocal01 = 20;
		
		for(int i=0; i<5; i++) {
			int variavelLocal02 = 3;
			System.out.println("Variavel local do laco FOR: " + variavelLocal02);
		}
		
		System.out.println("Variavel local do MÉTODO MAIN: " + variavelLocal01);
		
		
		//System.out.println("ERRO : " + variavelLocal02); ERRO!! NÃO TEM COMO TER ACESSO A VARIAVEL LOCAL DO LACO FOR.
		
		
		//Variáveis de instância
		BasicoDefinicoes nome = new BasicoDefinicoes("samuel");
		System.out.println(nome);
		
		System.out.println(" -> ");
		for(int i=0; i<10; i++){
			i++; //dentro do la�o - variavel local
			System.out.println(i);
		}
		System.out.println(" -> ");
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public BasicoDefinicoes(String nome) {
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

}
