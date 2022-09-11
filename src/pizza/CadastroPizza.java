package pizza;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.DropMode;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Button;

public class CadastroPizza {

	private JFrame frame;
	private JTextField textFieldNome;
	private JTextField textFieldDescricao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPizza window = new CadastroPizza();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastroPizza() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 718, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnTitulo = new JTextPane();
		txtpnTitulo.setEditable(false);
		txtpnTitulo.setFont(new Font("Tahoma", Font.BOLD, 44));
		txtpnTitulo.setText("Cadastro de Pizzas");
		txtpnTitulo.setBounds(124, 11, 427, 73);
		frame.getContentPane().add(txtpnTitulo);
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setEditable(false);
		txtpnNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnNome.setText("Nome:");
		txtpnNome.setBounds(74, 90, 66, 31);
		frame.getContentPane().add(txtpnNome);
		
		JTextPane txtpnDescricao = new JTextPane();
		txtpnDescricao.setEditable(false);
		txtpnDescricao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnDescricao.setText("Descrição:");
		txtpnDescricao.setBounds(40, 174, 100, 31);
		frame.getContentPane().add(txtpnDescricao);
		
		JTextPane txtpnValor = new JTextPane();
		txtpnValor.setEditable(false);
		txtpnValor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnValor.setText("Valor:");
		txtpnValor.setBounds(80, 132, 60, 31);
		frame.getContentPane().add(txtpnValor);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(153, 90, 417, 31);
		frame.getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldDescricao = new JTextField();
		textFieldDescricao.setColumns(10);
		textFieldDescricao.setBounds(153, 174, 417, 150);
		frame.getContentPane().add(textFieldDescricao);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setText("");
		formattedTextField.setToolTipText("");
		formattedTextField.setBounds(153, 132, 204, 31);
		frame.getContentPane().add(formattedTextField);
	}
}