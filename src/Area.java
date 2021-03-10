
public class Area {
	private int r;
	private int p;
	private int t;
	private int a;
	private int s;
	private int l;

	public Area(int r, int p, int t, int a, int s, int l) {
	    this.r = r;
	    this.p = p;
	    this.t = t;
	    this.a = a;
	    this.s = s;
	    this.l = l;
	}

	public void setJari(int r){
	    this.r = r;
	}
	
	public void setAlas(int a){
	    this.a = a;
	}
	
	public void setTinggi(int t){
	    this.t = t;
	}
	
	public void setPanjang(int p){
	    this.p = p;
	}
	
	public void setLebar(int l){
	    this.l = l;
	}
	
	public void setSisi(int s){
	    this.s = s;
	}

	public float luaslingkaran() {
	    float luas = (float) (3.14 * (this.r*this.r));
	    return luas;
	}

	public float kelilinglingkaran() {
	    float keliling = (float) (2 * 3.14 * this.r);
	    return keliling;
	}
	
	public float luassegitiga() {
	    float luas = (float) (0.5 * (this.a * this.t));
	    return luas;
	}
	
	public float kelilingsegitiga() {
	    float keliling = (float) (3 * this.t);
	    return keliling;
	}
	
	public float luaspersegi() {
	    float luas = (float) (this.s * this.s);
	    return luas;
	}
	
	public float kelilingpersegi() {
	    float keliling = (float) (4 * this.s);
	    return keliling;
	}
	
	public float luaspersegipjg() {
	    float luas = (float) (this.p * this.l);
	    return luas;
	}
	
	public float kelilingpersegipjg() {
	    float keliling = (float) (2 * (this.p + this.l));
	    return keliling;
	}
	
	public float luasjargen() {
	    float luas = (float) (this.a * this.t);
	    return luas;
	}
	
	public float kelilingjargen() {
	    float keliling = (float) (2 * (this.a + this.s));
	    return keliling;
	}
}
