package br.com.senac.atividadeuc10_3jpa.gui;

import br.com.senac.atividadeUC10_3jpa2023.persistencia.Podcast;
import br.com.senac.atividadeUC10_3jpa2023.persistencia.PodcastDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Marcelo Oliveira
 */
public class ScreenListagem extends javax.swing.JFrame {

	private int permissao;
	private String tipoPermissao;
	private String nomeUser;

	public ScreenListagem() {
		initComponents();
		setLocationRelativeTo(null);
		List<Podcast> podcasts = buscaDados();
		preenche(podcasts);
	}

	/**
	 * Método para dar as boas vindas ao usuário.
	 * @param nomeUser
	 * @param tipoPermissao
	 */
	public void boasVindas(String nomeUser, String tipoPermissao) {

		nomeUser = jblUsuario.getText();
		tipoPermissao = jblTipoUsuario.getText();

			JOptionPane.showMessageDialog
		  (null, "Olá " + nomeUser + ", sua permissão é de " + tipoPermissao + "."
				  + "\n Seja bem-vindo!", "Boas Vindas!", JOptionPane.INFORMATION_MESSAGE);

	}

	/**
	 * Defina a permissão do usuário e atualize a interface do usuário em conformidade.
	 * @param id
	 * @param nomeUser
	 */
	public void checkPermissao(int id, String nomeUser) {

		jblUsuario.setText(nomeUser);

		this.permissao = id;

		if (permissao == 3) {

			tipoPermissao = "Usuário";

			btnCadastrar.setVisible(false);
			btnExcluir.setVisible(false);
			jblTipoUsuario.setText(tipoPermissao);

		} else if (permissao == 2) {

			tipoPermissao = "Operador";
			jblTipoUsuario.setText(tipoPermissao);
			btnExcluir.setVisible(false);

		} else if (permissao == 1) {

			tipoPermissao = "Administrador";
			jblTipoUsuario.setText(tipoPermissao);
		}

	}

	/**
	 * Busca dados de podcast com base no texto de pesquisa fornecido
	 * e retorna uma lista de Podcasts correspondente.
	 * @return Uma lista de objetos Podcast correspondente aos dados de pesquisa fornecidos
	 */
	private List<Podcast> buscaDados() {
		PodcastDAO podcastDAO = new PodcastDAO();
		List<Podcast> podcast = podcastDAO.listar(txtPesquisaPodcast.getText());

		return podcast;
	}

	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel4 = new javax.swing.JLabel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      txtPesquisaPodcast = new javax.swing.JTextField();
      jPanel2 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      tblPodcast = new javax.swing.JTable();
      btnCadastrar = new javax.swing.JButton();
      jLabel3 = new javax.swing.JLabel();
      jblUsuario = new javax.swing.JLabel();
      btnExcluir = new javax.swing.JButton();
      jblTipoUsuario = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("CENAFLIX - Listagem");

      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro de Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

      jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
      jLabel4.setText("CENAFLIX");

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabel1.setText("LISTAGEM");

      jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
      jLabel2.setText("Pesquisar podcast por produtor:");

      txtPesquisaPodcast.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
      txtPesquisaPodcast.addCaretListener(new javax.swing.event.CaretListener() {
         public void caretUpdate(javax.swing.event.CaretEvent evt) {
            txtPesquisaPodcastCaretUpdate(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(298, 298, 298)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                     .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(37, 37, 37)
                  .addComponent(jLabel2)
                  .addGap(37, 37, 37)
                  .addComponent(txtPesquisaPodcast, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(182, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel1)
            .addGap(27, 27, 27)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(txtPesquisaPodcast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Analitico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

      tblPodcast.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "ID", "Produtor", "Nome do Episódio", "N° Episódio", "Duração (minutos)", "URL do Repositório"
         }
      ));
      jScrollPane1.setViewportView(tblPodcast);

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jScrollPane1)
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      btnCadastrar.setBackground(new java.awt.Color(14, 73, 240));
      btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      btnCadastrar.setText("CADASTRAR");
      btnCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCadastrarActionPerformed(evt);
         }
      });

      jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
      jLabel3.setText("Usuário:");

      jblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

      btnExcluir.setBackground(java.awt.Color.red);
      btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      btnExcluir.setText("EXCLUIR");
      btnExcluir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btnExcluir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnExcluirActionPerformed(evt);
         }
      });

      jblTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

      jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
      jLabel5.setText("Tipo Permissão:");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addContainerGap())
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(38, 38, 38)
                  .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(54, 54, 54))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(0, 0, Short.MAX_VALUE))))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnCadastrar)
               .addComponent(btnExcluir))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel3)
               .addComponent(jblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel5)
               .addComponent(jblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

		dispose();
		ScreenCadastro screenCadas = new ScreenCadastro();
		nomeUser = jblUsuario.getText();
		screenCadas.checkPermissao(permissao, nomeUser);
		screenCadas.setVisible(true);


   }//GEN-LAST:event_btnCadastrarActionPerformed

   private void txtPesquisaPodcastCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPesquisaPodcastCaretUpdate

		List<Podcast> podcasts = buscaDados();
		preenche(podcasts);


   }//GEN-LAST:event_txtPesquisaPodcastCaretUpdate

   private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

		excluir();

   }//GEN-LAST:event_btnExcluirActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ScreenListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ScreenListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ScreenListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ScreenListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ScreenListagem().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnCadastrar;
   private javax.swing.JButton btnExcluir;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JLabel jblTipoUsuario;
   private javax.swing.JLabel jblUsuario;
   private javax.swing.JTable tblPodcast;
   private javax.swing.JTextField txtPesquisaPodcast;
   // End of variables declaration//GEN-END:variables

	/**
	 * Preenche uma tabela com dados de podcast fornecidos por meio de uma lista de Podcasts.
	 * @param podcasts uma lista de objetos Podcast contendo os dados a serem exibidos na tabela
	 */
	public void preenche(List<Podcast> podcasts) {

		String columns[] = {"ID", "Produtor", "Nome do Episódio", "N° Episódio", "Duração (Minutos)",
			"Url do Repositório"};

		String dados[][] = new String[podcasts.size()][columns.length];

		int i = 0;
		for (Podcast p : podcasts) {

			dados[i] = new String[]{
				String.valueOf(p.getId()),
				p.getProdutor(),
				p.getNomeEpsodio(),
				String.valueOf(p.getNumeroEpsodio()),
				String.valueOf(p.getDuracao()),
				p.getUrlRepositorio()};
			i++;
		}

		DefaultTableModel model = new DefaultTableModel(dados, columns);
		tblPodcast.setModel(model);

	}

	/**
	 * Exclui um registro de podcast selecionado pelo usuário na tabela exibida na interface gráfica.
	 */
	public void excluir() {

		try {

			if (tblPodcast.getSelectedRow() >= 0) {

				String id = (String) tblPodcast.getValueAt(tblPodcast.getSelectedRow(), 0);
				int resposta = JOptionPane.showOptionDialog(
						  this,
						  "Deseja excluir este Podcast de ID n° " + id + "?",
						  "Confirmação",
						  JOptionPane.YES_NO_OPTION,
						  JOptionPane.QUESTION_MESSAGE,
						  null,
						  new String[]{"SIM", "NÃO"},"Não");

				if (resposta == 0) {

					PodcastDAO podcastDAO = new PodcastDAO();
					podcastDAO.deletar(Integer.parseInt(id));
					JOptionPane.showMessageDialog(null, "Podcast EXCLUÍDO com sucesso",
							  "Confirmação",JOptionPane.INFORMATION_MESSAGE);

					List<Podcast> podcasts = buscaDados();
					preenche(podcasts);
				}

			}

		} catch (Exception e) {

			JOptionPane.showMessageDialog(this, "Ocorreu uma falha ao excluir:\n" + e.getMessage());

		}

	}
}
