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

public class CadastroServicosGerais extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoIdade;
	private JTextField campoSalario;
	private JTextField campoIdentidade;
	private JTextField campoCpf;
	private JTextField campoTelefone;
	private JTextField campoEstado;
	private JTextField campoCidade;
	private JTextField campoBairro;
	private JTextField campoRua;
	private JTextField campoCrm;
	private JLabel labelCargaHoraria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroServicosGerais frame = new CadastroServicosGerais();
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
	public CadastroServicosGerais() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNomeTela = new JLabel("Cadastro de Serviços Gerais:");
		labelNomeTela.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelNomeTela.setBounds(185, 11, 230, 20);
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
		
		JLabel labelSalario = new JLabel("Salário:");
		labelSalario.setBounds(10, 134, 45, 15);
		contentPane.add(labelSalario);
		
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
		
		JLabel labelFuncao = new JLabel("Função:");
		labelFuncao.setBounds(10, 215, 60, 15);
		contentPane.add(labelFuncao);
		
		labelCargaHoraria = new JLabel("Carga Horária:");
		labelCargaHoraria.setBounds(397, 53, 90, 15);
		contentPane.add(labelCargaHoraria);
		
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
		
		campoSalario = new JTextField();
		campoSalario.setBounds(57, 131, 90, 20);
		contentPane.add(campoSalario);
		campoSalario.setColumns(10);
		
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
		
		campoCrm = new JTextField();
		campoCrm.setBounds(70, 212, 137, 20);
		contentPane.add(campoCrm);
		campoCrm.setColumns(10);
		
		JCheckBox checkBoxSeg = new JCheckBox("Segunda");
		checkBoxSeg.setBounds(390, 77, 80, 20);
		contentPane.add(checkBoxSeg);
		
		JCheckBox checkBoxTer = new JCheckBox("Terça");
		checkBoxTer.setBounds(390, 104, 80, 20);
		contentPane.add(checkBoxTer);
		
		JCheckBox checkBoxQua = new JCheckBox("Quarta");
		checkBoxQua.setBounds(390, 131, 80, 20);
		contentPane.add(checkBoxQua);
		
		JCheckBox checkBoxQui = new JCheckBox("Quinta");
		checkBoxQui.setBounds(390, 158, 80, 20);
		contentPane.add(checkBoxQui);
		
		JCheckBox checkBoxSex = new JCheckBox("Sexta");
		checkBoxSex.setBounds(390, 185, 80, 20);
		contentPane.add(checkBoxSex);
		
		JCheckBox checkBoxSab = new JCheckBox("Sábado");
		checkBoxSab.setBounds(390, 212, 80, 20);
		contentPane.add(checkBoxSab);
		
		JCheckBox checkBoxDom = new JCheckBox("Domingo");
		checkBoxDom.setBounds(390, 239, 80, 20);
		contentPane.add(checkBoxDom);
		
		JComboBox comboBoxSeg = new JComboBox();
		comboBoxSeg.setModel(new DefaultComboBoxModel(new String[] {"Matinal", "Vespertino", "Noturno"}));
		comboBoxSeg.setBounds(477, 77, 90, 20);
		contentPane.add(comboBoxSeg);
		
		JComboBox comboBoxTer = new JComboBox();
		comboBoxTer.setModel(new DefaultComboBoxModel(new String[] {"Matinal", "Vespertino", "Noturno"}));
		comboBoxTer.setBounds(477, 104, 90, 20);
		contentPane.add(comboBoxTer);
		
		JComboBox comboBoxQua = new JComboBox();
		comboBoxQua.setModel(new DefaultComboBoxModel(new String[] {"Matinal", "Vespertino", "Noturno"}));
		comboBoxQua.setBounds(477, 131, 90, 20);
		contentPane.add(comboBoxQua);
		
		JComboBox comboBoxQui = new JComboBox();
		comboBoxQui.setModel(new DefaultComboBoxModel(new String[] {"Matinal", "Vespertino", "Noturno"}));
		comboBoxQui.setBounds(477, 158, 90, 20);
		contentPane.add(comboBoxQui);
		
		JComboBox comboBoxSex = new JComboBox();
		comboBoxSex.setModel(new DefaultComboBoxModel(new String[] {"Matinal", "Vespertino", "Noturno"}));
		comboBoxSex.setBounds(477, 185, 90, 20);
		contentPane.add(comboBoxSex);
		
		JComboBox comboBoxSab = new JComboBox();
		comboBoxSab.setModel(new DefaultComboBoxModel(new String[] {"Matinal", "Vespertino", "Noturno"}));
		comboBoxSab.setBounds(477, 212, 90, 20);
		contentPane.add(comboBoxSab);
		
		JComboBox comboBoxDom = new JComboBox();
		comboBoxDom.setModel(new DefaultComboBoxModel(new String[] {"Matinal", "Vespertino", "Noturno"}));
		comboBoxDom.setBounds(477, 239, 90, 20);
		contentPane.add(comboBoxDom);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(170, 280, 120, 23);
		contentPane.add(botaoSalvar);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(310, 280, 120, 23);
		contentPane.add(botaoCancelar);
	}
}
