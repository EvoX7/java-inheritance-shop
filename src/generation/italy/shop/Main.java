package generation.italy.shop;

public class Main {
	public static void main(String[] args) {

		System.out.println("HEADSETS\n");

		Headset gradoSr1 = new Headset(468465454, "SR-1", "Grado", 952, 22, "Black", false);
		System.out.println(gradoSr1);

		System.out.println("-----------------------------------------\n");

		System.out.println("SMARTPHONES\n");

		Smartphone s12 = new Smartphone(125489635, "S12", "Samsung", 999, 22, "15451524746");
		System.out.println(s12);

		System.out.println("-----------------------------------------\n");

		System.out.println("TVs\n");

		Tv sharpGt5 = new Tv(158963248, "GT-5", "Sharp", 1500, 22, 60, true);
		System.out.println(sharpGt5);

	}

}
