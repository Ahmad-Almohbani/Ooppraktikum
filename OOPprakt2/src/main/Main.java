package main;

import business.HaushaltsroboterModel;
import gui.HaushalsroboterControl;
import gui.HaushaltsroboterAnwendungssystem;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		new HaushalsroboterControl(primaryStage);
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}
