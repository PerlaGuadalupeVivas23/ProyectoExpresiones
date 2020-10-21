package Procesos;
import java.util.ArrayList;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Proceso3  {
	
	JTextField ve= new JTextField();
	JTextArea pe=new JTextArea();
	ArrayList <String>lista_cadena = new ArrayList();
	ArrayList <String>lista_n = new ArrayList();
	
	
	public Proceso3(JTextField leer,JTextArea pe) {
		
		this.ve = leer;
		this.pe=pe;
		
		
		String cadena, letras="", numeros="";
		System.out.println("Ingrese un caracter u numero");
		cadena=leer.getText();
		char []arreglo=cadena.toCharArray();
		for(int i=0; i<arreglo.length; i++){
		if(Character.isLetter(arreglo[i])){
		letras+=arreglo[i];
		System.out.println("Letra ingresada: " + arreglo[i]);
		lista_cadena.add("Letra ingresada: " + arreglo[i]);
		}
		else if(Character.isDigit(arreglo[i])){
		 numeros+=arreglo[i];
		 System.out.println("Numero ingresado: " + arreglo[i]);
		 lista_cadena.add("Numero ingresado: " + arreglo[i]);
		    }
		}
		for(String n: lista_cadena) {
		
			pe.append("\n"+ n + "\n");
		}
		
		
	}
	
