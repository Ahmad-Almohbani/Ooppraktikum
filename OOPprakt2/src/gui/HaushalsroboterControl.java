package gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import business.Haushaltsroboter;
import business.HaushaltsroboterModel;
import javafx.stage.Stage;

public class HaushalsroboterControl {
	private Haushalsroboterview haushaltroboterview;
	private HaushaltsroboterModel haushaltsrobotermodel;
	
	
	public HaushalsroboterControl(Stage primarystage) {
		this.haushaltsrobotermodel=new HaushaltsroboterModel();
		 this.haushaltroboterview = new Haushalsroboterview(this,haushaltsrobotermodel,primarystage);
	}
	 void nehmeHaushaltsroboterAuf(){
    	try{ 
    		haushaltsrobotermodel.setHaushaltsroboter(new Haushaltsroboter(haushaltroboterview.getTxtName().getText(),Float.parseFloat(haushaltroboterview.getTxtPreis().getText()), haushaltroboterview.getTxtModell().getText(), haushaltroboterview.getTxtSensortyp().getText(), haushaltroboterview.getTxtFarben().getText().split(";")));
    	haushaltroboterview.zeigeInformationsfensterAn("Der Haushaltsroboter wurde aufgenommen!");       	
    		}
       	catch(Exception exc){
       	haushaltroboterview.zeigeFehlermeldungsfensterAn(exc.getMessage());
     	}
    }
	  void schreibeHaushaltsroboterInCsvDatei() {
			try {
				haushaltsrobotermodel.schreibeHaushaltsroboterInCsvDatei();
	   		haushaltroboterview.zeigeInformationsfensterAn(
		   			"Die Haushaltsroboter wurden gespeichert!");
			}	
			catch(IOException exc){
			haushaltroboterview.zeigeFehlermeldungsfensterAn(
					"IOException beim Speichern!");
			}
			catch(Exception exc){
			haushaltroboterview.zeigeFehlermeldungsfensterAn(
					"Unbekannter Fehler beim Speichern!");
			}
		}
	  void leseAusDatei(String typ){
	    	
			try {
	      		if("csv".equals(typ)){
	      		haushaltsrobotermodel.leseAusDatei(typ);
	      	  		haushaltroboterview.zeigeInformationsfensterAn(
	      	  	   			"Der Haushaltsroboter wurde gelesen!");
	      		}else if("txt".equals(typ)) {
	      			haushaltsrobotermodel.leseAusDatei(typ);
	      	  		haushaltroboterview.zeigeInformationsfensterAn(
	      	  	   			"Der Haushaltsroboter wurde gelesen!");
	      		}
	       		else{
		   		haushaltroboterview.zeigeInformationsfensterAn(
		   				"Noch nicht implementiert!");
		   		}
			}
			catch(IOException exc){
			haushaltroboterview.zeigeFehlermeldungsfensterAn(
					"IOException beim Lesen!");
			}
			catch(Exception exc){
			haushaltroboterview.zeigeFehlermeldungsfensterAn(
					"Unbekannter Fehler beim Lesen!");
			}
		}
	
		
			

}
