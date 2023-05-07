package br.com.senac.atividadeUC10_3jpa2023.persistencia;

import jakarta.persistence.EntityManager;

/**
 * @author Marcelo Oliveira
 */
public class PodcastDAO {
	
	
	
	/**
	 * Método para receber o Objeto tipo Podcast para salvar no Banco de Dados
	 * @param p 
	 */
	public void input(Podcast p) {

		EntityManager em = JPAUtil.getEntityManager();

		try {

			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();

		} catch (Exception e) {

			em.getTransaction().rollback();
			throw e;

		} finally {

			JPAUtil.closeEtityManager();

		}

	}

}
