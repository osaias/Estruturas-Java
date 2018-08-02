

public class EstruturaSwitch {

	public static void main(String[] args) {
		//Testando o switch/case com break
		char vogal = 'e';
		switch (vogal) {
		case 'a':
			System.out.println("a");
			break;
		case 'e':
			System.out.println("e");
			break;
		case 'i':
			System.out.println("i");
			break;
		case 'o':
			System.out.println("o");
			break;
		case 'u':
			System.out.println("u");
			break;
		default:
			System.out.println("Não é uma vogal");
		}

		//Testando o switch/case sem break
		vogal = 'e';
		switch (vogal) {
		case 'a':
			System.out.print("a ");
		case 'e':
			System.out.print("e ");
		case 'i':
			System.out.print("i ");
		case 'o':
			System.out.print("o ");
		case 'u':
			System.out.print("u .");
		default:
			System.out.print(" Neste caso executa todos os cases seguintes.");
		}
		System.out.println();

		int num = 4;
		switch (num) {
		case 1:
			System.out.print("1");
		case 2:
			System.out.print("2");
		case 3:
			System.out.print("3");
		case 4:
			System.out.print("4");
		case 5:
			System.out.print("5 .");
		default:
			System.out.print(" Neste caso executa todos os cases seguintes.");
		}
		System.out.println();
	}

}
