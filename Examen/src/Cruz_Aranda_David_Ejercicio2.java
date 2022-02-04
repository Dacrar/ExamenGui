import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Cruz_Aranda_David_Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField textMatricula;
	private JTextField textMarca;
	private JTextField textModelo;
	private JTextField textKm;
	private ArrayList<Autocar> lista;
	private JSpinner spinnerPlazas;
	private JTextArea textRes;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cruz_Aranda_David_Ejercicio2 frame = new Cruz_Aranda_David_Ejercicio2();
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
	public Cruz_Aranda_David_Ejercicio2() {
		lista = new ArrayList<Autocar>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[39.00,grow][150.00px,grow][56.00][150.00,grow]", "[34px][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("  Gesti\u00F3n autocares");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		contentPane.add(lblNewLabel, "cell 0 0 4 1,grow");
		
		JLabel lblMatricula = new JLabel("Matricula:");
		contentPane.add(lblMatricula, "cell 0 1,alignx right");
		
		textMatricula = new JTextField();
		contentPane.add(textMatricula, "cell 1 1,growx");
		textMatricula.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		contentPane.add(lblMarca, "cell 0 2,alignx right");
		
		textMarca = new JTextField();
		textMarca.setColumns(10);
		contentPane.add(textMarca, "cell 1 2,growx");
		
		JLabel lblModelo = new JLabel("Modelo:");
		contentPane.add(lblModelo, "cell 2 2,alignx right");
		
		textModelo = new JTextField();
		textModelo.setColumns(10);
		contentPane.add(textModelo, "cell 3 2,growx");
		
		JLabel lblKm = new JLabel("Kil\u00F3metros:");
		contentPane.add(lblKm, "cell 0 3,alignx right");
		
		textKm = new JTextField();
		textKm.setColumns(10);
		contentPane.add(textKm, "cell 1 3,growx");
		
		JLabel lblPlazas = new JLabel("Plazas:");
		contentPane.add(lblPlazas, "cell 2 3,alignx right");
		
		spinnerPlazas = new JSpinner();
		spinnerPlazas.setModel(new SpinnerNumberModel(30, 1, 80, 1));
		contentPane.add(spinnerPlazas, "cell 3 3");
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				insertar();
			}
		});
		contentPane.add(btnInsertar, "cell 1 4,alignx right");
		
		JButton btnMostrar = new JButton("Mostrar Datos");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mostrar();
			}
		});
		contentPane.add(btnMostrar, "cell 2 4");
		
		JScrollPane scrollRes = new JScrollPane();
		contentPane.add(scrollRes, "cell 0 5 4 1,grow");
		
		textRes = new JTextArea();
		scrollRes.setViewportView(textRes);
	}
	
	public void insertar() {
		
		Autocar a = new Autocar();
		
		
		if(textMatricula.getText()==null || textMatricula.getText().equals("") ||
				(textMarca.getText()==null || textMarca.getText().equals("")) || 
				(textKm.getText()==null || textKm.getText().equals("")) ||
				(textModelo.getText()==null || textModelo.getText().equals("")) ){
					JOptionPane.showMessageDialog(null,"Debe añadir todos los campos");
					return;
				}
				
		int num= (Integer)spinnerPlazas.getValue();
		
				a.setMatricula(textMatricula.getText());
				a.setMarca(textMarca.getText());
				a.setModelo(textModelo.getText());
				a.setKilometros(Integer.parseInt(textKm.getText()));
				a.setNum_plazas(num);
				
				
				if(lista.contains(a)) {
					JOptionPane.showMessageDialog(null,"La persona ya esta en la lista"); 
				} else {
					
					
					lista.add(a);
					
				}
		
	}
	
	public void mostrar() {
		
		textRes.setText("");
		for (Autocar autocar : lista) {
			textRes.setText(textRes.getText()+autocar.toString()+System.lineSeparator());
		}
		
		

		
	}
	
	
}
