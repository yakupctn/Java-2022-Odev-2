// Önemli NOT => Bir class sadece bir iş yapmalı
//               Bir metod sadece bir iş yapmalı

package classesWithAttribute;
// Belli bir ürün hakkındaki bilgileri tutmak için de classları kullanırız.

public class Product {
	// attribute veya field
	private int id;                  // Değişkenleri private yaptığımız için bu değişkenlere sadece bu kod bloğu içinden ulaşılabilir.
	private String name;             // Her yerden ulaşabilmek için getter ve setter kulllanmalıyız.
	private String description;
	private double price;             // Değişkenleri private yapmasaydık her yerden ulaşılabilirdi dolayısıyla aşağıdaki getter setter işlerine gerek kalmazdı.
	private int stockAmount;
	private String renk;
	private String kod;
	
	//getter
	public int getId() {
		return id;
	}
	//setter
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return this.name.substring(0,1) + id;
	}
	/*
	public void setKod(String kod) {   // => Kod değişkeninn set edilebilmesini istemiyorsak bu kısmı silebiiriz.
		this.kod = kod;
	}
	*/
	
	
}



