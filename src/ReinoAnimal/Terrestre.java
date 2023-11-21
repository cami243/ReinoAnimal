package ReinoAnimal;

/**
 * Esta classe é uma representação de um animal 
 * 
 * @author Camily Vitoria Tenorio Pereira
 *
 */

public class Terrestre extends Animal {

	String regiao;
	boolean pelo;

	/**
	 * Construtor da classe Terrestre
	 * 
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 * @param regiao
	 * @param pelo
	 */

	public Terrestre(String especie, String sexo, String dataNascimento, String regiao, boolean pelo) {
		super(especie, sexo, dataNascimento);
		this.regiao = regiao;
		this.pelo = pelo;
		// TODO Auto-generated constructor stub
	}

	public void mover() {

		/**
		 *Exibe no console a mensagem de que o animal está em movimento.
		 * 
		 *
		 */
		System.out.println("O animal está se movendo...");

	}

	@Override

	public void comer() {

		/**
		 * Informa que o animal está comendo
		 * 
		 * 
		 * 
		 */

		System.out.println("O animal terrestre está comendo...");
	}

	public void perfil() {

		/**
		 * Exibe os dados do animal
		 * 
		 * 
		 * 
		 **/

		super.perfil();
		System.out.println("Pertencente a região: " + regiao +  " | " + "Possui pelo: " + pelo);
		System.out.println();

	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}

}
