package br.com.senac.atividadeUC10_3jpa2023.persistencia;

import com.google.protobuf.Any;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 * @author Marcelo Oliveira
 */
public class PodcastDAO {

	/**
	 * Método para receber o Objeto tipo Podcast para salvar no Banco de Dados
	 *
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

	/**
	 * Lista os podcasts de acordo com o produtor informado.
	 * @param pesqProdutor o produtor a ser pesquisado (pode ser nulo)
	 * @return uma lista de objetos do tipo Podcast que correspondem à pesquisa
	 */
	public List<Podcast> listar(String pesqProdutor) {

		EntityManager em = JPAUtil.getEntityManager();
		List podcast = null;

		try {
			String textoQuery = "SELECT p FROM Podcast p "
					  + "WHERE (:produtor is null OR p.produtor LIKE :produtor)";
			Query consulta = em.createQuery(textoQuery);

			consulta.setParameter("produtor", pesqProdutor.isEmpty() ? null : "%"
					  + pesqProdutor + "%");
			podcast = consulta.getResultList();

		} finally {

			JPAUtil.closeEtityManager();

		}

		return podcast;

	}
	
	/**
	 * Deleta um Podcast pelo seu ID.
	 * @param id o ID do Podcast a ser deletado
	 */
	public void deletar(int id){
		
		EntityManager em = JPAUtil.getEntityManager();
		
		try {
			
			Podcast p = em.find(Podcast.class, id);
			
			if (p != null) {
				
				em.getTransaction().begin();
				em.remove(p);
				em.getTransaction().commit();
				
			}				  
	
		} catch (Exception e) {
			
			em.getTransaction().rollback();
			throw e;
			
		} finally {
			
			JPAUtil.closeEtityManager();
			
		}
	}

}
