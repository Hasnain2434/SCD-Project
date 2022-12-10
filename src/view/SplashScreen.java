package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.util.Dictionary;
import javax.swing.JProgressBar;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class SplashScreen extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;
	private JLabel progressValue;
	public SplashScreen() {
		setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 385);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressValue = new JLabel("100%");
		progressValue.setForeground(Color.WHITE);
		progressValue.setHorizontalAlignment(SwingConstants.CENTER);
		progressValue.setFont(new Font("SansSerif", Font.BOLD, 17));
		progressValue.setBounds(247, 354, 48, 31);
		contentPane.add(progressValue);
		
		progressBar = new JProgressBar();
		progressBar.setBackground(Color.LIGHT_GRAY);
		progressBar.setBounds(0, 354, 555, 31);
		progressBar.setForeground(new Color(85, 65, 118));
		contentPane.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 555, 385);
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("resources/o6m.gif")));
		//System.out.println(getClass().getResource("o6m.gif").getPath());
		contentPane.add(lblNewLabel);
		this.setVisible(true);
	}
	
	public void animateProgressBar()
	{
		try
		{
			for(int i=0;i<100;i=i+5)
			{
				Thread.sleep(110);
				progressValue.setText(Integer.toString(i)+"%");
				progressBar.setValue(i);
			}
		}
		catch (Exception ex)
		{
			System.out.println("Splash Screen failed to load");
		}
	
	}
}
