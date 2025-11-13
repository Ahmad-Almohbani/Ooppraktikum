package fileCreatorsAlmohbani;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteProductA extends ReaderProductAlmohbani {
	BufferedReader ein;
	
	public ConcreteProductA() throws FileNotFoundException {
		super();
		ein=new BufferedReader(new FileReader("Haushaltsroboter.txt"));
	}

	public String[] leseAusDatei() throws IOException {
		String[]ergebniszeile=new String[5];
		String zeile=ein.readLine();
		int i=0;
		while(i<ergebniszeile.length) {
			ergebniszeile[i]=zeile;
			zeile=ein.readLine();
			i++;
		}
		return ergebniszeile;
	}

	@Override
	public void schliesseDatei() throws IOException {
		ein.close();

	}

}
