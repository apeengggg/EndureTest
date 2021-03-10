
public class DuaBelasB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area r = new Area(5, 5, 12, 5, 5, 5);
        r.setJari(5);
        r.setAlas(5);
        r.setTinggi(12);
        r.setPanjang(5);
        r.setLebar(5);
        r.setSisi(5);
        System.out.println("=====Lingkaran=======");
        System.out.println("Luas: " + r.luaslingkaran());
        System.out.println("Keliling: " + r.kelilinglingkaran());
        System.out.println("=====Segitiga=======");
        System.out.println("Luas: " + r.luassegitiga());
        System.out.println("Keliling: " + r.kelilingsegitiga());
        System.out.println("=====Persegi=======");
        System.out.println("Luas: " + r.luaspersegi());
        System.out.println("Keliling: " + r.kelilingpersegi());
        System.out.println("=====Persegi Panjang=======");
        System.out.println("Luas: " + r.luaspersegipjg());
        System.out.println("Keliling: " + r.kelilingpersegipjg());
        System.out.println("=====Jajar Genjang=======");
        System.out.println("Luas: " + r.luasjargen());
        System.out.println("Keliling: " + r.kelilingjargen());
        
    }
}
