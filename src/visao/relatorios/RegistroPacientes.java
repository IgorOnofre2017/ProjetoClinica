package visao.relatorios;

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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import visao.cadastros.CadastroPacientes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroPacientes extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroPacientes frame = new RegistroPacientes();
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
	public RegistroPacientes() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelNomeTela = new JLabel("Registro dos Pacientes:");
		labelNomeTela.setFont(new Font("Tahoma", Font.PLAIN, 18));
		labelNomeTela.setBounds(205, 11, 190, 20);
		contentPane.add(labelNomeTela);
		
		JLabel labelNome = new JLabel("Nome:");
		labelNome.setBounds(10, 53, 50, 15);
		contentPane.add(labelNome);
		
		campoNome = new JTextField();
		campoNome.setBounds(57, 50, 388, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JButton botaoPesquisar = new JButton("Pesquisar");
		botaoPesquisar.setBounds(464, 48, 120, 23);
		contentPane.add(botaoPesquisar);
		
		JButton botaoNovo = new JButton("Novo");
		botaoNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPacientes tela = new CadastroPacientes();
				tela.setVisible(true);
			}
		});
		botaoNovo.setBounds(110, 288, 120, 23);
		contentPane.add(botaoNovo);
		
		JButton botaoAlterar = new JButton("Alterar");
		botaoAlterar.setBounds(240, 288, 120, 23);
		contentPane.add(botaoAlterar);
		
		JButton botaoExcluir = new JButton("Excluir");
		botaoExcluir.setBounds(370, 288, 120, 23);
		contentPane.add(botaoExcluir);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table.setBounds(10, 80, 574, 190);
		contentPane.add(table);
	}
}
