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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author gui_m
 */
public class FXMLMilhoController implements Initializable {
    
    private FXMLLoader fXMLLoader;
    
    @FXML
    private Label label;
    
    @FXML
    private Label label2;
    
    @FXML
    private Pane centralPane;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("cacar");
        loadScreen("FXMLCacar1.fxml");
    }
    
    @FXML
    private void btnArroz(ActionEvent event){
        System.out.println("Arroizero");
        label.setText("Arroz scene");
    }
    
    @FXML
    private void btnMilho(ActionEvent event) throws IOException{
        System.out.println("ops");
        loadScreen("FXMLMilho1.fxml");
        
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
        label.setText(" Você toma café da manhã, e logo depois, sai\n juntamente com seu pai e seu irmãozinho.\n" +
" Chegando no milharal, vocês começam a \ncolher as espigas enquanto seu irmão brinca\n "
                + "com um gatinho que apareceu por ali\n" +
" Enfim chega a hora do almoço e seu pai pede\n para você chamar seu irmãozinho, mas você\n"
                + "fica surpreso por não notar que ele não está\n mais ali, então você: ");        
    }
    
    
}
