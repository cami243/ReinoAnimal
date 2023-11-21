package ReinoAnimal;


/**
 * Esta classe é uma representação de um animal aquático
 * 
 * @author Camily Vitoria Tenorio Pereira
 *
 */

public class Aquatico extends Animal {

	private String tipoAgua;
	private boolean possuiEscamas;

	/**
	 * Construtor da classe Aquatico
	 * 
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 * @param tipoAgua
	 * @param PossuiEscamas
	 */

	public Aquatico(String especie, String sexo, String dataNascimento, String tipoAgua, boolean possuiEscamas) {
		super(especie, sexo, dataNascimento);
		this.tipoAgua = tipoAgua;
		this.possuiEscamas = possuiEscamas;

		// TODO Auto-generated constructor stub
	}

	public void nadar() {

		/**
		 * Imprime no console que o animal está nadando
		 * 
		 * 
		 */
		System.out.println("O animal está nadando...");

	}

	public void comer() {

		System.out.println("O animal aquatico está comendo...");
	}

	@Override
	public void perfil() {

		/**
		 * Exibe o número de animais criados.
		 * 
		 * 
		 * 
		 **/

		super.perfil();
		System.out.println("Tipo de água: " + tipoAgua + " | " + "Possui Escamas: " + possuiEscamas);
		System.out.println(" ");

	}

	public String getTipoAgua() {
		return tipoAgua;
	}

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}

	public boolean isPossuiEscamas() {
		return possuiEscamas;
	}

	public void setPossuiEscama(boolean possuiEscamas) {
		this.possuiEscamas = possuiEscamas;
	}

}
