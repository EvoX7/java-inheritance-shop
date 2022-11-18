package generation.italy.shop;

import java.util.Random;

public class Smartphone extends Product {

	private String imei;
	private int ram;

	public Smartphone(int productNumber, String name, String brand, int price, int vat, String imei) {
		super(productNumber, name, brand, price, vat);

		Random rnd = new Random();
		this.imei = imei;
		ram = rnd.nextInt(2, 8);
	}

	public String getImei() {
		return imei;
	}

	public int getRam() {

		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {

		return super.toString() + "IMEI code: " + getImei() + "\nram: " + getRam() + "GB";

	}
}
