
public class TigaBelas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "namasaya";
		int n = str.length();
		String swap = "";
		for (int i=n; i>0; i--){
			String chr = str.substring(i-1,i);
			swap = chr;
			System.out.print(swap);
		}
	}
}
