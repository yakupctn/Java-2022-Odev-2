package classes;

public class Main {

	public static void main(String[] args) {
		// class'lar reference type (referans tiptir. )
		CustomerManager customerManager = new CustomerManager();    // Bu new artık gereksiz
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;                 // Bu işlem ile yukarıdaki new gereksiz hale gelmiştir.
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		// value type (değer tip)
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;                // değer tip olduğu için sayi1'i değiştirmek sayi2'yi değiştirmez.
		System.out.println(sayi2);
		
		// reference type (referans tip)
		int[] sayilar1 = new int[] {1, 2, 3};
		int[] sayilar2 = new int[] {4, 5, 6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;         // referans tip olduğu için sayilar1'i değiştirmek sayilar2'yi değiştirir çünkü sayilar2 artık sayilar1'i referans alıyor.
		System.out.println(sayilar2[0]);

	}

}
