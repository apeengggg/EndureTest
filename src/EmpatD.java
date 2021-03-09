
public class EmpatD {
		// TODO Auto-generated method stub
		static long faktor(int n){
		    long a =1;
		    int i = 1;
		    while(i <= n){
		      a*=i;
		      i++;
		    }
		    return a;
		  }
		  public static void main(String[] args){
		    int i, j;
		    for (i=0; i<5; i++){
		      for (j=0; j<5-i-1; j++){
		        System.out.print(" ");
		      }
		      for (j=0; j<=i; j++){
		        System.out.print(faktor(i)/(faktor(j)*faktor(i-j))+" ");
		      }
		      System.out.println();
		    }
		  }  
		}
