package creational;

public class SingletonDemo {
	public static void main(String[] args) {
		System.out.println("Hello");
		SingletonClass object = SingletonClass.getInstance();
		System.out.println(object);
		SingletonClass object2 = SingletonClass.getInstance();
		System.out.println(object2);

		System.out.println(object == object2);

//		SingletonClass object3 = new SingletonClass();
//		System.out.println(object2 == object3);
	}
}

class SingletonClass {
	private SingletonClass(){
		super();
	}
	private static SingletonClass reference;
	public static SingletonClass getInstance()
	{
		if (reference == null){
			reference = new SingletonClass();
		}
		return reference;
	}
}


