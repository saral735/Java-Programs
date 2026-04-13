package Variable;

public class A1 {
	static int i=10;
	int j=20;

	public static void main(String[] args) {
		System.out.println(A1.i);
		A1 a=new A1();
		System.out.println(a.j);
		System.out.println(a.i);//a.i likhne par lagta hai ki wo object ke through aa raha hai, lekin actually wo bhi A1.i hi hota hai.
	}
}


