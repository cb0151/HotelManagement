/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Cody
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
   
    @FXML
    private TextField username;
    
    @FXML
    private TextField password;
    
    /*
        THIS WILL BE CHANGED TO HANDLE MULTIPLE USER TYPES
        THIS WILL ALSO BE CHANGED TO HANDLE WHAT WINDOW OPENS UP NEXT
    */
    public void changeScreen(ActionEvent event) throws IOException{
        Parent UserScreen = FXMLLoader.load(getClass().getResource("UserScreen.fxml"));
        
        Scene userSCR = new Scene(UserScreen);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(userSCR);
        window.show();
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        /*
        THIS IS THE SECTION TO HAVE SEARCH THROUGH USERNAME LIST 
        AND VERIFY THE PASSWORD TO MOVE FORWARD WITH THE PROGRAM.
        */
        if (username.getText().equalsIgnoreCase("admin")){
            if(password.getText().equals("admin")){
                label.setText("Login Successful");
                changeScreen(event);
            }
        }
        else{
            label.setText("Login Failed");
        }           
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
