package ReinoAnimal;

/**
 * 
 * Esta classe é uma representação de um animal.
 * 
 * @author Camily Vitoria tenorio pereira
 *
 */

public class Animal {

	private String especie;
	private String sexo;
	private String DataNascimento;

	private static int contador;
	String dados;

	public void comer() {

		/**
		 * Informa que o animal está comendo
		 * 
		 * 
		 */

		System.out.println("O anaimal está comendo...");

	}

	public void perfil() {

		/**
		 * exibe os dados do animal
		 * 
		 * @since 19/11/2023
		 */
		dados = "Espécie: " + especie + " | " + "Sexo: " + sexo + " | " + "Data de nascimento: " + DataNascimento;

		System.out.println(dados);
	}

	private static void count() {

		/**
		 * Aumenta o valor da variável contador em 1 unidade quando invocado no construtor da classe, sendo utilizado para registrar 
		 * a quantidade de animais.
		 *
		 * 
		 * 
		 */

		contador++;
	}

	/**
	 * Construtor da classe Animal
	 * 
	 * @param especie
	 * @param sexo
	 * @param dataNascimento
	 */

	public Animal(String especie, String sexo, String dataNascimento) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.DataNascimento = dataNascimento;

		/**
		 * Ao término, invocamos o método "count" para aumentar o número de animais instanciados.
		 */
		count();
	}

	public static int quantidade() {

		/**
		 *Exibe o número de animais criados.
		 * 
		 * @return a quantidade de animais criados
		 * 
		 * 
		 */

		return contador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String string) {
		DataNascimento = string;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador + 1;
	}

}
