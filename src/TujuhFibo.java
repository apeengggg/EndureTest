
public class TujuhFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, print = 0, i;
		for (i=0; i<=6; i++){
			print = a+b;
			a = b;
			b = print;
			System.out.print(a+",");
		}
	}

}
