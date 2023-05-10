package br.com.senac.atividadeUC10_3jpa2023.persistencia;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



/**
 * @author Marcelo Oliveira
 */

@Entity
public class Podcast {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String produtor;
	private String nomeEpsodio;
	private int numeroEpsodio;
	private int duracao;
	private String urlRepositorio;

	/**
	 * getters e setter
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProdutor() {
		return produtor;
	}

	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}

	public String getNomeEpsodio() {
		return nomeEpsodio;
	}

	public void setNomeEpsodio(String nomeEpsodio) {
		this.nomeEpsodio = nomeEpsodio;
	}

	public int getNumeroEpsodio() {
		return numeroEpsodio;
	}

	public void setNumeroEpsodio(int numeroEpsodio) {
		this.numeroEpsodio = numeroEpsodio;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getUrlRepositorio() {
		return urlRepositorio;
	}

	public void setUrlRepositorio(String urlRepositorio) {
		this.urlRepositorio = urlRepositorio;
	}

}
