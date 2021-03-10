
public class EmpatI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, a=3, m, k;
		for (i=1; i<=a; i++){
//			perulangan untuk mencetak jumlah i
//			mengikuti pada baris keberapa / i
				for(j=1; j<=i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
			}
		for (m=(a-1); m>=1; m--){
//			perulangan untuk mencetak jumlah i
//			mengikuti pada baris keberapa / i
				for(k=1; k<=m; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
			}
	}

}
