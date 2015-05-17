public class LetraBinaria{

    String cadena = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int ascii;
    String binario;

    public void conversor(){
    	
    	for(int i = 0; i < cadena.length(); i++){
    		ascii = cadena.charAt(i);
    		binario = Integer.toBinaryString(ascii);
    		System.out.println(ascii + " = " + binario);
    	}
    	
    }//conversor

    public static void main(String [] args){

    	LetraBinaria lb = new LetraBinaria();
    	lb.conversor();

    }//main
      
	
}//end class