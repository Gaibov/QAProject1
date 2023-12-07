package FirstPKG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Point;
import javax.swing.border.TitledBorder;

public class testapp {

	private static final String Male = null;
	private JFrame frmCalculator;
	private JTextField value2;
	private JTextField value1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testapp window = new testapp();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(500, 100, 261, 338);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			value2.setText(value2.getText() + "9");
						
			}
		});
		btnNewButton.setBounds(10, 93, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("3");
		btnNewButton_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				value2.setText(value2.getText() + "3");
			
			
			}
		});
		btnNewButton_1.setBounds(10, 181, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton Button = new JButton("6");
		Button.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Button.setFont(new Font("Dialog", Font.PLAIN, 10));
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + "6");
			
			
			}
		});
		Button.setBounds(10, 137, 49, 33);
		frmCalculator.getContentPane().add(Button);
		
		JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_3.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + "8");
					
			}
		});
		btnNewButton_3.setBounds(65, 93, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_4.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				value2.setText(value2.getText() + "5");
			
			}
		});
		btnNewButton_4.setBounds(65, 137, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("2");
		btnNewButton_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_5.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				value2.setText(value2.getText() + "2");
						
			}
		});
		btnNewButton_5.setBounds(65, 181, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("0");
		btnNewButton_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_6.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + "0");
			
			}
		});
		btnNewButton_6.setBounds(10, 225, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_7.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				value2.setText(value2.getText() + "7");
			
			}
		});
		btnNewButton_7.setBounds(120, 93, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("4");
		btnNewButton_8.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_8.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				value2.setText(value2.getText() + "4");
					
			}
		});
		btnNewButton_8.setBounds(120, 137, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("1");
		btnNewButton_9.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_9.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				value2.setText(value2.getText() + "1");
						
			}
		});
		btnNewButton_9.setBounds(120, 181, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("=");
		btnNewButton_10.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_10.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			int one = Integer.parseInt(value1.getText());
			int two = Integer.parseInt(value2.getText());	
			
			if (actionRecived.getText().equals("sub"))
			{	int sub = one - two;
			    value2.setText(String.valueOf(sub));    
			
			}	
			if (actionRecived.getText().equals("add"))
			{
				int add = one + two;
			    value2.setText(String.valueOf(add));  
			}
			if (actionRecived.getText().equals("mul"))
			{
				int mul = one * two;
			    value2.setText(String.valueOf(mul));  
			}
			if (actionRecived.getText().equals("div"));
			{
				int div = one / two;
			    value2.setText(String.valueOf(div));  
			}
			
			}
		});
		btnNewButton_10.setBounds(65, 225, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_11.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			value1.setText(value2.getText());
			actionRecived.setText("sub");
			value2.setText(null);
			
			}
		});
		btnNewButton_11.setBounds(179, 93, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_12.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1.setText(value2.getText());
				actionRecived.setText("add");
				value2.setText(null);
			
			}
		});
		btnNewButton_12.setBounds(179, 137, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_13.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				value1.setText(value2.getText());
				actionRecived.setText("div");
				value2.setText(null);
			
			}
		});
		btnNewButton_13.setBounds(179, 181, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_14.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				value1.setText(value2.getText());
				actionRecived.setText("mul");
				value2.setText(null);
				
			}
		});
		btnNewButton_14.setBounds(179, 225, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_14);
		
		value2 = new JTextField();
		value2.setBorder(null);
		value2.setFont(new Font("Tahoma", Font.BOLD, 16));
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setBounds(50, 47, 182, 30);
		frmCalculator.getContentPane().add(value2);
		value2.setColumns(10);
		
		value1 = new JTextField();
		value1.setBorder(null);
		value1.setFont(new Font("Tahoma", Font.BOLD, 16));
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setColumns(10);
		value1.setBounds(116, 14, 113, 32);
		frmCalculator.getContentPane().add(value1);
		
		actionRecived = new JLabel("");
		actionRecived.setForeground(SystemColor.control);
		actionRecived.setBackground(SystemColor.control);
		actionRecived.setBounds(10, 269, 78, 19);
		frmCalculator.getContentPane().add(actionRecived);
		
		JButton btnNewButton_2 = new JButton("C");
		btnNewButton_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_2.setFont(new Font("Dialog", Font.PLAIN, 10));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			value1.setText(null);
			value2.setText(null);
			actionRecived.setText(null);
				
			}
		});
		btnNewButton_2.setBounds(120, 225, 49, 33);
		frmCalculator.getContentPane().add(btnNewButton_2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Tahoma", Font.BOLD, 16));
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPane.setBounds(10, 11, 225, 71);
		frmCalculator.getContentPane().add(editorPane);
	}

	private JLabel actionRecived;
}
