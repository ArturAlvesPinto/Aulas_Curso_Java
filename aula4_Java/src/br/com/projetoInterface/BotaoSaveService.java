package br.com.projetoInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BotaoSaveService extends JFrame {
	
	static JButton botaoSave; //Cria��o do bot�o

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BotaoSaveService janela = new BotaoSaveService();
		
		botaoSave = new JButton("Salvar");
		botaoSave.setBounds(10,20,130,40);
		
		// Adi��o de a��o da utiliza��o do bot�o
		botaoSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(null, "Bot�o Clicado !");
				
			}
		});
		

		janela.add(botaoSave);
		janela.setTitle("Criando Bot�es");
		janela.setSize(400,400);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		janela.setLayout(null);
		
	}

}
