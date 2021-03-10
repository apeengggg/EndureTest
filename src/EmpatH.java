
public class EmpatH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
	    for (i=0; i<4; i++){
	      for (j=0; j<5-i-1; j++){
	        System.out.print(" ");
	      }
	      for (j=0; j<=i; j++){
	        System.out.print("*");
	      }
	      for (k=1; k<=i; k++){
		        System.out.print("*");
		      }
	      System.out.println();
	    }
	}  
}
