import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Component;
import javax.swing.Box;

public class TelaInicial {

	private JFrame controleFinanceiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.controleFinanceiro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		controleFinanceiro = new JFrame();
		controleFinanceiro.setTitle("Controle Financeiro v1.0");
		controleFinanceiro.getContentPane().setBackground(Color.LIGHT_GRAY);
		controleFinanceiro.getContentPane().setLayout(null);

		JButton novaReceita = new JButton("Nova receita");
		novaReceita.setBounds(526, 69, 134, 53);
		novaReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NovaReceita nr = new NovaReceita();
				nr.setVisible(true);
			}
		});
		controleFinanceiro.getContentPane().add(novaReceita);

		JButton novaDespesa = new JButton("Nova despesa");
		novaDespesa.setBounds(526, 133, 134, 53);
		novaDespesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		controleFinanceiro.getContentPane().add(novaDespesa);

		JButton novaTransferencia = new JButton("Nova transferência");
		novaTransferencia.setBounds(526, 197, 134, 53);
		novaTransferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		controleFinanceiro.getContentPane().add(novaTransferencia);
		
		controleFinanceiro.setBounds(100, 100, 700, 500);
		controleFinanceiro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
