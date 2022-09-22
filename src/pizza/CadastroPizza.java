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
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import main.Index;

public class CadastroPizza {

	private JFrame frame;
	private JTextField textFieldNome;
	private JTextField textFieldDescricao;
	
	
	
	public JFrame getFramePizza() {
		return frame;
	}
	
	public static void launchAppPizza() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPizza window = new CadastroPizza();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		launchAppPizza();
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
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(Double.valueOf(0), null, null, Double.valueOf(1)));
		spinner.setBounds(153, 132, 90, 31);
		frame.getContentPane().add(spinner);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println(textFieldNome.getText());
			System.out.println(textFieldDescricao.getText());
			System.out.println(spinner.getValue());
			textFieldNome.setText("");
			textFieldDescricao.setText("");
			spinner.setValue(0);
			}
		});
		btnRegistrar.setBounds(153, 359, 108, 31);
		frame.getContentPane().add(btnRegistrar);
		
		JButton btnNewButton_1 = new JButton("Registrar e Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println(textFieldNome.getText());
			System.out.println(textFieldDescricao.getText());
			System.out.println(spinner.getValue());
			frame.dispose();
			Index windowIndex = new Index();
			windowIndex.launchAppIndex();
			}
		});
		btnNewButton_1.setBounds(291, 359, 144, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Index windowIndex = new Index();
				windowIndex.launchAppIndex();
			}
		});
		btnNewButton_2.setBounds(462, 359, 108, 31);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
	}	
}
