
public class Commission {
	public void calculate(double amount) {
		double totalCommission = 500,difference;
		if(amount>=10000) {
			difference = amount - 10000;
			totalCommission += (Math.min(difference, 2000)) * 0.10;
		}
		if(amount>=12000) {
			difference = amount - 12000;
			totalCommission += (Math.min(difference, 3000)) * 0.15;
		}
		if(amount>15000) {
			difference = amount - 15000;
			totalCommission += difference * 0.20;
		}
		
		System.out.println(totalCommission);
	}

}
