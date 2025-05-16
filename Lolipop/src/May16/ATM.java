package May16;

public class ATM {
	private double money;
	private String location;
	public double getmoney(int pin) {
		int temp=pin;
		int count=0;
		while(temp>0) {
			temp/=10;
			count++;
		}
		if(count==4) {
			if(pin==1234) {
				return money;
			}
		}
		return 0;
	}
	public void setmoney(double money) {
		this.money = money;
	}
	public void setlocation(String location) {
		this.location = location;
	}
}
