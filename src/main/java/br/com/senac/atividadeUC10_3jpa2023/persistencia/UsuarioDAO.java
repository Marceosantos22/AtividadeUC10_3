package br.com.senac.atividadeUC10_3jpa2023.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

/**
 * @author Marcelo Oliveira
 */
public class UsuarioDAO {

	public Usuario checkLogin(String login, String password) {

		Usuario user = null;

		EntityManager em = JPAUtil.getEntityManager();

		try {

			TypedQuery<Usuario> consulta = em.createQuery("SELECT u FROM Usuario u WHERE"
			+ " u.login = :nomePar AND u.senha = :senhaPar", Usuario.class);
			consulta.setParameter("nomePar", login);
			consulta.setParameter("senhaPar", password);

			if (login.equals(consulta.getSingleResult().getLogin())
					  && password.equals(consulta.getSingleResult().getSenha())) {
				user = consulta.getSingleResult();
			}

		} catch (Exception e) {

			System.out.println("Erro na validação com o Banco de Dados " + e.getMessage());
		}

		return user;
	}

}
