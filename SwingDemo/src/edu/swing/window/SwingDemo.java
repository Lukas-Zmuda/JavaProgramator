package edu.swing.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class SwingDemo extends JFrame {

	private JPanel contentPane;
	private JTextField tfMeno;
	private JButton btnStlac;
	private JButton btnVymaz;
	private JLabel lblNewLabel_1;
	private JRadioButton rdbtnZena;
	private JRadioButton rdbtnMuz;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblNewLabel_2;
	private JComboBox cbTitul;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingDemo frame = new SwingDemo();
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
	public SwingDemo() {		
		initComponents();
		createEvents();
	}
	
	private void initComponents() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SwingDemo.class.getResource("/edu/swing/res/icons8_monkey_36px.png")));
		setTitle("Moje okno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Meno:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		tfMeno = new JTextField();
		tfMeno.setToolTipText("Napíš niečo");
		tfMeno.setBounds(66, 8, 240, 20);
		contentPane.add(tfMeno);
		tfMeno.setColumns(10);
		
		btnStlac = new JButton("Stlač ma!");
		btnStlac.setBounds(316, 7, 89, 23);
		contentPane.add(btnStlac);
		
		btnVymaz = new JButton("");
		btnVymaz.setEnabled(false);
		
		btnVymaz.setIcon(new ImageIcon(SwingDemo.class.getResource("/edu/swing/res/icons8_Delete_16px.png")));
		btnVymaz.setBounds(415, 7, 31, 23);
		contentPane.add(btnVymaz);
		
		lblNewLabel_1 = new JLabel("Pohlavie:");
		lblNewLabel_1.setBounds(10, 44, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		rdbtnMuz = new JRadioButton("Muž");
		buttonGroup.add(rdbtnMuz);
		rdbtnMuz.setBounds(62, 40, 59, 23);
		contentPane.add(rdbtnMuz);
		
		rdbtnZena = new JRadioButton("Žena");
		rdbtnZena.setSelected(true);
		buttonGroup.add(rdbtnZena);
		rdbtnZena.setBounds(123, 40, 59, 23);
		contentPane.add(rdbtnZena);
		
		lblNewLabel_2 = new JLabel("Titul:");
		lblNewLabel_2.setBounds(10, 69, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		cbTitul = new JComboBox();
		cbTitul.setModel(new DefaultComboBoxModel(new String[] {"Bc.", "Mgr.", "Ing.", "MUDr.", "JUDr.", "PhDr.", "PaedDr.", "MVDr.", "RNDr."}));
		cbTitul.setSelectedIndex(1);
		cbTitul.setBounds(41, 65, 59, 22);
		contentPane.add(cbTitul);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Adresa:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 94, 465, 133);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Ulica:");
		lblNewLabel_3.setBounds(10, 25, 46, 14);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(66, 22, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
	}

	private void createEvents() {
		btnStlac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String text = tfMeno.getText();
				
				if(rdbtnMuz.isSelected()) {
					text += " je pan!";					
				}else {
					text += " je caja!";	
				}				
				
				text = cbTitul.getSelectedItem() + " " + text;
				tfMeno.setText(text);
				
				btnVymaz.setEnabled(true);
			}
		});
		
		btnVymaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tfMeno.setText("");
				rdbtnZena.setSelected(true);
				btnVymaz.setEnabled(false);
			}
		});
		
	}
}
