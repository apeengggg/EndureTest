
public class DuaD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 16;
        int b = 2;
        int x = 1;
        int m = 1;
        for (int i=1; i<=4; i++){
            for (int j=b; j <=a; j=j+4){
            	if(x==4 || x==8 || x==12 || x==16){
                	System.out.print(m);
                    System.out.print("\t");
                    m = m+4;
                }else{
                	System.out.print(j);
                    System.out.print("\t");	
                }  
            	x++;
            }
            b++;
            a++;
            System.out.println();
        }
	}

}
