/*
 * Esta classe visa criar um objeto unico na memoria.
 */
public class Singleton {

	private static Singleton obj;
	private String m;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstancia() {
		if (Singleton.obj == null) {
			Singleton.obj = new Singleton();
		}
		return Singleton.obj;
	}
	
	public void hello(String msg){
    	System.out.println(msg);
    	this.m = msg;
    }
	
	public String getMsg() {
		return "Ultima msg: " + this.m;
	}
}

