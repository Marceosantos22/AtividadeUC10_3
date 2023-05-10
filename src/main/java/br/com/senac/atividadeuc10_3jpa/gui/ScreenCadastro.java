package br.com.senac.atividadeuc10_3jpa.gui;

import br.com.senac.atividadeUC10_3jpa2023.persistencia.Podcast;
import br.com.senac.atividadeUC10_3jpa2023.persistencia.PodcastDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo Oliveira
 */


public class ScreenCadastro extends javax.swing.JFrame {

	private int permissao;
	private String tipoPermissao;
	
	
	public ScreenCadastro() {
		initComponents();
		setLocationRelativeTo(null);

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
			jblTipoUsuario.setText(tipoPermissao);

		} else if (permissao == 2) {

			tipoPermissao = "Operador";
			jblTipoUsuario.setText(tipoPermissao);

		} else if (permissao == 1) {

			tipoPermissao = "Administrador";
			jblTipoUsuario.setText(tipoPermissao);
		}

	}

	
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jblProdutor = new javax.swing.JLabel();
      jblNomeEpisodio = new javax.swing.JLabel();
      txtNomeEpisodio = new javax.swing.JTextField();
      txtNumeroEpisodio = new javax.swing.JTextField();
      jblNumeroEpisodio = new javax.swing.JLabel();
      txtProdutor = new javax.swing.JTextField();
      jblDuracao = new javax.swing.JLabel();
      jblUrl = new javax.swing.JLabel();
      txtUrl = new javax.swing.JTextField();
      btnCadastrar = new javax.swing.JButton();
      btnVerListagem = new javax.swing.JButton();
      jLabel8 = new javax.swing.JLabel();
      txtDuracao = new javax.swing.JTextField();
      jLabel9 = new javax.swing.JLabel();
      jblUsuario = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jblTipoUsuario = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("CENAFLIX - Cadastro");

      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
      jLabel1.setText("CENAFLIX");

      jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
      jLabel2.setText("CADASTRAR PODCAST");

      jblProdutor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
      jblProdutor.setText("Produtor:");

      jblNomeEpisodio.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
      jblNomeEpisodio.setText("Nome do Episódio:");

      txtNomeEpisodio.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

      txtNumeroEpisodio.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
      txtNumeroEpisodio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

      jblNumeroEpisodio.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
      jblNumeroEpisodio.setText("N° do Episódio:");

      txtProdutor.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

      jblDuracao.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
      jblDuracao.setText("Duração:");

      jblUrl.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
      jblUrl.setText("URL do repositório:");

      btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      btnCadastrar.setText("CADATRAR");
      btnCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCadastrarActionPerformed(evt);
         }
      });

      btnVerListagem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      btnVerListagem.setText("VER LISTAGEM");
      btnVerListagem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btnVerListagem.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnVerListagemActionPerformed(evt);
         }
      });

      jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
      jLabel8.setText("Minutos");

      txtDuracao.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
      txtDuracao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2)
            .addGap(227, 227, 227))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jblProdutor)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtProdutor, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jblNomeEpisodio)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jblUrl)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtUrl))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jblNumeroEpisodio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jblDuracao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(158, 158, 158)
            .addComponent(btnCadastrar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVerListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(136, 136, 136))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addGap(33, 33, 33)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jblProdutor)
               .addComponent(jblNomeEpisodio)
               .addComponent(txtNomeEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtProdutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(23, 23, 23)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jblNumeroEpisodio)
               .addComponent(txtNumeroEpisodio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel8)
               .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jblDuracao))
            .addGap(31, 31, 31)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jblUrl)
               .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnCadastrar)
               .addComponent(btnVerListagem))
            .addContainerGap())
      );

      jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
      jLabel9.setText("Usuário:");

      jblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

      jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
      jLabel5.setText("Tipo Permissão:");
      jLabel5.setToolTipText("aaaaaaaaaaaaaaaa");

      jblTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel9)
               .addComponent(jblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jblTipoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
		if(!empty()){
		
			cadastrar();
			limpacampos();
			
		}
   }//GEN-LAST:event_btnCadastrarActionPerformed

   private void btnVerListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerListagemActionPerformed

		dispose();
		ScreenListagem screenList = new ScreenListagem();
		String nomeUser = jblUsuario.getText();
		
		screenList.checkPermissao(permissao,nomeUser);
		screenList.setVisible(true);

   }//GEN-LAST:event_btnVerListagemActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ScreenCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ScreenCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ScreenCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ScreenCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		

	
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ScreenCadastro().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnCadastrar;
   private javax.swing.JButton btnVerListagem;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JLabel jblDuracao;
   private javax.swing.JLabel jblNomeEpisodio;
   private javax.swing.JLabel jblNumeroEpisodio;
   private javax.swing.JLabel jblProdutor;
   private javax.swing.JLabel jblTipoUsuario;
   private javax.swing.JLabel jblUrl;
   private javax.swing.JLabel jblUsuario;
   private javax.swing.JTextField txtDuracao;
   private javax.swing.JTextField txtNomeEpisodio;
   private javax.swing.JTextField txtNumeroEpisodio;
   private javax.swing.JTextField txtProdutor;
   private javax.swing.JTextField txtUrl;
   // End of variables declaration//GEN-END:variables

	
	
	/**
	 * Verifica se os campos de cadastro de podcast estão vazios.
	 * @return Retorna true se algum campo estiver vazio e exibe uma
	 * mensagem informando qual campo está faltando
	 * @return false se todos os campos estiverem preenchidos.
	 */
	public boolean empty(){
		
		
		boolean empty = true;
		
		if(txtProdutor.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"Informe o nome do Produtor",
					  "Registro de dados", JOptionPane.INFORMATION_MESSAGE);
			
		} else if (txtNomeEpisodio.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"Informe o nome do Episódio",
					  "Registro de dados", JOptionPane.INFORMATION_MESSAGE);
			
		} else if (txtNumeroEpisodio.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"Informe o número do Episódio",
					  "Registro de dados", JOptionPane.INFORMATION_MESSAGE);
			
		} else if(txtDuracao.getText().isEmpty()){
			JOptionPane.showMessageDialog(null,"Informe a duração(tempo) do Episódio",
					  "Registro de dados", JOptionPane.INFORMATION_MESSAGE);
			
		} else if (txtUrl.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,"Informe a URL do Episódio",
					  "Registro de dados", JOptionPane.INFORMATION_MESSAGE);
						
		} else{
			
			empty = false;
			
		}
			
		return empty;
		
	}
	
	
	
	
	/**
	 * Cadastra um novo podcast no sistema, utilizando os dados informados
	 * nos campos correspondentes na tela de cadastro.
	 */
	public void cadastrar() {

		Podcast novoPodcast = new Podcast();

		try {

			novoPodcast.setProdutor(txtProdutor.getText());
			novoPodcast.setNomeEpsodio(txtNomeEpisodio.getText());
			novoPodcast.setNumeroEpsodio(Integer.parseInt(txtNumeroEpisodio.getText()));
			novoPodcast.setUrlRepositorio(txtUrl.getText());
			novoPodcast.setDuracao(Integer.parseInt(txtDuracao.getText()));

			PodcastDAO podcastDao = new PodcastDAO();

			podcastDao.input(novoPodcast);
			
			JOptionPane.showMessageDialog
		  (null, "Podcast CADASTRADO com sucesso!",
					 "Confirmação", JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e) {

			JOptionPane.showMessageDialog
		  (this, "Falha ao cadastrar!\n" + e.getMessage(),
					 "ERRO", JOptionPane.ERROR_MESSAGE);

		}
	}
	
	/**
	 * Responsável por limpar os campos de texto do formulário de
	 * cadastro de um novo podcast
	 */
	public void limpacampos() {

		txtProdutor.setText("");
		txtNomeEpisodio.setText("");
		txtNumeroEpisodio.setText("");
		txtDuracao.setText("");
		txtUrl.setText("");

	}

}
