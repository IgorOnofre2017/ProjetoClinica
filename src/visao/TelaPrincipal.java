package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import visao.cadastros.CadastroEnfermeiros;
import visao.cadastros.CadastroMedicos;
import visao.cadastros.CadastroPacientes;
import visao.cadastros.CadastroServicosGerais;
import visao.cadastros.EncaminharExame;
import visao.cadastros.MarcarConsulta;
import visao.relatorios.RegistroConsultas;
import visao.relatorios.RegistroEnfermeiros;
import visao.relatorios.RegistroExamesEncaminhados;
import visao.relatorios.RegistroMedicos;
import visao.relatorios.RegistroPacientes;
import visao.relatorios.RegistroServicosGerais;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 684, 21);
		contentPane.add(menuBar);
		
		JMenu menuCadastro = new JMenu("Cadastro");
		menuBar.add(menuCadastro);
		
		JMenuItem cadMedico = new JMenuItem("Médico");
		cadMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroMedicos tela = new CadastroMedicos();
				tela.setVisible(true);
			}
		});
		menuCadastro.add(cadMedico);
		
		JMenuItem cadPaciente = new JMenuItem("Paciente");
		cadPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPacientes tela = new CadastroPacientes();
				tela.setVisible(true);
			}
		});
		menuCadastro.add(cadPaciente);
		
		JMenuItem cadExame = new JMenuItem("Exame");
		cadExame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EncaminharExame tela = new EncaminharExame();
				tela.setVisible(true);
			}
		});
		menuCadastro.add(cadExame);
		
		JMenuItem cadConsulta = new JMenuItem("Consulta");
		cadConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MarcarConsulta tela = new MarcarConsulta();
				tela.setVisible(true);
			}
		});
		menuCadastro.add(cadConsulta);
		
		JMenuItem cadEnfermeiro = new JMenuItem("Enfermeiro");
		cadEnfermeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroEnfermeiros tela = new CadastroEnfermeiros();
				tela.setVisible(true);
			}
		});
		menuCadastro.add(cadEnfermeiro);
		
		JMenuItem cadServiosGerais = new JMenuItem("Serviços Gerais");
		cadServiosGerais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroServicosGerais tela = new CadastroServicosGerais();
				tela.setVisible(true);
			}
		});
		menuCadastro.add(cadServiosGerais);
		
		JMenu menuRelatorio = new JMenu("Relatório");
		menuBar.add(menuRelatorio);
		
		JMenuItem relatMedico = new JMenuItem("Médico");
		relatMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistroMedicos tela = new RegistroMedicos();
				tela.setVisible(true);
			}
		});
		menuRelatorio.add(relatMedico);
		
		JMenuItem relatPaciente = new JMenuItem("Paciente");
		relatPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroPacientes tela = new RegistroPacientes();
				tela.setVisible(true);
			}
		});
		menuRelatorio.add(relatPaciente);
		
		JMenuItem relatExame = new JMenuItem("Exame");
		relatExame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroExamesEncaminhados tela = new RegistroExamesEncaminhados();
				tela.setVisible(true);
			}
		});
		menuRelatorio.add(relatExame);
		
		JMenuItem relatConsulta = new JMenuItem("Consulta");
		relatConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroConsultas tela = new RegistroConsultas();
				tela.setVisible(true);
			}
		});
		menuRelatorio.add(relatConsulta);
		
		JMenuItem relatEnfermeiro = new JMenuItem("Enfermeiro");
		relatEnfermeiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroEnfermeiros tela = new RegistroEnfermeiros();
				tela.setVisible(true);
			}
		});
		menuRelatorio.add(relatEnfermeiro);
		
		JMenuItem relatServiosGerais = new JMenuItem("Serviços Gerais");
		relatServiosGerais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroServicosGerais tela = new RegistroServicosGerais();
				tela.setVisible(true);
			}
		});
		menuRelatorio.add(relatServiosGerais);
		
		JMenu menuSair = new JMenu("Sair");
		menuBar.add(menuSair);
		
		JMenuItem sair = new JMenuItem("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		menuSair.add(sair);
	}
}
