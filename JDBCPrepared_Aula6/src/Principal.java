import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.treinamento.dao.UsuarioDao;
import br.com.treinamento.model.Usuario;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L; // L significa que é o tipo Long (Padrão)

	// * -- Labels -- *
	private JLabel l_nome;
	private JLabel l_email;
	private JLabel l_login;
	private JLabel l_senha;

	// * -- Inputs -- *
	private JTextField nome;
	private JTextField email;
	private JTextField login;
	private JTextField senha;

	// * -- Botões -- *
	private JButton salvar;
	private JButton deletar;
	private JButton pesquisar;
	private JButton editar;

	public Principal() {

		// * -- Tela de cadastro users -- *

		super("CADASTRAR USUARIO");

		l_nome = new JLabel("Nome: ");
		l_nome.setToolTipText("Digite o nome");
		l_nome.setBounds(40, 10, 100, 30);
		add(l_nome);
		nome = new JTextField();
		nome.setBounds(90, 10, 250, 30);
		add(nome);

		l_email = new JLabel("Email: ");
		l_email.setToolTipText("Digite o email");
		l_email.setBounds(40, 60, 100, 30);
		add(l_email);
		email = new JTextField();
		email.setBounds(90, 60, 250, 30);
		add(email);

		l_login = new JLabel("Login: ");
		l_login.setToolTipText("Digite o login");
		l_login.setBounds(40, 110, 100, 30);
		add(l_login);
		login = new JTextField();
		login.setBounds(90, 110, 250, 30);
		add(login);

		l_senha = new JLabel("Senha: ");
		l_senha.setToolTipText("Digite a senha");
		l_senha.setBounds(40, 160, 100, 30);
		add(l_senha);
		senha = new JTextField();
		senha.setBounds(90, 160, 250, 30);
		add(senha);

		salvar = new JButton("Salvar");
		salvar.setBounds(30, 270, 340, 40);
		add(salvar);

		pesquisar = new JButton("Lista Usuários");
		pesquisar.setToolTipText("Lista Usuários");
		pesquisar.setBounds(30, 230, 100, 30);
		add(pesquisar);

		editar = new JButton("Atualizar");
		editar.setBounds(150, 230, 100, 30);
		add(editar);

		deletar = new JButton("Deletar");
		deletar.setBounds(270, 230, 100, 30);
		add(deletar);

		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(420, 400); // Tamanho da janela (larg X alt)
		setVisible(true);

		// * -- Ações Botões -- *

		// ------------------------------ SALVAR ----------------------------------
		salvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (!nome.getText().isEmpty() && !email.getText().isEmpty() && !login.getText().isEmpty() && !senha.getText().isEmpty()) {
					Usuario obj1 = new Usuario();

					obj1.setNome(nome.getText());
					obj1.setEmail(email.getText());
					obj1.setLogin(login.getText());
					obj1.setSenha(senha.getText());

					try {
						UsuarioDao metodo = new UsuarioDao();
						metodo.inserir(obj1);
						JOptionPane.showMessageDialog(null, "Usuário inderido com sucesso !");
						nome.setText("");
						email.setText("");
						login.setText("");
						senha.setText("");

					} catch (Exception e1) {
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos para salvar um Usuário novo!");
				}

			}
		});

		// ------------------------------ DELETAR ----------------------------------
		deletar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					Integer idUsuario = Integer
							.parseInt(JOptionPane.showInputDialog("Informe o ID do usuário a ser excluído."));

					UsuarioDao metodo = new UsuarioDao();
					metodo.excluir(idUsuario);

					JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
					nome.setText("");
					email.setText("");
					login.setText("");
					senha.setText("");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,
							"Usuário não encontrado!\nVerifique a Lista de Usuários e informe um ID válido.");
					e1.printStackTrace();
				}

			}
		});

		// ------------------------------ ATUALIZAR ----------------------------------
		editar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					Integer idUsuario = Integer
							.parseInt(JOptionPane.showInputDialog("Informe o ID do usuário a ser alterado:"));

					if (!email.getText().isEmpty() && !login.getText().isEmpty() && !senha.getText().isEmpty()) {
						try {
							Usuario obj1 = new Usuario();
							obj1.setEmail(email.getText());
							obj1.setLogin(login.getText());
							obj1.setSenha(senha.getText());

							UsuarioDao metodo = new UsuarioDao();
							metodo.atualizar(obj1, idUsuario);

							JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso !");
							nome.setText("");
							email.setText("");
							login.setText("");
							senha.setText("");

						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, "Usuário não encontrado!\nTente novamente.");
							e1.printStackTrace();
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"Operação cancelada.\nAs informações a serem atualizadas (Email, Login, Senha) são obrigatórias!");
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,
							"Usuário não encontrado!\nVerifique a Lista de Usuários e informe um ID válido.");
					e1.printStackTrace();
				}

			}

		});

		// ------------------------------ LISTAR ----------------------------------
		pesquisar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					UsuarioDao metodo = new UsuarioDao();
					metodo.listar();
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});

	}

	public static void main(String[] args) throws Exception {

		new Principal();

	}

}
