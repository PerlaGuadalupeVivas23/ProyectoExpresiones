package Ventanas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Primer_Ventana extends JFrame {
	public Primer_Ventana() {
             //Color JFrame
       
		super("Escoge una opcion...");
		setSize(500 , 450);
		setResizable(false);
		getContentPane().setLayout(null);
		JLabel etiq1 = new JLabel();
                etiq1.setText( "===PROGRAMACIÒN LOGICA Y FUNCIONAL===" );
                add( etiq1 );
                etiq1.setBounds(130, 20, 400, 60);
		getContentPane().add(etiq1);
		JButton btnNewButton = new JButton("Aritmetico");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Ventana_Principal().setVisible(true);
			}
		});
		btnNewButton.setBounds(190, 70, 104, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Logico");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Proceso2();
                                 dispose();
			}
		});
		btnNewButton_1.setBounds(190, 130, 104, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Proceso3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Ventana3();
                                dispose();
			}
		});
		btnNewButton_2.setBounds(190, 205, 104, 23);
		getContentPane().add(btnNewButton_2);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		 JButton btnNewButton1 = new JButton("Cerrar");
        btnNewButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                        dispose();
        		
        	}
        });
         btnNewButton1.setBounds(190, 300, 95, 23);
        getContentPane().add(btnNewButton1);
        setLocationRelativeTo(null);
        
     
                 this.getContentPane().setBackground(Color.pink);

        //Color JPanel
      
		setVisible(true);
	}
	
}
