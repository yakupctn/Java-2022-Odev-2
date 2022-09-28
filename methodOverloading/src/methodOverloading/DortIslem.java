package methodOverloading;

public class DortIslem {
	public int Topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public int Topla(int sayi1, int sayi2, int sayi3) {   // Eğer parametreleri farklı ise aynı isimde iki veya daha fazla metod oluşturabiliriz.Buna metod overloading denir.
		return sayi1 + sayi2 + sayi3;
	}
}
