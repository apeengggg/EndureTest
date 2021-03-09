
public class DuaA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
        int b = 1;
        for (int i=1; i<=4; i++){
            for (int j=b; j <=a; j=j+3){
                System.out.print(j);
                System.out.print("\t");                                
            }
            b++;
            a++;
            System.out.println();
        }
    }
}

