package Variable;
class AC{
	String name ;
	int capacity;
	int temp;
	
	boolean flag=false;
	
	
    public void display() {
    	if(flag) {
    		System.out.println("AC is On");
    		System.out.println(name);
    		System.out.println(capacity);
    		System.out.println(temp);
    	}else {
    		System.out.println("AC is not on ");
    	}
    }
	
    public void on() {
    	flag=true;
    	temp=20;
    	name="Bluestar";
    	capacity=4;
    }
    public void off() {
    	flag=false;
    	temp=0;
    	System.out.println("AC is off");
    }
    public void  increaseTemp() {
    	
		if(flag) {
			temp++;
		}else {
			System.out.println("turn on Ac first");
		}
	}
   public void decreaseTemp() {
		if(flag) {
			temp--;
		}else {
			System.out.println("turn on Ac");
		}
	}
	
}
public class ACDriver {

	public static void main(String[] args) {
	
		AC a=new AC();
		a.on();
		a.increaseTemp();
		a.display();
		System.out.println("===================");
		
		a.off();
		a.display();
		System.out.println("===================");
		
		AC a1=new AC();
	//	a1.decreaseTemp();

		a1.increaseTemp();
	}

}
