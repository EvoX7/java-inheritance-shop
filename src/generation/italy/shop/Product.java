package generation.italy.shop;

public class Product {

	protected int productNumber;
	protected String name;
	protected String brand;
	protected int price;
	protected int vat;

//	Constructor

	public Product(int productNumber, String name, String brand, int price, int vat) {

		this.productNumber = productNumber;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.vat = vat;

	}

//	Getters and Setters

	public int getProductNumber() {
		return productNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public int getVatwithPrice() {
		return price + (price / 100 * vat);
	}

	@Override
	public String toString() {

		return "product number: " + productNumber + "\nname: " + name + "\nbrand: " + brand + "\nregular price: "
				+ getPrice() + "\nprice with vat: " + getVatwithPrice() + "\n";

	}
}