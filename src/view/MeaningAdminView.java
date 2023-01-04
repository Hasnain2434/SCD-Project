package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



public class MeaningAdminView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	public ArrayList<JTextField>attrtextField;
	public ArrayList<JLabel> attrlbl;
	
	
	public JButton btnNewButton;
	public JButton btnNewButton_1;
	public JComboBox<String> comboBox;
	
	
	private JLabel pnl1_lbl1;
	private JLabel lblNewLabel_6_1_1;
	private JLabel lblNewLabel_2; 
	private JPanel sidePanel;
	private JPanel nestedPanel_1;
	private JPanel nestedPanel_2;
	private JLabel lblNewLabel_3;
	private JPanel middlePanel;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6_1;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_6_2;
	private JLabel lblRoots ;
	private DataAdminView dataAdminView;
	private SearchWordView searchMeanView;
	private CustomDictionaryView customDictionaryView;
	private JPanel nestedPanel_3_1;
	private JLabel lblNewLabel_3_1;
	
	public MeaningAdminView() {
		setVisible(false);
		setResizable(false);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setTitle("Meaning");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1101,730);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		attrtextField = new ArrayList<JTextField>();
		attrlbl = new ArrayList<JLabel>();
		
		comboBox = new JComboBox();
		pnl1_lbl1 = new JLabel("DataBase Administration");
		lblNewLabel_6_1_1 = new JLabel("*");
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		
		Color transition=new Color(95,75,118);
		
		sidePanel = new JPanel();
		sidePanel.setBackground(new Color(54, 33, 89));
		sidePanel.setBounds(0, 0, 330, 693);
		contentPane.add(sidePanel);
		sidePanel.setLayout(null);
		
		nestedPanel_1 = new JPanel();
		nestedPanel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nestedPanel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				nestedPanel_1.setBackground(transition);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nestedPanel_1.setBackground(new Color(64, 43, 100));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dataAdminView.setVisible(true);
			}
		});
		
		nestedPanel_1.setBorder(null);
		nestedPanel_1.setBackground(new Color(64, 43, 100));
		nestedPanel_1.setBounds(0, 178, 330, 59);
		sidePanel.add(nestedPanel_1);
		nestedPanel_1.setLayout(null);
		
		pnl1_lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		pnl1_lbl1.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		pnl1_lbl1.setForeground(new Color(255, 255, 255));
		pnl1_lbl1.setBounds(29, 6, 246, 49);
		nestedPanel_1.add(pnl1_lbl1);
		
		nestedPanel_2 = new JPanel();
		nestedPanel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nestedPanel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				nestedPanel_2.setBackground(transition);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nestedPanel_2.setBackground(new Color(85, 65, 118));
			}
		});
		nestedPanel_2.setBorder(null);
		nestedPanel_2.setBackground(new Color(85, 65, 118));
		nestedPanel_2.setBounds(0, 235, 330, 59);
		sidePanel.add(nestedPanel_2);
		nestedPanel_2.setLayout(null);
		
		lblNewLabel_2 = new JLabel("Manage Words");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(49, 10, 208, 30);
		nestedPanel_2.add(lblNewLabel_2);
		
		JPanel nestedPanel_3 = new JPanel();
		nestedPanel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nestedPanel_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				nestedPanel_3.setBackground(transition);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nestedPanel_3.setBackground(new Color(64,43,100));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				searchMeanView.setVisible(true);
			}
		});
		nestedPanel_3.setBorder(null);
		nestedPanel_3.setBackground(new Color(64, 43, 100));
		nestedPanel_3.setBounds(0, 293, 330, 59);
		sidePanel.add(nestedPanel_3);
		nestedPanel_3.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Searching");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(49, 12, 116, 35);
		nestedPanel_3.add(lblNewLabel_3);
		
		nestedPanel_3_1 = new JPanel();
		nestedPanel_3_1.setLayout(null);
		nestedPanel_3_1.setBorder(null);
		nestedPanel_3_1.setBackground(new Color(64, 43, 100));
		nestedPanel_3_1.setBounds(0, 350, 330, 59);
		sidePanel.add(nestedPanel_3_1);
		nestedPanel_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nestedPanel_3_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				nestedPanel_3_1.setBackground(transition);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nestedPanel_3_1.setBackground(new Color(64,43,100));
			}
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				customDictionaryView.setVisible(true);
			}
			
		});
		
		lblNewLabel_3_1 = new JLabel("Custom Dictionary");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		lblNewLabel_3_1.setBounds(49, 12, 188, 35);
		nestedPanel_3_1.add(lblNewLabel_3_1);
		
		middlePanel = new JPanel();
		middlePanel.setBackground(new Color(110, 89, 222));
		middlePanel.setBounds(327, 41, 773, 144);
		contentPane.add(middlePanel);
		middlePanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Manage  Word and Meaning__________________");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(10, 62, 594, 61);
		middlePanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Search Word");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel_5.setBounds(357, 184, 137, 35);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setBounds(491, 238, 259, 29);
		textField.setColumns(10);
		contentPane.add(textField);
		
		btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton.setBounds(760, 242, 85, 21);
		contentPane.add(btnNewButton);
		
		lblNewLabel_6_1 = new JLabel("*");
		lblNewLabel_6_1.setForeground(Color.RED);
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblNewLabel_6_1.setBounds(357, 239, 14, 17);
		contentPane.add(lblNewLabel_6_1);
		
		lblNewLabel_6 = new JLabel("Word");
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(358, 239, 54, 17);
		contentPane.add(lblNewLabel_6);
		textField_1.setColumns(10);
		textField_1.setBounds(491, 299, 259, 29);
		contentPane.add(textField_1);
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_1_1.setForeground(Color.RED);
		lblNewLabel_6_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblNewLabel_6_1_1.setBounds(357, 302, 14, 17);
		contentPane.add(lblNewLabel_6_1_1);
		
		btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnNewButton_1.setBounds(760, 299, 85, 29);
		
		contentPane.add(btnNewButton_1);
		lblNewLabel_6_2 = new JLabel("Meaning:");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblNewLabel_6_2.setBounds(358, 302, 112, 22);
		contentPane.add(lblNewLabel_6_2);
		
		
	}
	
	public void setColumnFields(int count) {
		int x=378,y=338;
		for(int i=0; i < count ; i++) {
			if(i%2==1) {
				x = x+300;
			}
			else {
				y = y+20;
				x=378;
			}
			attrlbl.add(new JLabel("Label "+ i)) ;
			attrlbl.get(i).setFont(new Font("Tahoma", Font.PLAIN, 16));
			attrlbl.get(i).setBounds(x, y, 120, 25);
			contentPane.add(attrlbl.get(i));
			x = x + 130;
			
			attrtextField.add(new JTextField("Text "+ i));
			attrtextField.get(i).setFont(new Font("Tahoma", Font.PLAIN, 16));
			attrtextField.get(i).setBounds(x,y,120,25);
			contentPane.add(attrtextField.get(i));
		}
		
	}
	public void HideComboBox() {
		comboBox.removeAllItems();
		//comboBox.setVisible(false);
	}
	public void setRootsList(String[] roots) {
		DefaultComboBoxModel<String> cModel = new DefaultComboBoxModel<String>(roots);
		
		comboBox.setVisible(true);
		comboBox.removeAllItems();
		int x=380,y=500;

		 lblRoots = new JLabel("Roots");
		 lblRoots.setBounds(x, y, 120, 35);
		 lblRoots.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblRoots);
		
		comboBox.setModel(cModel);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(x+130, y, 120, 35);
		contentPane.add(comboBox);
		
		
	}
	public void EmptyMeaning() {
		textField_1.setText("");
		HideComboBox();
	}
	
	public String getword()
	{
		if(textField.getText().isEmpty())
		{
			return "";
		}
			
		return textField.getText().toString();
	}
	public String getMeaning()
	{
		if(textField_1.getText().isEmpty())
		{
			return "";
		}
		return textField_1.getText().toString();
	}
	public String getSelected() {
		return (String) comboBox.getSelectedItem();
	}
	
	public void setDataAdminView(DataAdminView dataAdminView)
	{
		this.dataAdminView=dataAdminView;
	}
	
	public void setSearchView(SearchWordView searchMeanView)
	{
		this.searchMeanView=searchMeanView;
	}
	public void setCustomDictionaryView(CustomDictionaryView customDictionaryView) {
		  this.customDictionaryView = customDictionaryView;
	  }
	
	public void addAction(ActionListener action)
	{
		btnNewButton.addActionListener(action);
		btnNewButton_1.addActionListener(action);
		comboBox.addActionListener(action);
	}
}