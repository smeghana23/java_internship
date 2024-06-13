
public class Customer {
	int id;
	String name;
	float Orderamount;
	
	public Customer(int id, String name, float orderamount) {
		super();
		this.id = id;
		this.name = name;
		Orderamount = orderamount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getOrderamount() {
		return Orderamount;
	}

	public void setOrderamount(float orderamount) {
		Orderamount = orderamount;
	}
	
}
