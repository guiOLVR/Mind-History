/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindhistory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 *
 * @author gui_m
 */
public class FXMLCacarController1 implements Initializable {
    
    private FXMLLoader fXMLLoader;
    
    @FXML
    private Label label;
    
    @FXML
    private Label label2;
    
    @FXML
    private Pane centralPane;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void btnArroz(ActionEvent event){
        System.out.println("Arroizero");
        label.setText("Arroz scene");
    }
    
    @FXML
    private void btnMilho(ActionEvent event) throws IOException{
        System.out.println("ops");
        loadScreen("FXMLteste.fxml");
        
    }
    
    public void loadScreen(String screen) throws IOException{
	try {
			fXMLLoader = new FXMLLoader(getClass().getResource(screen));
			centralPane.getChildren().clear();
			centralPane.getChildren().add(fXMLLoader.load());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        label.setText(" Você pega seu arco e flechas e a sua velha\n"
                + "espada que está começando a enferrujar, e \nsai em direção a floresta.\n "
                + "Chegando na floresta você fica por 2 horas\n"
                + "andando pelo seu local habitual de caça, mas \n"
                + "estranhamente você não viu nenhum animal,\n"
                + " nem um passarinho que seja.\n Então você decide:");        
    }
    
    
}
