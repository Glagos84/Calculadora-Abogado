package calculadoraGui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class FrameCalculadora extends JFrame 
{

	private JPanel contentPane;
	double numero1;
	double numero2;
	double resultado;
	String operacion;
	int contador=0;
	private JTextField campo_Texto;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCalculadora frame = new FrameCalculadora();
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
	public FrameCalculadora() {
		setTitle("Calculadora para Abogados");
		setForeground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton num_1 = new JButton("1");
		num_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
			String obtiene;
			obtiene = campo_Texto.getText() + num_1.getText();
			campo_Texto.setText(obtiene);
				
				
			}
		});
		num_1.setBounds(10, 11, 50, 25);
		contentPane.add(num_1);
		
		JButton num_2 = new JButton("2");
		num_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String obtiene;
				obtiene = campo_Texto.getText() + num_2.getText();
				campo_Texto.setText(obtiene);
				
			}
		});
		num_2.setBounds(70, 11, 50, 25);
		contentPane.add(num_2);
		
		JButton num_3 = new JButton("3");
		num_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String obtiene;
				obtiene = campo_Texto.getText() + num_3.getText();
				campo_Texto.setText(obtiene);
			}
		});
		num_3.setBounds(130, 11, 50, 25);
		contentPane.add(num_3);
		
		JButton num_4 = new JButton("4");
		num_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String obtiene;
				obtiene = campo_Texto.getText() + num_4.getText();
				campo_Texto.setText(obtiene);
				
			}
		});
		num_4.setBounds(10, 35, 50, 25);
		contentPane.add(num_4);
		
		JButton num_5 = new JButton("5");
		num_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String obtiene;
				obtiene = campo_Texto.getText() + num_5.getText();
				campo_Texto.setText(obtiene);
				
			}
		});
		num_5.setBounds(70, 35, 50, 25);
		contentPane.add(num_5);
		
		JButton num_6 = new JButton("6");
		num_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String obtiene;
				obtiene = campo_Texto.getText() + num_6.getText();
				campo_Texto.setText(obtiene);
				
			}
		});
		num_6.setBounds(130, 35, 50, 25);
		contentPane.add(num_6);
		
		JButton borrar = new JButton("C");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				campo_Texto.setText("");
			}
		});
		borrar.setBounds(130, 84, 50, 25);
		contentPane.add(borrar);
		
		JButton num_cero = new JButton("0");
		num_cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String obtiene;
				obtiene = campo_Texto.getText() + num_cero.getText();
				campo_Texto.setText(obtiene);
				
			}
		});
		num_cero.setBounds(70, 84, 50, 25);
		contentPane.add(num_cero);
		
		JButton punto = new JButton(".");
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String obtiene;
				obtiene = campo_Texto.getText() + punto.getText();
				campo_Texto.setText(obtiene);
				
			}
		});
		punto.setBounds(10, 84, 50, 25);
		contentPane.add(punto);
		
		JButton num_7 = new JButton("7");
		num_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String obtiene;
				obtiene = campo_Texto.getText() + num_7.getText();
				campo_Texto.setText(obtiene);
				
			}
		});
		num_7.setBounds(10, 60, 50, 25);
		contentPane.add(num_7);
		
		JButton num_8 = new JButton("8");
		num_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String obtiene;
				obtiene = campo_Texto.getText() + num_8.getText();
				campo_Texto.setText(obtiene);
				
			}
		});
		num_8.setBounds(70, 60, 50, 25);
		contentPane.add(num_8);
		
		JButton num_9 = new JButton("9");
		num_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String obtiene;
				obtiene = campo_Texto.getText() + num_9.getText();
				campo_Texto.setText(obtiene);
				
			}
		});
		num_9.setBounds(130, 60, 50, 25);
		contentPane.add(num_9);
		
		JButton sumar = new JButton("+");
		sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				numero1 = Double.parseDouble(campo_Texto.getText());
				numero2 = Double.parseDouble(campo_Texto.getText());
				campo_Texto.setText("+");
				operacion = "+";
				
				
			}
		});
		sumar.setBounds(196, 46, 50, 25);
		contentPane.add(sumar);
		
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				String opcion;
				switch (operacion)
				
				{
				
				case "+":
				
				resultado  = numero1 + numero2;
				opcion = String.format("%.1f", resultado);
				campo_Texto.setText(opcion);
				break;
				
				case "*":
				
				resultado  = numero1 * numero2;
				opcion = String.format("%.1f", resultado);
				campo_Texto.setText(opcion);
				break;
				
				case "-":
					
				resultado  = numero1 - numero2;
				opcion = String.format("%.1f", resultado);
				campo_Texto.setText(opcion);
				break;
				
				case "/":
					
				resultado  = numero1 / numero2;
				opcion = String.format("%.1f", resultado);
				campo_Texto.setText(opcion);
				break;
				
				
				}
				
			}
		});
		igual.setBounds(248, 46, 50, 25);
		contentPane.add(igual);
		
		JButton restar = new JButton("-");
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				numero1 = Double.parseDouble(campo_Texto.getText());
				numero2 = Double.parseDouble(campo_Texto.getText());
				campo_Texto.setText("");
				operacion = "-";
				
			}
		});
		restar.setBounds(300, 46, 50, 25);
		contentPane.add(restar);
		
		JButton multi = new JButton("*");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				numero1 = Double.parseDouble(campo_Texto.getText());
				numero2 = Double.parseDouble(campo_Texto.getText());
				campo_Texto.setText("");
				operacion = "*";
				
			}
		});
		multi.setBounds(248, 22, 50, 25);
		contentPane.add(multi);
		
		JButton dividir = new JButton("/");
		dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				numero1 = Double.parseDouble(campo_Texto.getText());
				numero2 = Double.parseDouble(campo_Texto.getText());
				campo_Texto.setText("");
				operacion = "/";
				
			}
		});
		dividir.setBounds(248, 71, 50, 25);
		contentPane.add(dividir);
		
		campo_Texto = new JTextField();
		campo_Texto.setBounds(422, 11, 86, 20);
		contentPane.add(campo_Texto);
		campo_Texto.setColumns(10);
	}
}
