
public class DelapanA {

	public static void main(String[] args) {
		String chr1_a = "";
		String chr1_b = "";
		String teks = "Sugus";
		String chr = teks.toLowerCase();
		boolean isPalindrome = true;
		for(int i=chr.length();i>0;i--){
			String test1 = chr.substring(4, 5);
			chr1_a = test1;
			String test2 = chr.substring(i-1, i);
			chr1_b = test2;
			if(chr1_a.equals(chr1_b)){
				isPalindrome = true;
			}else{
				isPalindrome = false;
			}
		}
		
		if(isPalindrome){
			System.out.println("teks tersebut palindrome");
		}else{
			System.out.println("teks tersebut bukan palindrome");
		}
	}
}
