
public class DuaC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =4, b=1;
		for (int i=1; i<=3; i++){
			for(int j=b; j<=a; j++){
				if(i+j==2){
					System.out.print("0");
					System.out.print("\t");
				}else{
					System.out.print(j);
					System.out.print("\t");
				}
			}
			b+=5;
			a+=5;
			System.out.println();
		}
		
	}

}
