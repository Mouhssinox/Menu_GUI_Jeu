package menus;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class Accueil {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil window = new Accueil();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Accueil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.getContentPane().setForeground(SystemColor.textHighlight);
		frame.setBackground(SystemColor.textHighlight);
		frame.setBounds(100, 100, 963, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Options");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(379, 205, 261, 71);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Quiter");
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_2.setBounds(379, 340, 261, 71);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnJouer = new JButton("Jouer");
		btnJouer.setForeground(Color.WHITE);
		btnJouer.setBackground(Color.RED);
		btnJouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnJouer.setFont(new Font("MV Boli", Font.BOLD | Font.ITALIC, 30));
		btnJouer.setBounds(379, 60, 261, 71);
		frame.getContentPane().add(btnJouer);
	}
}
