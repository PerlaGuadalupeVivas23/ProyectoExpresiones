package Procesos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import javax.swing.JEditorPane;
public class ProcesoPila {
    Stack pilaFinal = new Stack();
    Stack pilaOperaciones = new Stack();
    String respuesta;
    JEditorPane ed = new JEditorPane();
    
    public ProcesoPila(JEditorPane edp){
    	this.ed = edp;
        respuesta="(6+2)*3/2^2-4";
        separar(respuesta); //infija 
        
    }
    
    private void separar(String operacion){
        String prefijo= "(?=[-+*/^])";
         String sufijo= "(?<=[-+*/^])";
          String simbolos= "(?=[-+*/^()])|(?<=[-+*/^()])";
          

          String []arreglo =operacion.split(simbolos);
        
        InsertarEnPila(arreglo);
    }
    

    private void InsertarEnPila(String[] arreglo) {
        List cadena= new ArrayList();
        
        
        //recorre el arreglo que hicimos con el split
         for(int i = 0; i < arreglo.length; i++){
             
             //necesitamos saber si el string es un numero
             if(isNumeric(arreglo[i])){
                 
                 //insertar a la pila numerica
                 cadena.add(arreglo[i]);
                 if(i == arreglo.length-1){
                     while(!pilaOperaciones.empty()){
                         cadena.add(pilaOperaciones.peek());
                         pilaOperaciones.pop();
                     }
                 }
             }else{
                 //insertar a la pila Operaciones
                 
                        int prioridad= prioridad(arreglo[i]);
                       
                        switch(prioridad){
                        case 0:
                                if(!pilaOperaciones.empty()){
                                int prioridadPila = prioridad((String) pilaOperaciones.peek());
                                
                             // 2 == 0
                             if(prioridadPila == prioridad){
                                 cadena.add(pilaOperaciones.peek());
                                 pilaOperaciones.pop();        
                                 
                             }else if(prioridadPila>prioridad) {
                                 while(!pilaOperaciones.empty()){
                                     cadena.add(pilaOperaciones.peek());
                                     pilaOperaciones.pop();
                                 }
                                     
                                 }
                             }
                                   pilaOperaciones.push(arreglo[i]);
                            break;
                            
                            case 1:
                                if(!pilaOperaciones.empty()){
                                int prioridadPila = prioridad((String) pilaOperaciones.peek());
                              // *     ==  / 
                                if(prioridadPila== prioridad){
                                    cadena.add(pilaOperaciones.peek());
                                    pilaOperaciones.pop();     
                                }else if(prioridadPila<prioridad){
                                    while(!pilaOperaciones.empty()){
                                        cadena.add(pilaOperaciones.peek());
                                        pilaOperaciones.pop();
                                    }
                                }
                                    
                                }
                                pilaOperaciones.push(arreglo[i]);
                            break;
                            
                            
                            case 2:
                                pilaOperaciones.push(arreglo[i]);
                            break;
                            
                            case 3:
                               while(!pilaOperaciones.empty()){
                                 cadena.add(pilaOperaciones.peek());
                                 pilaOperaciones.pop();
                               }    
                             break;     
                            default:
                                break;
                        }        
                         }
             }
         System.out.println(cadena);
         convierteInsertaenPila(cadena);
         }
    
    private void convierteInsertaenPila(List cadena) {
    	 
        for (int i = 0; i < cadena.size(); i++) {
			//Esta l�nea es para saber de qu� tipo es el dato
				System.out.println(cadena.get(i)+ " es de tipo: " +  ((Object)cadena.get(i)).getClass().getSimpleName());
				
                                
			try {
				int numero = Integer.parseInt((String) cadena.get(i));
				pilaFinal.push(numero);
				System.out.println("Numero en pila: "+pilaFinal.peek());
                                
			}catch (NumberFormatException e){
				/*
				Realiza lo mencionado abajo en el pseudoc�digo
				*/
				pilaFinal.push(cadena.get(i));			
			}
		}
		
		System.out.println("El resultado es: "+pilaFinal.peek());		
	}
    

    
    public void Operaciones(){
         String token,token2,token3;
         Stack pila_aux = new Stack();
         Scanner scan = new Scanner(respuesta);
        for(int i=0;i<pilaFinal.size();i++){
                        
            if(isNumeric(pilaFinal.get(i).toString())){
                pila_aux.push(pilaFinal.get(i));
            }else if(pilaFinal.empty()){
                
            }
            else{
                
                String operador = (String) pilaFinal.get(i);
                double t1 = Double.parseDouble(pila_aux.pop().toString());
                double t2 = Double.parseDouble(pila_aux.pop().toString());
                double t3 = 0;
                
                switch(operador){
                    case "+":
                        t3 = t1+t2;
                        pila_aux.push(t3);
                    break;
                    case "-":
                        t3= t2 - t1;
                        pila_aux.push(t3);
                    break;
                    case "*":
                        t3 = t1*t2;
                        pila_aux.push(t3);
                    break;
                    case "/":
                        t3 = t2/t1;
                        pila_aux.push(t3);
                    break;
                    case "^":
                        t3 = Math.pow(t1,t2);
                        pila_aux.push(t3);
                    break;
                }
            }
        }
        for(int j=0;j<pila_aux.size();j++){
            System.out.println(pila_aux.get(j));
            ed.setText("El resultado de las operaciones realizadas es : "+pila_aux.get(j)+"\n\n\tFavor de revisar la consola para visualizar el proceso ->");
        }
    }

    //Solamente prioridad de simbolos
    private int prioridad(String arreglo) {
        
     if (arreglo.equals("+") || arreglo.equals("-"))
         
        return 0;
     
     else if (arreglo.equals("*") || arreglo.equals("/"))
         
     return 1;
     
     else if (arreglo.equals("^"))
         
     return 2;
     
     else if (arreglo.equals(")"))
         
      return 3;
     
     return -1;
}    //Fin de la funcion prioridad
    private boolean isNumeric(String string) {
        try{
            double d= Double.parseDouble(string);
        }catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }
}
