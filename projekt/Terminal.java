package doom;
import java.io.*;


class Terminal {

	//Funktion zum lesen eines einzelnen chars der im Terminal eingegeben wurde
	public char readChar() {
		int x = 0;
		InputStreamReader R = new InputStreamReader(System.in);

		try {x = R.read();}
		catch (IOException e1) {}
		
		return (char) x;
	
	}

}
