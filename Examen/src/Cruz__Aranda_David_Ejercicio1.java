import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cruz__Aranda_David_Ejercicio1 extends JFrame {

	private JPanel content;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textPrecio;
	private JLabel lblOrigen;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnCalcular;
	private JRadioButton rdbtnTarjetaDorada;
	private JRadioButton rdbtnIdayVuelta;
	private JRadioButton rdbtnIda;
	private JComboBox comboDestino;
	private JComboBox comboOrigen;
	private JTextArea textRes;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cruz__Aranda_David_Ejercicio1 frame = new Cruz__Aranda_David_Ejercicio1();
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
	public Cruz__Aranda_David_Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 434);
		content = new JPanel();
		content.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(content);
		content.setLayout(new MigLayout("", "[54.00,grow][100.00,grow][100.00][100.00][100.00,grow]", "[32.00][24.00][10.00][][][][][][][grow]"));
		
		JLabel lblVentaBilletes = new JLabel("  Venta de billetes");
		lblVentaBilletes.setForeground(Color.WHITE);
		lblVentaBilletes.setBackground(Color.BLUE);
		lblVentaBilletes.setOpaque(true);
		lblVentaBilletes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		content.add(lblVentaBilletes, "cell 0 0 5 1,grow");
		
		lblOrigen = new JLabel("Origen:");
		content.add(lblOrigen, "cell 0 1,alignx trailing");
		
		comboOrigen = new JComboBox();
		comboOrigen.setModel(new DefaultComboBoxModel(new String[] {"", "Adamuz", "And\u00FAjar", "Cabra", "Carde\u00F1a", "Obejo", "Santaella"}));
		content.add(comboOrigen, "cell 1 1 4 1,growx");
		
		JLabel lblDestino = new JLabel("Destino:");
		content.add(lblDestino, "cell 0 3,alignx trailing");
		
		comboDestino = new JComboBox();
		comboDestino.setModel(new DefaultComboBoxModel(new String[] {"", "Adamuz", "And\u00FAjar", "Cabra", "Carde\u00F1a", "Obejo", "Santaella"}));
		content.add(comboDestino, "cell 1 3 4 1,growx");
		
		JLabel lblNombre = new JLabel("Nombre:");
		content.add(lblNombre, "cell 0 4,alignx trailing");
		
		textNombre = new JTextField();
		content.add(textNombre, "cell 1 4,growx");
		textNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		content.add(lblApellidos, "cell 2 4,alignx trailing");
		
		textApellidos = new JTextField();
		content.add(textApellidos, "cell 3 4 2 1,growx");
		textApellidos.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		content.add(lblPrecio, "cell 0 5,alignx trailing");
		
		textPrecio = new JTextField();
		content.add(textPrecio, "cell 1 5,growx");
		textPrecio.setColumns(10);
		
		JLabel lblBillete = new JLabel("Billete:");
		content.add(lblBillete, "cell 0 6,alignx right");
		
		rdbtnIda = new JRadioButton("Ida");
		buttonGroup.add(rdbtnIda);
		rdbtnIda.setSelected(true);
		content.add(rdbtnIda, "cell 1 6");
		
		rdbtnIdayVuelta = new JRadioButton("Ida y Vuelta");
		buttonGroup.add(rdbtnIdayVuelta);
		content.add(rdbtnIdayVuelta, "cell 2 6");
		
		rdbtnTarjetaDorada = new JRadioButton("Tarjeta Dorada");
		buttonGroup.add(rdbtnTarjetaDorada);
		content.add(rdbtnTarjetaDorada, "cell 3 6");
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcular();
				
			}
		});
		content.add(btnCalcular, "cell 2 7,grow");
		
		textRes = new JTextArea();
		content.add(textRes, "cell 0 9 5 1,grow");
	}
	public void calcular() {
		
		double p = Double.parseDouble(textPrecio.getText());
		
		if(comboOrigen.getSelectedIndex()==comboDestino.getSelectedIndex()) {
			JOptionPane.showMessageDialog(null, "Elige un destino diferente al Origen");
			
			}else {
		
			textRes.setText(textRes.getText() +"\n"+"Trayecto: " + comboOrigen.getSelectedItem() + " a " + comboDestino.getSelectedItem());
			textRes.setText(textRes.getText() + "\n" + "Viajero: " + textNombre.getText() +" "+textApellidos.getText());
			
		
		
		if(rdbtnIda.isSelected()) {
			textRes.setText(textRes.getText() + "\n" + "Precio: " + textPrecio.getText());
			}else if(rdbtnIdayVuelta.isSelected()) {
			textRes.setText(textRes.getText() + "\n" + "Precio: " + (p-(p*0.20)));
			}else {
			textRes.setText(textRes.getText() + "\n" + "Precio: " + (p-(p*0.30)));
			}
		
			}
	}
}
