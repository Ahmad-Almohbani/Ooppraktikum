package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import fileCreatorsAlmohbani.ConcreteCreatorCsv;
import fileCreatorsAlmohbani.ReaderCreatorAlmohbani;
import fileCreatorsAlmohbani.ReaderProductAlmohbani;
import gui.HaushalsroboterControl;
import gui.Haushalsroboterview;

public class HaushaltsroboterModel {
	private Haushaltsroboter haushaltsroboter;
	
	public Haushaltsroboter getHaushaltsroboter() {
		return haushaltsroboter;
	}

	public void setHaushaltsroboter(Haushaltsroboter haushaltsroboter) {
		this.haushaltsroboter = haushaltsroboter;
	}

	public void leseAusDatei(String typ) throws IOException{
    	
      		
      			
      			ReaderCreatorAlmohbani a=new ConcreteCreatorCsv();
      			ReaderProductAlmohbani p=a.factoryMethod(typ);
      			String [] zeile=p.leseAusDatei();
      			this.haushaltsroboter = new Haushaltsroboter(zeile[0], 
      				Float.parseFloat(zeile[1]), 
      				zeile[2], 
      				zeile[3], 
      				zeile[4].split("_"));
      	p.schliesseDatei();
      	  		
      		
       		
      		}	
public void schreibeHaushaltsroboterInCsvDatei() throws IOException {
		
			BufferedWriter aus 
				= new BufferedWriter(new FileWriter("HaushaltsroboterAusgabe.csv", true));
			aus.write(this.getHaushaltsroboter().gibHaushaltsroboterZurueck(';'));
			aus.close();
   	
	}
}


