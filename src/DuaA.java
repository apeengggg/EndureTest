
public class DuaA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 13;
        int k = 1;
        for (int i = 1 ; i < 5; i++){
            for (int j = k; j <=N; j = j + 3){
                System.out.print(j);
                System.out.print("\t");                                
            }
            k++;
            N++;
            System.out.println();
        }
    }
}

