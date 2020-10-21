package Ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Procesos.OperacionLogica;
import Procesos.ProcesoPila;

public class Proceso2 extends JFrame {
	JEditorPane editorPane_1;
	public Proceso2() {
		super("Proceso");
		setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        
        
        
        JLabel lblNewLabel = new JLabel("Operaciones Logicas");
        lblNewLabel.setFont(new Font("Ubuntu", Font.PLAIN, 20));
        lblNewLabel.setBounds(121, 27, 319, 23);
        getContentPane().add(lblNewLabel);
        
        editorPane_1 = new JEditorPane();
        editorPane_1.setBounds(10, 117, 474, 225);
        editorPane_1.setBorder(BorderFactory.createLineBorder(Color.black));
        getContentPane().add(editorPane_1);
        
        JButton btnNewButton = new JButton("Empezar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		OperacionLogica ol=new OperacionLogica(editorPane_1);
        		
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
         btnNewButton1.setBounds(163, 420, 135, 23);
        getContentPane().add(btnNewButton1);
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.pink);
        setVisible(true);
        
       
	}
}
