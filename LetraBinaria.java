public class LetraBinaria{
	
	/*public static void main (String args[]){
      String letras ="oso", n;
      int x=0;
      for (int i=0; i<letras.length(); i++){
      x=letras.charAt(i);
      n=Integer.toBinaryString(x);
      System.out.println(letras.charAt(i));
      System.out.println(x);
      System.out.println(n+"\n");
      }
    }//main */

    String cadena = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int ascii;

    public void conversor(){
    	
    	for(int i = 0; i < cadena.length(); i++){
    		ascii = cadena.charAt(i);
    		System.out.println(ascii);
    	}
    	
    }//conversor

    public static void main(String [] args){

    	LetraBinaria lb = new LetraBinaria();
    	lb.conversor();

    }//main
      
	
}//end class