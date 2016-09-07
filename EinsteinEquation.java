/*
 * Created by: Michael Balcerzak
 * Created on: 16-Sep-2016
 * Created for: ICS4U
 * Daily Assignment – 1-03
 * This program calculate the Energy of the given Mass.
*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;

public class EinsteinEquation extends JFrame {

	private JPanel contentPane;
	private JTextField txtMass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EinsteinEquation frame = new EinsteinEquation();
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
	public EinsteinEquation() {
		setTitle("Einstein's Equation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblEnergy = new JLabel("Energy:");
		lblEnergy.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEnergy = new GridBagConstraints();
		gbc_lblEnergy.insets = new Insets(0, 0, 0, 5);
		gbc_lblEnergy.gridx = 6;
		gbc_lblEnergy.gridy = 6;
		contentPane.add(lblEnergy, gbc_lblEnergy);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Mass = Double.parseDouble(txtMass.getText());
				
				double Energy = Mass * 2.998*100000000 * 2.998*100000000;
				
				lblEnergy.setText("Energy: " + Double.toString(Energy) + "J");
			}
		});
		
		JLabel lblEinsteinEquation = new JLabel("Put the Mass of the object to find the Energy");
		lblEinsteinEquation.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblEinsteinEquation = new GridBagConstraints();
		gbc_lblEinsteinEquation.insets = new Insets(0, 0, 5, 5);
		gbc_lblEinsteinEquation.gridx = 6;
		gbc_lblEinsteinEquation.gridy = 0;
		contentPane.add(lblEinsteinEquation, gbc_lblEinsteinEquation);
		
		txtMass = new JTextField();
		GridBagConstraints gbc_txtMass = new GridBagConstraints();
		gbc_txtMass.insets = new Insets(0, 0, 5, 5);
		gbc_txtMass.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMass.gridx = 6;
		gbc_txtMass.gridy = 2;
		contentPane.add(txtMass, gbc_txtMass);
		txtMass.setColumns(10);
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnter.gridx = 6;
		gbc_btnEnter.gridy = 4;
		contentPane.add(btnEnter, gbc_btnEnter);
		
		
	}

}
