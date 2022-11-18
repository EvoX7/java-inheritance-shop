package generation.italy.shop;

public class Tv extends Product {

	private int dimensions;
	private boolean isSmart;

	public Tv(int productNumber, String name, String brand, int price, int vat, int dimensions, boolean isSmart) {
		super(productNumber, name, brand, price, vat);

		this.dimensions = dimensions;
		this.isSmart = isSmart;

	}

	public int getDimensions() {
		return dimensions;
	}

	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}

	@Override
	public String toString() {

		return super.toString() + "inch: " + getDimensions() + "\nsmart tv: " + isSmart();

	}

}
