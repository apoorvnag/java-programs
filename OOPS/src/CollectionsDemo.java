import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {

	public static void main(String[] args) throws IOException {
	
		Map<Integer, Customer> map = new HashMap<Integer, Customer>();
		map.put(1, new Customer(1,"Apoorv"));
		map.put(2, new Customer(2, "Kiran"));
		
		for (Integer index : map.keySet()){
			System.out.println(map.get(index).getId());
			System.out.println(map.get(index).getName());
		}
		
	}

}

class Customer{
	private int id;
	private String name;
	public Customer(int i, String string) {
		this.id = i;
		this.name = string;
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
	
}
