import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Maquina extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maquina frame = new Maquina();
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
	public Maquina() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(468, 11, 214, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("A");
		button.setBackground(SystemColor.menu);
		button.setFont(new Font("OCR-A BT", Font.PLAIN, 14));
		button.setBounds(468, 71, 46, 40);
		panel.add(button);
		
		JButton btnB = new JButton("B");
		btnB.setBackground(SystemColor.menu);
		btnB.setBounds(524, 71, 46, 40);
		panel.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setBackground(SystemColor.menu);
		btnC.setBounds(580, 71, 46, 40);
		panel.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setBackground(SystemColor.menu);
		btnD.setBounds(636, 71, 46, 40);
		panel.add(btnD);
		
		JButton button_4 = new JButton("1");
		button_4.setBackground(SystemColor.menu);
		button_4.setBounds(468, 123, 46, 40);
		panel.add(button_4);
		
		JButton button_5 = new JButton("2");
		button_5.setBackground(SystemColor.menu);
		button_5.setBounds(524, 122, 46, 40);
		panel.add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.setBackground(SystemColor.menu);
		button_6.setBounds(580, 122, 46, 40);
		panel.add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.setBackground(SystemColor.menu);
		button_7.setBounds(636, 122, 46, 40);
		panel.add(button_7);
		
		JButton button_10 = new JButton("$10");
		button_10.setBackground(SystemColor.menu);
		button_10.setFont(new Font("OCR-A BT", Font.PLAIN, 16));
		button_10.setBounds(468, 350, 214, 30);
		panel.add(button_10);
		
		JButton button_8 = new JButton("$1");
		button_8.setBackground(SystemColor.menu);
		button_8.setFont(new Font("OCR-A BT", Font.PLAIN, 16));
		button_8.setBounds(468, 227, 214, 30);
		panel.add(button_8);
		
		JButton button_9 = new JButton("$2");
		button_9.setBackground(SystemColor.menu);
		button_9.setFont(new Font("OCR-A BT", Font.PLAIN, 16));
		button_9.setBounds(468, 268, 214, 30);
		panel.add(button_9);
		
		JButton button_11 = new JButton("$5");
		button_11.setBackground(SystemColor.menu);
		button_11.setFont(new Font("OCR-A BT", Font.PLAIN, 16));
		button_11.setBounds(468, 309, 214, 30);
		panel.add(button_11);
		
		JLabel lblMaquinaLosPedorros = new JLabel("MAQUINA LOS PEDORROS");
		lblMaquinaLosPedorros.setForeground(Color.DARK_GRAY);
		lblMaquinaLosPedorros.setFont(new Font("OCR-A BT", Font.PLAIN, 16));
		lblMaquinaLosPedorros.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaquinaLosPedorros.setBounds(468, 391, 214, 41);
		panel.add(lblMaquinaLosPedorros);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(38, 42, 77, 69);
		panel.add(btnNewButton);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(131, 42, 77, 69);
		panel.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(222, 42, 77, 69);
		panel.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(317, 42, 77, 69);
		panel.add(button_3);
		
		JButton button_12 = new JButton("");
		button_12.setBounds(38, 132, 77, 69);
		panel.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBounds(38, 227, 77, 69);
		panel.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(38, 315, 77, 69);
		panel.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBounds(131, 132, 77, 69);
		panel.add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setBounds(222, 132, 77, 69);
		panel.add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBounds(317, 132, 77, 69);
		panel.add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBounds(131, 227, 77, 69);
		panel.add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBounds(222, 229, 77, 69);
		panel.add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.setBounds(317, 227, 77, 69);
		panel.add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setBounds(131, 315, 77, 69);
		panel.add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBounds(222, 315, 77, 69);
		panel.add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBounds(317, 311, 77, 69);
		panel.add(button_23);
		
		JLabel label = new JLabel("A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(56, 19, 37, 14);
		panel.add(label);
		
		JLabel lblB = new JLabel("B");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBounds(146, 19, 37, 14);
		panel.add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setBounds(241, 19, 37, 14);
		panel.add(lblC);
		
		JLabel lblD = new JLabel("D");
		lblD.setHorizontalAlignment(SwingConstants.CENTER);
		lblD.setBounds(335, 19, 37, 14);
		panel.add(lblD);
		
		JLabel label_4 = new JLabel("1");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(0, 71, 37, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("2");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(0, 159, 37, 14);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("3");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(0, 254, 37, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("4");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(0, 342, 37, 14);
		panel.add(label_7);
	}
}
