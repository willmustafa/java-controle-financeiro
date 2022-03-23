import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Canvas;

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
		novaReceita.setBounds(715, 74, 145, 53);
		novaReceita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NovaReceita nr = new NovaReceita();
				nr.setVisible(true);
			}
		});
		controleFinanceiro.getContentPane().add(novaReceita);

		JButton novaDespesa = new JButton("Nova despesa");
		novaDespesa.setBounds(715, 149, 145, 53);
		novaDespesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		controleFinanceiro.getContentPane().add(novaDespesa);

		JButton novaTransferencia = new JButton("Nova transferência");
		novaTransferencia.setBounds(715, 223, 145, 53);
		novaTransferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		controleFinanceiro.getContentPane().add(novaTransferencia);
		
		new Meses(); //os meses deverão ser puxados por outra maneira.
		JComboBox mesAtual = new JComboBox(Meses.lista);
		mesAtual.setFont(new Font("Tahoma", Font.PLAIN, 12));
		((JLabel)mesAtual.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER); //centralizar o texto. **REVISAR
		mesAtual.setBounds(95, 11, 581, 22);
		controleFinanceiro.getContentPane().add(mesAtual);
		
		JLabel lblNewLabel = new JLabel("Receitas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(95, 93, 92, 34);
		controleFinanceiro.getContentPane().add(lblNewLabel);
		
		JLabel lblSaldoMensal = new JLabel("Saldo Mensal");
		lblSaldoMensal.setHorizontalAlignment(SwingConstants.CENTER);
		lblSaldoMensal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSaldoMensal.setBounds(584, 93, 92, 34);
		controleFinanceiro.getContentPane().add(lblSaldoMensal);
		
		JLabel lblDespesas = new JLabel("Despesas");
		lblDespesas.setHorizontalAlignment(SwingConstants.CENTER);
		lblDespesas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDespesas.setBounds(339, 93, 92, 34);
		controleFinanceiro.getContentPane().add(lblDespesas);
		
		JLabel lblR = new JLabel("R$ 14.105,28");
		lblR.setForeground(new Color(34, 139, 34));
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		lblR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblR.setBounds(95, 134, 92, 34);
		controleFinanceiro.getContentPane().add(lblR);
		
		JLabel lblr = new JLabel("-R$ 9.046,05");
		lblr.setHorizontalAlignment(SwingConstants.CENTER);
		lblr.setForeground(Color.RED);
		lblr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblr.setBounds(339, 138, 92, 34);
		controleFinanceiro.getContentPane().add(lblr);
		
		JLabel lblR_1 = new JLabel("R$ 5.029,23");
		lblR_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblR_1.setForeground(Color.BLUE);
		lblR_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblR_1.setBounds(584, 138, 92, 34);
		controleFinanceiro.getContentPane().add(lblR_1);
		
		controleFinanceiro.setBounds(100, 100, 900, 600);
		controleFinanceiro.setResizable(false);
		controleFinanceiro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
