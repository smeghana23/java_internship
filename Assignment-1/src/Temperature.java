
public class Temperature {
	public void predict(int temp) {
		if(temp == 0 || temp == 100) {
			switch(temp) {
			case 0:
				System.out.println("ICED");
				break;
			case 100:
				System.out.println("STEAM");
				break;
			default:
				System.out.println("Invalid input");
			}
		}else if(temp > 0 && temp <100) {
			System.out.println("WATER");
		}else {
			System.out.println("Invalid input");
		}
	}

}
