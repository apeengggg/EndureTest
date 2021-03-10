
public class EmpatE {
	public static void main(String[] args) {
        int i,j,k,m;
        int a= 8;
        for(i=0;i<a;i++){
            for(j=0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(k=a;k>1;k--){
            a--;
            for(m=0;m<a;m++){
                System.out.print(m);
            }   
            System.out.println();
        }
        
    }

}
