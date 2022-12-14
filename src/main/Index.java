package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import help.Help;
import help.License;
import pizza.CadastroPizza;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Index {

	private JFrame frameIndex;
	
	public JFrame getFrameIndex() {
		return frameIndex;
	}
	public static void launchAppIndex() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index windowIndex = new Index();
					windowIndex.frameIndex.setVisible(true);
					windowIndex.frameIndex.setLocationRelativeTo(null);
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
		launchAppIndex();
	}

	/**
	 * Create the application.
	 */
	public Index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameIndex = new JFrame();
		frameIndex.setBounds(100, 100, 1034, 682);
		frameIndex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameIndex.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		frameIndex.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Register");
		menuBar.add(mnNewMenu);
		
		JMenuItem itemRegisterPizza = new JMenuItem("Pizza");
		itemRegisterPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPizza.launchAppPizza();
				frameIndex.setVisible(false);
			}
		});
		mnNewMenu.add(itemRegisterPizza);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Drink");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Combo");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenu mnNewMenu_3 = new JMenu("Configuration");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_2 = new JMenu("Window");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem itemHelp = new JMenuItem("Help content");
		itemHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Help.launchAppHelp();
			}
		});
		mnNewMenu_1.add(itemHelp);
		
		JMenuItem itemLicense = new JMenuItem("License");
		itemLicense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				License.launchAppLicense();
			}
		});
		mnNewMenu_1.add(itemLicense);
	}
}
