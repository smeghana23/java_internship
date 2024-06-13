
public class Constructor {
	int id;
	String name;
	
	public Constructor(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		int id = 0;
		String name = null;
		Constructor constructor = new Constructor(id, name);
		
		constructor.id = 34;
		constructor.name = "sowmya";
	}

}
