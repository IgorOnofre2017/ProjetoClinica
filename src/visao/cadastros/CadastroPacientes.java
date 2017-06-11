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

public class CadastroPacientes extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoIdade;
	private JTextField campoIdentidade;
	private JTextField campoCpf;
	private JTextField campoTelefone;
	private JTextField campoEstado;
	private JTextField campoCidade;
	private JTextField campoBairro;
	private JTextField campoRua;
	private JTextField campoSus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPacientes frame = new CadastroPacientes();
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
	public CadastroPacientes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 380, 310);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNomeTela = new JLabel("Cadastro de Paciente:");
		labelNomeTela.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelNomeTela.setBounds(100, 11, 180, 20);
		contentPane.add(labelNomeTela);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setBounds(10, 53, 50, 15);
		contentPane.add(labelNome);
		
		JLabel labelIdade = new JLabel("Idade:");
		labelIdade.setBounds(10, 80, 50, 15);
		contentPane.add(labelIdade);
		
		JLabel labelSexo = new JLabel("Sexo:");
		labelSexo.setBounds(10, 107, 50, 15);
		contentPane.add(labelSexo);
		
		JLabel labelIdentidade = new JLabel("Identidade:");
		labelIdentidade.setBounds(160, 80, 65, 14);
		contentPane.add(labelIdentidade);
		
		JLabel labelCpf = new JLabel("CPF:");
		labelCpf.setBounds(160, 107, 50, 14);
		contentPane.add(labelCpf);
		
		JLabel labelTelefone = new JLabel("Telefone:");
		labelTelefone.setBounds(160, 134, 60, 14);
		contentPane.add(labelTelefone);
		
		JLabel labelEndereco = new JLabel("Endereço:");
		labelEndereco.setBounds(10, 161, 60, 15);
		contentPane.add(labelEndereco);
		
		JLabel labelSus = new JLabel("SUS:");
		labelSus.setBounds(10, 215, 60, 15);
		contentPane.add(labelSus);
		
		campoNome = new JTextField();
		campoNome.setBounds(57, 50, 305, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		campoIdade = new JTextField();
		campoIdade.setBounds(57, 77, 90, 20);
		contentPane.add(campoIdade);
		campoIdade.setColumns(10);
		
		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		comboBoxSexo.setBounds(57, 104, 90, 20);
		contentPane.add(comboBoxSexo);
		
		campoIdentidade = new JTextField();
		campoIdentidade.setBounds(225, 77, 137, 20);
		contentPane.add(campoIdentidade);
		campoIdentidade.setColumns(10);
		
		campoCpf = new JTextField();
		campoCpf.setColumns(10);
		campoCpf.setBounds(225, 104, 137, 20);
		contentPane.add(campoCpf);
		
		campoTelefone = new JTextField();
		campoTelefone.setColumns(10);
		campoTelefone.setBounds(225, 131, 137, 20);
		contentPane.add(campoTelefone);
		
		campoEstado = new JTextField();
		campoEstado.setBounds(70, 158, 137, 20);
		contentPane.add(campoEstado);
		campoEstado.setColumns(10);
		
		campoCidade = new JTextField();
		campoCidade.setBounds(225, 158, 137, 20);
		contentPane.add(campoCidade);
		campoCidade.setColumns(10);
		
		campoBairro = new JTextField();
		campoBairro.setColumns(10);
		campoBairro.setBounds(70, 185, 137, 20);
		contentPane.add(campoBairro);
		
		campoRua = new JTextField();
		campoRua.setColumns(10);
		campoRua.setBounds(225, 185, 137, 20);
		contentPane.add(campoRua);
		
		campoSus = new JTextField();
		campoSus.setBounds(70, 212, 137, 20);
		contentPane.add(campoSus);
		campoSus.setColumns(10);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(70, 239, 137, 23);
		contentPane.add(botaoSalvar);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(225, 239, 137, 23);
		contentPane.add(botaoCancelar);
	}
}
