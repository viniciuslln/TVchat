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
    int numPorta;
    int numUsuariosPorSalas;

    public void setNumSalas(int numSalas) {
        this.numSalas = numSalas;
    }

    public void setPorta(int numPorta) {
        this.numPorta = numPorta;
    }

    public void setUsuariosPorSalas(int numUsuariosPorSalas) {
        this.numUsuariosPorSalas = numUsuariosPorSalas;
    }
        
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.salas = FXCollections.observableArrayList();         
    }    

    
}
