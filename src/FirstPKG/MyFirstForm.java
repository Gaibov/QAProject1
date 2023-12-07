package FirstPKG;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;

public class MyFirstForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAge;
	private JTextField txtName;
	private JButton btnOk;
	JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstForm frame = new MyFirstForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFirstForm() {
		setTitle("My FirstForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 14, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtName.setBounds(117, 11, 86, 20);
		txtName.setColumns(10);
		contentPane.add(txtName);
		
		JLabel lblNewLabel = new JLabel("Enter Age");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 60, 79, 14);
		contentPane.add(lblNewLabel);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=txtName.getText();
				int Age=Integer.parseInt(txtAge.getText());
				if (Age>18)
					lblInfo.setText(n+ "You can VOTE");
				else
					lblInfo.setText(n+ "You can not VOTE");
			}
		});
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnOk.setBounds(31, 121, 89, 23);
		contentPane.add(btnOk);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAge.setBounds(117, 57, 86, 20);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtName.setText("");
			txtAge.setText("");	
			lblInfo.setText("");
			
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReset.setBounds(173, 122, 89, 23);
		contentPane.add(btnReset);
		
		lblInfo = new JLabel("");
		lblInfo.setBounds(41, 155, 198, 14);
		contentPane.add(lblInfo);
	}
}
