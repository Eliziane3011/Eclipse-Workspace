import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class Calc {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		frame.getContentPane().setLayout(null);
		
		JLabel NewLabel = new JLabel("Ano de Nascimento");
		NewLabel.setBounds(28, 67, 99, 14);
		frame.getContentPane().add(NewLabel);
		
		JSpinner txtAN = new JSpinner();
		txtAN.setModel(new SpinnerNumberModel(1500, 1500, 2022, 1));
		txtAN.setBounds(128, 64, 51, 20);
		frame.getContentPane().add(txtAN);
		
		JLabel NewLabel_1 = new JLabel("Idade");
		NewLabel_1.setBounds(44, 279, 46, 14);
		frame.getContentPane().add(NewLabel_1);
		
		// label 0
		JLabel lblIdade = new JLabel("0");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdade.setForeground(Color.RED);
		lblIdade.setHorizontalAlignment(SwingConstants.TRAILING);
		lblIdade.setBounds(85, 276, 21, 14);
		frame.getContentPane().add(lblIdade);
		frame.setBounds(100, 100, 527, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//_____________________Btn____________________________
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int an = Integer.parseInt(txtAN.getValue().toString());
				int id = 2022 - an;
				lblIdade.setText(Integer.toString(id));
			}
		});
		//_____________________Btn____________________________
		
		btnCalc.setIcon(new ImageIcon(Calc.class.getResource("/imagens/calculadora.png")));
		btnCalc.setBounds(10, 92, 214, 173);
		frame.getContentPane().add(btnCalc);

		
		
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Calc.class.getResource("/imagens/iconeusuario.png")));
		lblNewLabel_3.setBounds(217, 42, 246, 223);
		frame.getContentPane().add(lblNewLabel_3);
		
				
	}
}
