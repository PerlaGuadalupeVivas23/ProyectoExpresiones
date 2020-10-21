package Ventanas;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Procesos.ProcesoPila;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_Principal extends JFrame{
	
	private JTextField textField;
	String f = "(6+2)*3/2^2-4";
	private JTextField textField_1;
	public static JEditorPane editorPane_1;
	
	public Ventana_Principal() {
		
		super("Ventana Principal");
        setSize(500,500);
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        
        textField_1 = new JTextField();
        textField_1.setBounds(68, 46, 336, 32);
        getContentPane().add(textField_1);
        textField_1.setText(f);
        
        JLabel lblNewLabel = new JLabel("Funcion");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(68, 21, 157, 14);
        getContentPane().add(lblNewLabel);
        
        editorPane_1 = new JEditorPane();
        editorPane_1.setBounds(10, 117, 474, 225);
        getContentPane().add(editorPane_1);
        
        JButton btnNewButton = new JButton("Empezar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ProcesoPila pp=new ProcesoPila(editorPane_1);
        		pp.Operaciones();
        	}
        });
        btnNewButton.setBounds(163, 365, 127, 23);
        getContentPane().add(btnNewButton);
        this.getContentPane().setBackground(Color.pink);
        setVisible(true);
        
        JButton btnNewButton1 = new JButton("Regresar a Inicio");
        btnNewButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Primer_Ventana p1=new Primer_Ventana();
                        dispose();
        		
        	}
        });
         btnNewButton1.setBounds(163, 420, 127, 23);
        getContentPane().add(btnNewButton1);
        setLocationRelativeTo(null);

        this.getContentPane().setBackground(Color.pink);
        setVisible(true);
 
       
        
       	}
}
