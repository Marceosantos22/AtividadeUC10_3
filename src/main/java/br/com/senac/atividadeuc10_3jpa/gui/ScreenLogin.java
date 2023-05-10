package br.com.senac.atividadeuc10_3jpa.gui;

import br.com.senac.atividadeUC10_3jpa2023.persistencia.Usuario;
import br.com.senac.atividadeUC10_3jpa2023.persistencia.UsuarioDAO;
import javax.swing.JOptionPane;

/**
 * @author Marcelo Oliveira
 */
public class ScreenLogin extends javax.swing.JFrame {

	public ScreenLogin() {
		initComponents();

		setLocationRelativeTo(null); // Para abrir a tela centralizada.

	}

	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jButton1 = new javax.swing.JButton();
      txtLoginNome = new javax.swing.JTextField();
      txtLoginSenha = new javax.swing.JPasswordField();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("CenaFlix - Login");
      setBackground(new java.awt.Color(153, 153, 153));

      jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jLabel1.setText("CENAFLIX");

      jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
      jLabel2.setText("Cenaflix Podcast: a sua plataforma de streaming de áudio.");

      jButton1.setBackground(java.awt.Color.cyan);
      jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jButton1.setText("LOGIN");
      jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      txtLoginNome.setBackground(new java.awt.Color(240, 240, 240));
      txtLoginNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

      txtLoginSenha.setBackground(new java.awt.Color(240, 240, 240));
      txtLoginSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(txtLoginNome, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
               .addComponent(txtLoginSenha))
            .addGap(128, 128, 128))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(178, 178, 178)
                  .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(81, 81, 81)
                  .addComponent(jLabel2))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(185, 185, 185)
                  .addComponent(jLabel1)))
            .addContainerGap(93, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txtLoginNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24)
            .addComponent(jButton1)
            .addContainerGap(22, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		consultaLogin();
   }//GEN-LAST:event_jButton1ActionPerformed

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
			java.util.logging.Logger.getLogger(ScreenLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ScreenLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ScreenLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ScreenLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		

		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ScreenLogin().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JTextField txtLoginNome;
   private javax.swing.JPasswordField txtLoginSenha;
   // End of variables declaration//GEN-END:variables

	
	/**
	 * Realize uma consulta de login e senha do usuário na base de dados
	 * e verifique as permissões de acesso.
	 * Abra a tela de listagem caso o login seja bem-sucedido e exiba
	 * uma mensagem de erro caso tenha causado uma falha.
	 */
	public void consultaLogin() {

		String login = txtLoginNome.getText();
		String senha = String.valueOf(txtLoginSenha.getPassword());

		int permissao = 0;
		String tipoPermissao = "";
		String userName = "";

		if (login.isEmpty() || senha.isEmpty()) {

			JOptionPane.showMessageDialog
		  (null, "Favor preencher os campos Login e Senha corretamente!");

		} else {

			UsuarioDAO user = new UsuarioDAO();
			Usuario userlocalizado = user.checkLogin(login, senha);

			if (userlocalizado == null) {

				JOptionPane.showMessageDialog(null, "Usuário não localizado,"
						  + " acesso negado!");

			} else {

				permissao = userlocalizado.getPermissao();
				userName = userlocalizado.getLogin();

				if (permissao == 1) {

					tipoPermissao = "Administrador";

				} else if (permissao == 2) {

					tipoPermissao = "Operador";

				} else if (permissao == 3) {

					tipoPermissao = "Operador";

				}

				dispose();
				ScreenListagem screenList = new ScreenListagem();
				String nomeUser = txtLoginNome.getText();
				tipoPermissao = tipoPermissao;
				screenList.checkPermissao(permissao,nomeUser);
				screenList.boasVindas(nomeUser, tipoPermissao);
				screenList.setVisible(true);

			}
		}
	}

}
