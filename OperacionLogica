package Procesos;

import javax.swing.JEditorPane;

public class OperacionLogica {
	JEditorPane ed= new JEditorPane();
	public OperacionLogica(JEditorPane ed){
		this.ed=ed;
        op();
    }
    
    public void op(){
    boolean p= true, q= false;
    
    boolean negacion1= !p,
            negacion2=!q;
    
    boolean and1= p && p,
            and2= p && q,
            and3 =q && p,
            and4= q && q;
    
    boolean or1= p||p,
            or2= p||q,
            or3= q||p,
            or4= q||q;
    
  
    
    	String v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;
    	
      	System.out.println("�" + p + ":" + negacion1);
      	v1="�" + p + ":" + negacion1;
        System.out.println("�" + q + ":" + negacion2);
        v2= "�" + q + ":" + negacion2;
        System.out.println("");
        
        System.out.println(p + "AND" + p + ":" + and1);
        v3 = p + "AND" + p + ":" + and1;
        System.out.println(p + "AND" + q + ":" + and2);
        v4 = p + "AND" + q + ":" + and2; 
        System.out.println(q + "AND" + p + ":" + and3);
        v5 = q + "AND" + p + ":" + and3;
        System.out.println(q + "AND" + q + ":" + and4);
        v6 = q + "AND" + q + ":" + and4;
        System.out.println("");
        
        System.out.println(p + "OR" +p + ":" + or1);
        v7 = p + "OR" +p + ":" + or1;
        System.out.println(p + "OR" +q + ":" + or2);
        v8 = p + "OR" +q + ":" + or2;
        System.out.println(q + "OR" +p + ":" + or3);
        v9=q + "OR" +p + ":" + or3;
        System.out.println(q + "OR" +q + ":" + or4);
        v10 = q + "OR" +q + ":" + or4;
        System.out.println("");
        ed.setText("Aqui se muestran los siguientes datos: \n\n"+v1+"\n"+v2+"\n"+v3+"\n"+v4+"\n"+v5+"\n"+v6+"\n\n"+v7+"\n"+v8+"\n"+v9+"\n"+v10);
        
        
    
           
      
         
}
    }
