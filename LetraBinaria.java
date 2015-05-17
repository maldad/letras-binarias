import javax.swing.JOptionPane;

public class LetraBinaria{

    String cadena;
    int ascii;
    String binario;

    public LetraBinaria(){
    	cadena = JOptionPane.showInputDialog(null, "enter string...");
    }//constructor

    public void conversor(){
    	
    	for(int i = 0; i < cadena.length(); i++){
    		ascii = cadena.charAt(i);
    		binario = Integer.toBinaryString(ascii);
    		//System.out.println(cadena.charAt(i) + " " + ascii + " = " + binario);
    		System.out.println(binario);
    	}
    	
    }//conversor

    public static void main(String [] args){

    	LetraBinaria lb = new LetraBinaria();
    	lb.conversor();

    }//main
      
	
}//end class