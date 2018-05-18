package br.com.db1.start.classe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {
	
	JButton jbDividir, jbMultiplicar, jbSomar, jbSubtrair, jbZerar;	
	JTextField jtNumero1, jtNumero2;
	
	public Double numero1, numero2;
	
	public Calculadora() {
		
		setSize(400, 150);
		setTitle("Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jtNumero1 = new JTextField(15);
		jtNumero2 = new JTextField(15);
		
		jbDividir = new JButton("Divis�o");
		jbMultiplicar = new JButton("Multiplica��o");
		jbSomar = new JButton("Adi��o");
		jbSubtrair = new JButton("Subtra��o");
		jbZerar = new JButton("Zerar");
		
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
		
		getContentPane().add(jtNumero1);
		getContentPane().add(jtNumero2);
		getContentPane().add(jbDividir);
		getContentPane().add(jbMultiplicar);
		getContentPane().add(jbSomar);
		getContentPane().add(jbSubtrair);
		getContentPane().add(jbZerar);
		
		jbDividir.addActionListener(this);
		jbMultiplicar.addActionListener(this);
		jbSomar.addActionListener(this);
		jbSubtrair.addActionListener(this);
		jbZerar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			numero1 = Double.parseDouble(jtNumero1.getText());
			numero2 = Double.parseDouble(jtNumero2.getText());
			
			if (e.getSource() == jbDividir) {
				JOptionPane.showMessageDialog(null, "O resultado da divis�o �: " + (numero1 / numero2));
			}
			if (e.getSource() == jbMultiplicar) {
				JOptionPane.showMessageDialog(null, "O resultado da multiplica��o �: " + (numero1 * numero2));
			}
			if (e.getSource() == jbSomar) {
				JOptionPane.showMessageDialog(null, "O resultado da soma �: " + + (numero1 + numero2));
			}
			if (e.getSource() == jbSubtrair) {
				JOptionPane.showMessageDialog(null, "O resultado da subtra��o �: " + (numero1 - numero2));
			}
			if (e.getSource() == jbZerar) {

			}				
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null, "Digite valores v�lidos.");
		}
	}
	
}
