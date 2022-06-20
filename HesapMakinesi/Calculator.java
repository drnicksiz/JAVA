package HesapMakinesi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField text;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	int operation; Double number1; Double number2;
	private JTextField preview;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void calculate() {
		
		switch(operation) {
		
		case 1: 
			text.setText(String.valueOf(number1+number2));
			break;
			
		case 2: 
			text.setText(String.valueOf(number1-number2));
			break;
			
		case 3: 
			text.setText(String.valueOf(number1*number2));
			break;
			
		case 4: 
			if(number2 == 0) {
				text.setText("ZERO DIVISION ERROR!");
				break;
			}
			
			text.setText(String.valueOf(number1/number2));
			break;
			
		case 5: 
			
			text.setText(String.valueOf(Math.sqrt(number1)));
			break;
		}
	}
	
	
	public void changeScreenValue(String val) {
		
		text.setText(text.getText() + val);
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setType(Type.UTILITY);
		setTitle("Calculator");
		setResizable(false);
		setForeground(UIManager.getColor("ToolTip.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBackground(new Color(238, 232, 170));
		screen.setForeground(Color.WHITE);
		screen.setBounds(10, 10, 345, 48);
		contentPane.add(screen);
		screen.setLayout(null);
		
		text = new JTextField();
		text.setEditable(false);
		text.setHorizontalAlignment(SwingConstants.RIGHT);
		text.setFont(new Font("Tahoma", Font.BOLD, 21));
		text.setBackground(new Color(238, 232, 170));
		text.setBounds(0, 16, 345, 32);
		screen.add(text);
		text.setColumns(10);
		
		preview = new JTextField();
		preview.setHorizontalAlignment(SwingConstants.RIGHT);
		preview.setBackground(new Color(224, 255, 255));
		preview.setFont(new Font("Tahoma", Font.BOLD, 12));
		preview.setEditable(false);
		preview.setBounds(0, 0, 345, 19);
		screen.add(preview);
		preview.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 81, 345, 360);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 4, 4));
		
		btnNewButton = new JButton("=");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(text.getText().equals("")) {
					return;
				}
				
				number2 = Double.parseDouble(text.getText());
				
				if(text.getText().equals("")) {
					return;
				}
				calculate();
				
			}
		});
		
		btnNewButton_1 = new JButton("√");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text.getText().equals("")) {
					return;
				}
				operation = 5;
				number1 = Double.parseDouble(text.getText());
				preview.setText(String.valueOf("√" + number1));
				text.setText("");
				calculate();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText("");
				preview.setText("");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_2);
		panel.add(btnNewButton);
		
		btnNewButton_4 = new JButton("+");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text.getText().equals("")) {
					return;
				}
				
				operation = 1;
				number1 = Double.parseDouble(text.getText());
				preview.setText(String.valueOf(number1) + " +");
				text.setText("");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_4);
		
		btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				changeScreenValue(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_3);
		
		
		btnNewButton_6 = new JButton("2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenValue(e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_6);
		
		btnNewButton_5 = new JButton("3");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				changeScreenValue(e.getActionCommand());
				
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_5);
		
		btnNewButton_9 = new JButton("-");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text.getText().equals("")) {
					return;
				}
				
				operation = 2;
				number1 = Double.parseDouble(text.getText());
				preview.setText(String.valueOf(number1) + " - ");
				text.setText("");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_9);
		
		btnNewButton_8 = new JButton("4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenValue(e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_8);
		
		btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenValue(e.getActionCommand());
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_7);
		
		btnNewButton_10 = new JButton("6");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenValue(e.getActionCommand());
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_10);
		
		btnNewButton_12 = new JButton("*");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(text.getText().equals("")) {
					return;
				}
				
				operation = 3;
				number1 = Double.parseDouble(text.getText());
				preview.setText(String.valueOf(number1) + " *");
				text.setText("");
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_12);
		
		btnNewButton_11 = new JButton("7");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenValue(e.getActionCommand());
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_11);
		
		btnNewButton_13 = new JButton("8");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenValue(e.getActionCommand());
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("0");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeScreenValue(e.getActionCommand());
			}
		});
		
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_14);
		
		
		btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(text.getText().equals("")) {
					return;
				}
				
				operation = 4;
				number1 = Double.parseDouble(text.getText());
				preview.setText(String.valueOf(number1) + " /");
				text.setText("");
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel.add(btnNewButton_15);
	}
}
