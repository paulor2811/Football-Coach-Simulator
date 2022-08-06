package br.paulo.Game.Tela;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Tela extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon image, iconeTitulo; //iconeButtonStartGame;
	private JButton btnStartGame;
	private JLabel bakcgorundLabel;
	
	private Menu menu;
	
	public void initComponents() {
		
		System.out.println("Iniciando componentes...");
		
		Frame();
		this.setVisible(true);
	}
	
	public void Frame() {
		
		this.setTitle("Football Coach Simulator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setResizable(false);
        this.setLocation(-8, 0);
        
        try {
        	this.iconeTitulo = new ImageIcon(getClass().getResource("/br/paulo/Game/Tela/resources/imagens/neymaricon.jpg"));
        	this.setIconImage(iconeTitulo.getImage());
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        
        System.out.println("JFrame criado...");
        
        try {
        	this.image = new ImageIcon(getClass().getResource("/br/paulo/Game/Tela/resources/imagens/neymarbg.jpg"));
        	setBackground(this.image);
        } catch(Exception e) {
        	System.out.println(e.getMessage());
        }
        System.out.println("Background setado...");
        
        buttonStartGame();
        System.out.println("Botão start criado...");
	}
	
	private void setBackground(ImageIcon image) {
        this.bakcgorundLabel = new JLabel(image);
        this.add(bakcgorundLabel);
	}
	private void buttonStartGame() {
		this.btnStartGame = new JButton("Iniciar Jogo");
		this.btnStartGame.setBounds(1920 / 2 - 244, 1080 / 2 + 200, 488, 50);
		this.bakcgorundLabel.add(this.btnStartGame);
		
		/*try {
        	this.iconeButtonStartGame = new ImageIcon(getClass().getResource("/br/paulo/Game/Tela/resources/imagens/neymargificonbuttonstartgame.gif"));
        	this.btnStartGame.setIcon(iconeButtonStartGame);
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }*/
		
		this.btnStartGame.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) { 
	        	Tela.this.btnStartGame.setVisible(false);
	        	Tela.this.menu = new Menu();
	        	menu.Menu();
			}  
		}); 
	}
}
