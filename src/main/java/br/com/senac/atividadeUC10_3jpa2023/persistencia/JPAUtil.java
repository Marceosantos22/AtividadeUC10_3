package br.com.senac.atividadeUC10_3jpa2023.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * @author Marcelo Oliveira
 */
public class JPAUtil {

	private static final String PERSISTENCE_UNIT = "Cenaflix-PU";

	private static EntityManager em;
	private static EntityManagerFactory fabrica;

	//cria a entidade se estiver nula e a retorna
	public static EntityManager getEntityManager() {

		if (fabrica == null || !fabrica.isOpen()) {

			fabrica = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);

		}

		if (em == null || !em.isOpen()) //cria se em nulo ou se o entity manager foi fechado
		{
			em = fabrica.createEntityManager();
		}

		return em;
	}

	//fecha o EntityManager e o factory
	public static void closeEtityManager() {
		if (em.isOpen() && em != null) {
			em.close();
			fabrica.close();
		}
	}
}
