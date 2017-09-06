/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas.Chat;

import Models.Mensagem;
import Models.User;
import RMIConection.Connection;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;

/**
 * FXML Controller class
 *
 * @author 912313
 */
public class ChatController implements Initializable {

    public ListView<User> list_clients;
    ObservableList<User> listUsers;
    public ListView<Mensagem> list_chat;
    ObservableList<Mensagem> listMessages;
    public Button button_send;
    public TextArea text_message;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listUsers = FXCollections.observableArrayList();
        list_clients.setItems(listUsers );
        
        listMessages= FXCollections.observableArrayList();
        list_chat.setItems(listMessages);
        
        button_send.setOnAction((ActionEvent e) -> {
            enviarMensagem();
        });
        
        text_message.setOnKeyPressed((event) -> {
           if(event.getCode() == KeyCode.ENTER){
               enviarMensagem();
               event.consume();
           }
        });
        
    }    
    

    private void enviarMensagem() {
        String mensagem = text_message.getText();
        if(mensagem.isEmpty())
            return;
        text_message.setText("");
        listMessages.add(new Mensagem(mensagem, Connection.getInstance().getMainUser()));
        list_chat.scrollTo(listMessages.size() -1);
        //TODO enviar
    }
    
    private void addUser(User user){
        
    }
    
    
    
}
