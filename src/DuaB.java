
public class DuaB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=16;
		for (int i=1; i<5; i++){
			for (int j=b; j>=a; j=j-4){
				System.out.print(j);
				System.out.print("\t");
			}
			b--;
			a--;
			System.out.println();
		}
	}
}
