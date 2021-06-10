package br.com.projetoInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BotaoSaveService extends JFrame {
	
	static JButton botaoSave; //Criação do botão

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BotaoSaveService janela = new BotaoSaveService();
		
		botaoSave = new JButton("Salvar");
		botaoSave.setBounds(10,20,130,40);
		
		// Adição de ação da utilização do botão
		botaoSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(null, "Botão Clicado !");
				
			}
		});
		

		janela.add(botaoSave);
		janela.setTitle("Criando Botões");
		janela.setSize(400,400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		janela.setLayout(null);
		
	}

}
