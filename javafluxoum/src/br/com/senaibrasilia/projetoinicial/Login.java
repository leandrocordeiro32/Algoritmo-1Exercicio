package br.com.senaibrasilia.projetoinicial;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Login extends JFrame implements ActionListener {
	private JLabel lblUsuario;
	private JLabel lblSenha;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	private JButton btnLogar;
	private FlowLayout layout;
	private Container container;
	
	public Login(String titulo) {
		
		super();
		layout = new FlowLayout();
		//container = getContentPane(); Ou usa container ou usa add.
		btnLogar = new JButton("Logar");
		lblUsuario = new JLabel("Usuário");
		lblSenha = new JLabel("Senha");
		txtUsuario = new JTextField(40);
		txtSenha = new JPasswordField(40);
		
		add(lblUsuario);
		add(txtUsuario);
		add(lblSenha);
		add(txtSenha);
		add(btnLogar);
		
		btnLogar.addActionListener(this);
		setLayout(layout);
		setSize(800,600);
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		setTitle(titulo + "-" + localDate.format(formatBarra));
		
		//setTitle(titulo + " - " + localDate.getDayOfWeek().name());
		//setTitle(titulo + " - " + localDate.getDayOfMonth() + "/" + localDate.getMonthValue());

		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String usuario = "leandro";
		String senha = "123456";
		
		String strPass = new String(txtSenha.getPassword()).trim();
		
		if (txtUsuario.getText().equals(usuario) && strPass.equals(senha)) {
			JOptionPane.showMessageDialog(null , "Usuário Logado");
		} else {
			JOptionPane.showMessageDialog(null , "Usuário e/ou Senha Inválidos");
		}
		JOptionPane.showMessageDialog(null ,"Você clicou aqui");
	}
	
}
