
public class MethodOverLoading {
	/**
	 * 
	 * @param value
	 */
	public void print(String value) {
		System.out.println("This is string parameter method: "+value);
	}
	/**
	 * 
	 * @param value
	 */
	public void print(int value) {
		System.out.println("This is int parameter method: "+value);
	}
	
	public void print(Object value) {
		System.out.println("This is Object parameter method: "+value);
	}
	
	public void add(int a,int b) {
		System.out.println("Int values"+(a+b));
	}
	
	public void add(byte a, byte b) {
		System.out.println("Byte Values: "+(a+b));
	}
	
	public void add(short a, short b) {
		System.out.println("short Values: "+(a+b));
	}
	public void add(long a, long b) {
		System.out.println("long Values: "+(a+b));
	}
	public void add(double a, double b) {
		System.out.println("double Values: "+(a+b));
	}
	public void add(float a, float b) {
		System.out.println("float Values: "+(a+b));
	}

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.print(null);
		obj.add(1, 1);
		obj.add(100, 100);
		obj.add(123456719, 123456719);
		obj.add(11.1, 23.3);
		obj.add(1.23464242, 2.5423452345);
	}

}
