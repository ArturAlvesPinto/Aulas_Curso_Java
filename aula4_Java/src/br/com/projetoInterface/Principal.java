package br.com.projetoInterface;

import javax.swing.*;

public class Principal extends JFrame {

	/**
	*
	*/
	private static final long serialVersionUID = 1L; // L significa que é o tipo Long (Padrão)

	private JLabel nome; // JLabel = Título que vem na frente do formulário.
	private JLabel cpf;
	private JTextField txtNome; // input de text
	private JTextField txtCpf;
	private JButton confirmar; // botão
	
	
	public Principal() {

		super("Testando JLabel"); // Chama o construtor da class passando string

		nome = new JLabel("Nome: "); // obj label1 recebe um nome como valor do tipo JLabel
		nome.setToolTipText("Texto de exemplo");
		nome.setBounds(40, 10, 100, 30); // (x, y, largura, altura)
		add(nome); // Adciona o label na janela
		
		//Text field para o nome
		txtNome = new JTextField();
		txtNome.setBounds(90, 10, 160, 30);
		add(txtNome);
		
		
		cpf = new JLabel("CPF: "); 
		cpf.setToolTipText("Digite o CPF");
		cpf.setBounds(40, 40, 100, 30); 
		add(cpf);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(90, 40, 160, 30);
		add(txtCpf);
		
		confirmar = new JButton("Save"); 
		confirmar.setBounds(100, 150, 100, 30); 
		add(confirmar);
				
		setLayout(null); // Estabelece o tipo de layout
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Defini o que fazer quando fecha a janela
		setSize(400, 400); // Tamanho da janela (larg X alt)
		setVisible(true); // Faz aparecer a janela

	}	
	
	public static void main(String args[]) {
		new Principal(); // Cria o objeto da própria janela principal
	}
}