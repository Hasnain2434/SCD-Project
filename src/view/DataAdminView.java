package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class DataAdminView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private JLabel pnl1_lbl1;
	private JLabel pnl1_lbl2;
	private JLabel lblNewLabel_6_1_1;
	private JLabel lblNewLabel_2; 
	private JPanel sidePanel;
	private JPanel nestedPanel_1;
	private JPanel nestedPanel_2;
	private JLabel lblNewLabel_3;
	private JPanel middlePanel;
	private JLabel lblNewLabel_4;

	private JButton btnNewButton;
	private JLabel lblNewLabel_6_1;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_6_2;
	private JTable table;
	JScrollPane js;
	DefaultTableModel modelTable;
	

	public DataAdminView() {
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
		
		pnl1_lbl1 = new JLabel("DataBase Administration");
		pnl1_lbl2 = new JLabel("");
		lblNewLabel_6_1_1 = new JLabel("*");
		lblNewLabel_6_1_1.setBounds(357, 302, 14, 17);
		textField_1 = new JTextField();
		textField_1.setBounds(491, 299, 259, 29);
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		
		Color transition=new Color(95,75,118);
		contentPane.setLayout(null);
		
		sidePanel = new JPanel();
		sidePanel.setBounds(0, 0, 330, 693);
		sidePanel.setBackground(new Color(54, 33, 89));
		contentPane.add(sidePanel);
		sidePanel.setLayout(null);
		
		nestedPanel_1 = new JPanel();
		nestedPanel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nestedPanel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				nestedPanel_1.setBackground(transition);
				pnl1_lbl1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nestedPanel_1.setBackground(new Color(85,65,118));
				pnl1_lbl1.setFont(new Font("Segoe UI", Font.PLAIN, 21));
			}
		});
		nestedPanel_1.setBorder(null);
		nestedPanel_1.setBackground(new Color(85, 65, 118));
		nestedPanel_1.setBounds(0, 178, 330, 59);
		sidePanel.add(nestedPanel_1);
		nestedPanel_1.setLayout(null);
		
		
		pnl1_lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		pnl1_lbl1.setFont(new Font("Segoe UI", Font.PLAIN, 19));
		pnl1_lbl1.setForeground(new Color(255, 255, 255));
		pnl1_lbl1.setBounds(66, 10, 246, 49);
		nestedPanel_1.add(pnl1_lbl1);
		
		
		pnl1_lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		pnl1_lbl2.setIcon(new ImageIcon("C:\\UNIVERSITY\\Scd Project\\Dictionary\\resources\\icons8-database-administrator-24.png"));
		pnl1_lbl2.setBounds(10, 10, 48, 49);
		nestedPanel_1.add(pnl1_lbl2);
		
		nestedPanel_2 = new JPanel();
		nestedPanel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nestedPanel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				nestedPanel_2.setBackground(transition);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nestedPanel_2.setBackground(new Color(64,43,100));
			}
		});
		nestedPanel_2.setBorder(null);
		nestedPanel_2.setBackground(new Color(64, 43, 100));
		nestedPanel_2.setBounds(0, 235, 330, 59);
		sidePanel.add(nestedPanel_2);
		nestedPanel_2.setLayout(null);
		
		lblNewLabel_2 = new JLabel("Talha");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(57, 10, 99, 30);
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
		});
		nestedPanel_3.setBorder(null);
		nestedPanel_3.setBackground(new Color(64, 43, 100));
		nestedPanel_3.setBounds(0, 293, 330, 59);
		sidePanel.add(nestedPanel_3);
		nestedPanel_3.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Abdullah");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(67, 24, 116, 35);
		nestedPanel_3.add(lblNewLabel_3);
		
		middlePanel = new JPanel();
		middlePanel.setBounds(327, 41, 773, 144);
		middlePanel.setBackground(new Color(110, 89, 222));
		contentPane.add(middlePanel);
		middlePanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("DataBase Adminisitration__________________");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(10, 62, 524, 61);
		middlePanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Import File");
		lblNewLabel_5.setBounds(357, 184, 102, 35);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 18));
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(491, 238, 259, 29);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Browse");
		btnNewButton.setBounds(760, 242, 85, 21);
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
		contentPane.add(btnNewButton);
		
		lblNewLabel_6_1 = new JLabel("*");
		lblNewLabel_6_1.setBounds(357, 239, 14, 17);
		lblNewLabel_6_1.setForeground(Color.RED);
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_6_1);
		
		lblNewLabel_6 = new JLabel("Path:");
		lblNewLabel_6.setBounds(358, 239, 54, 17);
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_6);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_1_1.setForeground(Color.RED);
		lblNewLabel_6_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_6_1_1);
		
		btnNewButton_1 = new JButton("Import");
		btnNewButton_1.setBounds(760, 299, 85, 29);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		contentPane.add(btnNewButton_1);
		lblNewLabel_6_2 = new JLabel("Table Name:");
		lblNewLabel_6_2.setBounds(358, 302, 112, 17);
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		contentPane.add(lblNewLabel_6_2);
		 String data[][]={ {"101","Amit","670000"},    
                 {"102","Jai","780000"},    
                 {"101","Sachin","700000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},{"101","Amit","670000"},};    
String column[]={"ID","NAME","SALARY"};    
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setBackground(new Color(192, 192, 192));
		table.setBounds(380, 355, 670, 328);
		js=new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		modelTable=new DefaultTableModel();
		table.setRowSelectionAllowed(false);
		table.setColumnSelectionAllowed(false);
		js.setBounds(380, 355, 670, 328);
		js.setViewportView(table);
		contentPane.add(js);
		table.setModel(modelTable);
		this.setVisible(true);
		
		
	}
	public String getFilePath()
	{
		if(textField.getText().isEmpty())
		{
			return null;
		}
			
		return textField.getText().toString();
	}
	public String getTableName()
	{
		if(textField_1.getText().isEmpty())
		{
			return null;
		}
		return textField_1.getText().toString();
	}
	/**
	 * This function adds event behind every button present on the screen
	 * @param action
	 * By Hasnain Riaz
	 */
	public void addAction(ActionListener action)
	{
		btnNewButton_1.addActionListener(action);
	}
	/**
	 * This function adds rows and columns in JTABLE
	 * @param data
	 * @param header
	 * By Hasnain Riaz
	 */
	
	  public void setJTable(List<List<String>> data,List<String> header) 
	  { 
	   try 
	   { 
	  String tempArray[]=new String[header.size()];
	  for(int i=0;i<header.size();i++) 
	  {
	  modelTable.addColumn(header.get(i)); 
	  }
	  for(int i=0;i<data.size();i++)
	  { 
		  for(int j=0;j<data.get(i).size();j++) 
	  {
	  tempArray[j]=data.get(i).get(j); 
	  }
	  modelTable.insertRow(i, tempArray);
	  }
	  table.setModel(modelTable); 
	  } 
	   catch(Exception e)
	  {
	  JOptionPane.showMessageDialog(this,"Data Cannot be entered into JTable.   "+e.toString()); 
	  } 
	  }
	  /**
	   * this function makes the table empty
	   * created by Hasnain Riaz
	   */
	  public void emptyJTable()
	  {
		  TableColumnModel tableColumn=table.getColumnModel();
		  if(modelTable.getColumnCount()>0 && modelTable.getRowCount()>0)
		  {
		  while(modelTable.getRowCount()>0)
		  {
			  modelTable.removeRow(0);
		  }
		  modelTable.setColumnCount(0);
		  }
	  }
}
