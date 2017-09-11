/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Server;

import Models.Room;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;

/**
 * FXML Controller class
 *
 * @author vinic
 */
public class ServerMainScreenController implements Initializable {

    TabPane tabPaneSalas;
    
    ObservableList<Room> salas;
    int numSalas;

    public ServerMainScreenController(int numSalas) {
        this.salas = FXCollections.observableArrayList();
        this.numSalas = numSalas;
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }    
    
}
