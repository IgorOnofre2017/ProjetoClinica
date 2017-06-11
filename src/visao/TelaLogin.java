package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField campoUsuario;
	private JPasswordField campoSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		//Esse setLocation faz com que o  jFrame inicie no meio da tela
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelUsuario = new JLabel("Usuário:");
		labelUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelUsuario.setBounds(205, 36, 60, 15);
		contentPane.add(labelUsuario);
		
		JLabel labelSenha = new JLabel("Senha:");
		labelSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelSenha.setBounds(205, 78, 60, 15);
		contentPane.add(labelSenha);
		
		campoUsuario = new JTextField();
		campoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		campoUsuario.setBounds(275, 28, 175, 30);
		contentPane.add(campoUsuario);
		campoUsuario.setColumns(10);
		
		campoSenha = new JPasswordField();
		campoSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		campoSenha.setBounds(275, 70, 175, 30);
		contentPane.add(campoSenha);
		
		JButton botaoOK = new JButton("OK");
		botaoOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(campoUsuario.getText().equals("admin") && campoSenha.getText().equals("123")){
					TelaPrincipal tela = new TelaPrincipal();
					tela.setVisible(true);
					dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Usuário ou Senha inválidos!!!");
					campoUsuario.setText("");
					campoSenha.setText("");
				}
			}
		});
		botaoOK.setBounds(205, 114, 120, 30);
		contentPane.add(botaoOK);
		
		JButton botaoCANCEL = new JButton("CANCEL");
		botaoCANCEL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campoUsuario.setText("");
				campoSenha.setText("");
			}
		});
		botaoCANCEL.setBounds(330, 114, 120, 30);
		contentPane.add(botaoCANCEL);
	}
}
