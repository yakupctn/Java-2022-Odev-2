package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager1 = new  OgretmenKrediManager();
		ogretmenKrediManager1.Hesapla();
		
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(ogretmenKrediManager1);
		krediUI.KrediHesapla(new AskerKrediManager());

	}

}
