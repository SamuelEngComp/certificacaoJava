package br.com.basico;

public class BasicoDefinicoes {

	//Variáveis de instância
	/**
	 * Variáveis de instância ou variáveis de objeto são os atributos dos objetos.
	   São declaradas dentro da classe, mas fora de qualquer método ou construtor. Podem ser acessadas por qualquer membro da classe e ficam em escopo
		enquanto o objeto existir
	 */
	private String nome;
	
	
	/**
	 * variáveis que são compartilhadas por todas as instâncias de uma classe usando a palavra chave static
	 * No caso de variáveis static, não precisamos ter uma referência para usá-las e podemos acessá-las diretamente a partir da classe, desde que respeitando as regras de 
	 * visibilidade da variável
	 */
	private static int idade = 27;
	
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
			System.out.println("Variavel local do laco FOR: " + i);
		}
		int i = 15;
		System.out.println(i);
		System.out.println("Variavel local do MÉTODO MAIN: " + variavelLocal01);
		
		
		//System.out.println("ERRO : " + variavelLocal02); ERRO!! NÃO TEM COMO TER ACESSO A VARIAVEL LOCAL DO LACO FOR.
		
		
		
		
		//Variáveis estáticas (class variables)
		System.out.println(idade); //27 -> o mesmo valor q esta no topo
		idade = idade+2;
		System.out.println(idade); //29 -> valor alterado
		
		//OBS: VARIAVEIS ESTÁTICAS E DE INSTANCIA NÃO PODEM TER O MESMO NOME
		//OBS: Também não podemos declarar variáveis locais com o mesmo nome de parâmetros
		
		//Inicio
		System.out.println("Inicio laço for com variaveis estaticas");
		for(new BasicoDefinicoes().idade = 10; new BasicoDefinicoes().idade < 20; new BasicoDefinicoes().idade++) {
			System.out.println(idade);
		}
		System.out.println("Fim laço for com variaveis estaticas");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Variáveis de instância
	public BasicoDefinicoes(String nome) {
		this.nome = nome;
	}
	
	public BasicoDefinicoes() {
	}

	//Variáveis de instância
	public String getNome() {
		return nome;
	}

	//Variáveis de instância
	public void setNome(String nome) {
		this.nome = nome;
	}

}
