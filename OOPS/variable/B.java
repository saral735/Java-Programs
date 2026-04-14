package Variable;
class Example{
	static void show() {
		System.out.println("static method");
	}
	void show1() {
		System.out.println("non static method");
		show();
	}
}
//Non-static method ke andar se bhi static method ko direct call kar sakte ho.
public class B {
	public static void main(String[] args) {
		Example e=new Example();
		e.show1();
	}
}
