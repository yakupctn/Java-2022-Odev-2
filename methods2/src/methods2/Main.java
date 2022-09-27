package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi = topla(15,7);
		System.out.println(sayi);
		
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println(toplam);

	}
	
	public static void ekle() {         // void metodlar(fonksiyonlar) bir değer ya da mesaj döndürmezler, sadece belirtilen işi yaparlar.
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {      // integer değer döndüren metod
		return sayi1+sayi2;                                     // return döndürülecek değeri belirtir.
	}
	
	public static int topla2(int... sayilar) {    // int... => variable arguments yani bu parametreye birden fazla argüman gönderebiliriz.Bunalar arka planda bir diziye dönüştürülür.
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
	
	public static String sehirVer() {  // String değer döndüren metod
		return "Ankara";
	}

}
