package fileCreatorsAlmohbani;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import business.Haushaltsroboter;

public class ConcreteProductCsv extends ReaderProductAlmohbani {
	
	BufferedReader ein;
	
	
		public ConcreteProductCsv() throws FileNotFoundException {
		super();
		ein=new BufferedReader(new FileReader("Haushaltsroboter.csv"));
	}


		@Override
		public String[] leseAusDatei() throws IOException {
			String[] zeile = ein.readLine().split(";");
			return zeile;
			
		}


		@Override
		public void schliesseDatei() throws IOException {
			ein.close();
			
		}


		
		
	
	
		
		
}
