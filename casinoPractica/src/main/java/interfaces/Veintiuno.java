 package interfaces;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Veintiuno extends JPanel{
	
	private Ventana ventana;
	int tuNumero = 0;
	
	public Veintiuno(Ventana v) {
		
		super();
		setBackground(new Color(0, 206, 209));
		this.ventana = v;
		this.setSize(450,450);
		setLayout(null);
		
		
		JLabel lblBienvenidoAlVeintiuno = new JLabel("Bienvenido al veintiuno");
		lblBienvenidoAlVeintiuno.setForeground(Color.WHITE);
		lblBienvenidoAlVeintiuno.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblBienvenidoAlVeintiuno.setBounds(10, 26, 223, 42);
		add(lblBienvenidoAlVeintiuno);
		
		JLabel lblElObjetivoEs = new JLabel("El objetivo es acercarte lo m\u00E1ximo posible al n\u00FAmero 21 pero sin pasarte");
		lblElObjetivoEs.setForeground(Color.WHITE);
		lblElObjetivoEs.setBounds(10, 79, 351, 14);
		add(lblElObjetivoEs);
		
		JLabel lblSiLaBanca = new JLabel("Si la banca obtiene un n\u00FAmero superior al tuyo perder\u00E1s la partida");
		lblSiLaBanca.setForeground(Color.WHITE);
		lblSiLaBanca.setBounds(10, 104, 331, 14);
		add(lblSiLaBanca);
		
		JLabel lblTuNmero = new JLabel("Tu numero");
		lblTuNmero.setForeground(Color.WHITE);
		lblTuNmero.setBounds(10, 195, 76, 14);
		add(lblTuNmero);
		
		final JLabel lblNumeroJugador = new JLabel("");
		lblNumeroJugador.setForeground(Color.WHITE);
		lblNumeroJugador.setBounds(96, 195, 46, 14);
		add(lblNumeroJugador);
		
		JLabel lblNmeroDeLa = new JLabel("Numero de la banca");
		lblNmeroDeLa.setForeground(Color.WHITE);
		lblNmeroDeLa.setBounds(209, 195, 132, 14);
		add(lblNmeroDeLa);
		
		final JLabel lblNumeroBanca = new JLabel("");
		lblNumeroBanca.setForeground(Color.WHITE);
		lblNumeroBanca.setBounds(331, 195, 46, 14);
		add(lblNumeroBanca);
		
		final JLabel lblPerder = new JLabel("");
		lblPerder.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPerder.setForeground(Color.WHITE);
		lblPerder.setBounds(10, 343, 193, 19);
		add(lblPerder);
		
		JButton btnPedirCarta = new JButton("Pedir carta");
		btnPedirCarta.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int carta = (int) (Math.random() * 11) + 1;
				tuNumero = tuNumero + carta;
				lblNumeroJugador.setText(Integer.toString(tuNumero));
				if(tuNumero>21) {
					lblPerder.setText("Has perdido");
					lblNumeroJugador.setText("Reinicia");
					setEnabled(false);
				}
			}
		});
		btnPedirCarta.setBounds(10, 278, 89, 23);
		add(btnPedirCarta);
		
		JButton btnPlantarse = new JButton("Plantarse");
		btnPlantarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(isEnabled() == true) {
				int numeroBancaa = 0;
				while(numeroBancaa<tuNumero) {
					int carta = (int) (Math.random() * 11) + 1;
					numeroBancaa = numeroBancaa + carta;
					lblNumeroBanca.setText(Integer.toString(numeroBancaa));
				}
				if(numeroBancaa>21) {
					lblPerder.setText("HAS GANADO!");
				}else {
					lblPerder.setText("Has perdido");
					setEnabled(false); 
				}
				}
			}
		});
		btnPlantarse.setBounds(114, 278, 89, 23);
		add(btnPlantarse);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.irAlMenuJuegos();
			}
		});
		btnAtras.setBounds(331, 339, 89, 23);
		add(btnAtras);
		
		JButton btnReinicar = new JButton("Reinicar");
		btnReinicar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.setContentPane(new Veintiuno(ventana));
			}
		});
		btnReinicar.setBounds(331, 278, 89, 23);
		add(btnReinicar);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setBounds(0, 0, 450, 450);
		add(lblFoto);
		
		lblFoto.setIcon(new ImageIcon("./Imagenes/Veintiuno.jpg"));
	}
}

