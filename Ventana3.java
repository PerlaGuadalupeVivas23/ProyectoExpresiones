package Ventanas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Procesos.Proceso3;
import Procesos.ProcesoPila;
import java.awt.Color;
import javax.swing.JScrollPane;

public class Ventana3 extends JFrame{
	
	private JTextField textField_1;
	private JScrollPane scrollPane;
	
	public Ventana3() {
		super("Ventana");
		setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        
        textField_1 = new JTextField();
        textField_1.setBounds(68, 46, 336, 32);
        getContentPane().add(textField_1);
        
        
        JLabel lblNewLabel = new JLabel("Ingrese su frase:");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(68, 21, 157, 14);
        getContentPane().add(lblNewLabel);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 135, 474, 204);
        getContentPane().add(scrollPane);
        
        JTextArea textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        
        JButton btnNewButton = new JButton("Empezar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Proceso3 p3 = new Proceso3(textField_1,textArea);
        		
        	}
        });
        btnNewButton.setBounds(163, 365, 127, 23);
        getContentPane().add(btnNewButton);
         JButton btnNewButton1 = new JButton("Regresar a Inicio");
        btnNewButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Primer_Ventana p1=new Primer_Ventana();
                        dispose();
        		
        	}
        });
         btnNewButton1.setBounds(163, 420, 140, 23);
        getContentPane().add(btnNewButton1);
        setLocationRelativeTo(null);
        
        this.getContentPane().setBackground(Color.pink);
        
        setVisible(true);
        
	}
}
