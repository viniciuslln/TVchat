 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Server;

import Models.Room;
import Models.User;
import RMIConection.ServerConnection;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author vinic
 */


public class ServerMainScreenController implements Initializable {

    @FXML
    private Text textLog;

    @FXML
    private Label labelPorta;

    @FXML
    private Label labelNumeroDeSalas;

    @FXML
    private Label labelUsuariosporSala;

    @FXML
    private Label labelNSala;

    @FXML
    private Label labelQuantUsuariosNaSala;

    @FXML
    private TabPane tabPaneSalas;

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
        tabPaneSalas.getTabs().clear();
    }

    void iniciarVariaveis() {
        if (ServerConnection.getInstance().getSalas().size() > 0) {
            for (int i = 0; i < numSalas; i++) {
                Tab t = new Tab("Sala " + i);
                AnchorPane a = new AnchorPane();
                ListView<User> l = new ListView<>();
                AnchorPane.setBottomAnchor(l, 0.0);
                AnchorPane.setLeftAnchor(l, 0.0);
                AnchorPane.setRightAnchor(l, 0.0);
                AnchorPane.setTopAnchor(l, 0.0);
                l.setItems(ServerConnection.getInstance().getSalas().get(i).getUsuarios());
                a.getChildren().add(l);
                t.setContent(a);
                tabPaneSalas.getTabs().add(t);
            }
        }
    }

}
