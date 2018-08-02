import java.io.UnsupportedEncodingException;

public class UnicodeEncoding {

	public static void main(String[] args) {
		String[] codes = { "ISO-8859-1", "UTF-8", "UTF-16", "US-ASCII", "Cp1252"  };
		String letra = "ç";

		System.out.println(" ENCODING    UNICODE  CARACTER  HEXADECIMAL    BYTES");
		for (String encoding : codes) {
			byte[] b = null;
			try {
				b = letra.getBytes(encoding);
			} catch (UnsupportedEncodingException e) {
				e.getMessage();
			}

			System.out.printf("%10s\t%d\t%3s\t", encoding, b.length, letra);
			for (int i = 0; i < b.length; i++) {
				String hex = Integer.toHexString((b[i] + 256) % 256);
				if (hex.length() == 1)
					hex = "0" + hex;
				System.out.printf(hex);

			}
			System.out.print("           ");
			for (int i = 0; i < b.length; i++) {
				System.out.print(Integer.toBinaryString(b[i]) + " ");
			}
			System.out.println();
		}
		
	}

}
