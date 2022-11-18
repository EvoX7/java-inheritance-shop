package generation.italy.shop;


public class Headset extends Product {

	private String color;
	private boolean isWireless;

	public Headset(int productNumber, String name, String brand, int price, int vat, String color, boolean isWireless) {
		super(productNumber, name, brand, price, vat);

		this.isWireless = isWireless;

		this.color = color;

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}

	@Override
	public String toString() {

		return super.toString() + "color: " + getColor() + "\nwireless: " + isWireless();

	}

}
