package May21;

public class MobileDriver {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Redmi",16000,6);
		System.out.println(m1.getBrand()+" "+m1.getPrice()+" "+m1.getRam());
		System.out.println(m1.getBattery().getType()+" "+m1.getBattery().getBatteryCapacity());
	}
}
