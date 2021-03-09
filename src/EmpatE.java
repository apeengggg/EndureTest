
public class EmpatE {
	public static void main(String[] args) {
        int i,j;
        int a= 8;
        for(i=0;i<a;i++){
            for(j=0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(i=a;i>1;i--){
            a--;
            for(j=0;j<a;j++){
                System.out.print(j);
            }   
            System.out.println();
        }
        
    }

}
