
public class SingletonTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton.getInstancia().hello("1º");
		Singleton.getInstancia().hello("2º");
		System.out.println(Singleton.getInstancia().getMsg());
		
		//Construtor private
		//Singleton s = new Singleton();
	}

}
