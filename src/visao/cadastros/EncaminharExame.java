package visao.cadastros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class EncaminharExame extends JFrame {

	private JPanel contentPane;
	private JTextField campoExame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EncaminharExame frame = new EncaminharExame();
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
	public EncaminharExame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNomeTela = new JLabel("Encaminhar Exame:");
		labelNomeTela.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelNomeTela.setBounds(120, 11, 160, 20);
		contentPane.add(labelNomeTela);
		
		JLabel labelMedico = new JLabel("Médico:");
		labelMedico.setBounds(10, 53, 60, 15);
		contentPane.add(labelMedico);
		
		JLabel labelPaciente = new JLabel("Paciente:");
		labelPaciente.setBounds(10, 80, 60, 15);
		contentPane.add(labelPaciente);
		
		JLabel labelExame = new JLabel("Exame:");
		labelExame.setBounds(10, 107, 60, 15);
		contentPane.add(labelExame);
		
		JComboBox comboBoxMedico = new JComboBox();
		comboBoxMedico.setBounds(70, 50, 314, 20);
		contentPane.add(comboBoxMedico);
		
		JComboBox comboBoxPaciente = new JComboBox();
		comboBoxPaciente.setBounds(70, 77, 314, 20);
		contentPane.add(comboBoxPaciente);
		
		campoExame = new JTextField();
		campoExame.setBounds(70, 104, 314, 20);
		contentPane.add(campoExame);
		campoExame.setColumns(10);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(70, 131, 120, 23);
		contentPane.add(botaoSalvar);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(210, 131, 120, 23);
		contentPane.add(botaoCancelar);
	}
}
