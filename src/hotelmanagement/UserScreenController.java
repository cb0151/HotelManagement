/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import java.net.URL;
import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.zone;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Cody
 */
public class UserScreenController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private DatePicker check_In_Date;
    @FXML
    private Label check_In_Label;
    
    
    private LocalDate check_In;
    
    
    @FXML
    private DatePicker check_Out_Date;
    
    @FXML
    private Label check_Out_Label;
    
    
    private LocalDate check_Out;
    
    @FXML
    private ChoiceBox numberGuests;    
    
    public void roomSearchButton(){
        
        check_In = check_In_Date.getValue();
        check_Out = check_Out_Date.getValue();
        if(check_In.isBefore(check_Out)){
            check_Out_Label.setText("Invalid Date");
        } else {
            check_Out_Label.setText("Check-Out");
            System.out.println("Check-In: " + check_In.toString() + 
                    " Check-Out: " + check_Out.toString());
            System.out.println("Number of Guests: " + numberGuests.getValue().toString());
        }
        
        
    }
    
    /**
     *  The Initialize Method is what sets any values needed at start of GUI 
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        numberGuests.getItems().addAll("1 Adult", "2 Adults", "1 Adult, 1 Child");
        numberGuests.setValue("1 Adult");
        
    }
}    

    