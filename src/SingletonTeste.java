
public class SingletonTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton.getInstancia().hello("1�");
		Singleton.getInstancia().hello("2�");
		System.out.println(Singleton.getInstancia().getMsg());
		
		//Construtor private
		//Singleton s = new Singleton();
	}

}
