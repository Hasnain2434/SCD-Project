package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Cursor;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class DataAdministration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataAdministration frame = new DataAdministration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DataAdministration() {
		setResizable(false);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Import Data");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1101,730);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DataBase Administration");
		JLabel lblNewLabel_1 = new JLabel("");
		JLabel lblNewLabel_6_2 = new JLabel("Table Name:");
		JLabel lblNewLabel_6_1_1 = new JLabel("*");
		textField_1 = new JTextField();
		
		
		Color transition=new Color(95,75,118);
		
		JPanel sidepanel = new JPanel();
		sidepanel.setBackground(new Color(54, 33, 89));
		sidepanel.setBounds(0, 0, 330, 693);
		contentPane.add(sidepanel);
		sidepanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				panel.setBackground(transition);
				lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 22));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new Color(85,65,118));
				lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 21));
			}
		});
		panel.setBorder(null);
		panel.setBackground(new Color(85, 65, 118));
		panel.setBounds(0, 178, 330, 59);
		sidepanel.add(panel);
		panel.setLayout(null);
		
		
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(66, 10, 246, 49);
		panel.add(lblNewLabel);
		
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\UNIVERSITY\\Scd Project\\Dictionary\\resources\\icons8-database-administrator-24.png"));
		lblNewLabel_1.setBounds(10, 10, 48, 49);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				panel_1.setBackground(transition);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(new Color(64,43,100));
			}
		});
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(64, 43, 100));
		panel_1.setBounds(0, 235, 330, 59);
		sidepanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Talha");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(57, 10, 99, 30);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				panel_1_1.setBackground(transition);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_1.setBackground(new Color(64,43,100));
			}
		});
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(64, 43, 100));
		panel_1_1.setBounds(0, 293, 330, 59);
		sidepanel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Abdullah");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(67, 24, 116, 35);
		panel_1_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(110, 89, 222));
		panel_2.setBounds(327, 82, 773, 144);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("DataBase Adminisitration__________________");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(10, 62, 524, 61);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Import File");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_5.setBounds(350, 236, 102, 35);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(484, 290, 259, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Browse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser filechooser=new JFileChooser();
				filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				filechooser.setAcceptAllFileFilterUsed(false);
				int rval=filechooser.showOpenDialog(null);
				 if (rval == JFileChooser.APPROVE_OPTION) {
					 textField.setText(filechooser.getSelectedFile().toString());
			        }
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton.setBounds(753, 294, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_6_1 = new JLabel("*");
		lblNewLabel_6_1.setForeground(Color.RED);
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblNewLabel_6_1.setBounds(350, 291, 14, 17);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6 = new JLabel("Path:");
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(351, 291, 54, 17);
		contentPane.add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Import in New Table");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!rdbtnNewRadioButton.isSelected())
				{
					textField_1.setEnabled(false);
					lblNewLabel_6_2.setEnabled(false);
					lblNewLabel_6_1_1.setEnabled(false);
					
				}
				else
				{
					textField_1.setEnabled(true);
					lblNewLabel_6_2.setEnabled(true);
					lblNewLabel_6_1_1.setEnabled(true);
				}
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setBounds(350, 340, 142, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		lblNewLabel_6_2.setEnabled(false);
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblNewLabel_6_2.setBounds(351, 387, 112, 17);
		contentPane.add(lblNewLabel_6_2);
		
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		textField_1.setBounds(484, 384, 259, 29);
		contentPane.add(textField_1);
		
		lblNewLabel_6_1_1.setEnabled(false);
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_1_1.setForeground(Color.RED);
		lblNewLabel_6_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblNewLabel_6_1_1.setBounds(350, 387, 14, 17);
		contentPane.add(lblNewLabel_6_1_1);

	}
}
