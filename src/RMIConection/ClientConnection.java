/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIConection;

import RMIConection.Interfaces.ConnectionListener;
import RMIConection.Interfaces.MessageRecievedListener;
import RMIConection.Interfaces.UserRemovedListener;
import RMIConection.Interfaces.UserAddedListener;
import Models.Menssagem;
import Models.Room;
import Models.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 912313
 */
public class ClientConnection extends SuperConnection {

    private static ClientConnection INSTANCE;

    private User mainUser;
    private Room usersList;

    private ClientConnection() {
    }

    public static ClientConnection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClientConnection();
        }
        return INSTANCE;
    }

    public User getMainUser() {
        //return mainUser;
        User u = new User();
        u.setAdd("1.1.1.1");
        u.setId("111");
        u.setNick("Fulanim");
        return u;
    }

    public void conectar(String ip, int port) {
        mainUser = new User();
        // TODO
        this.connectionListenerListenerlist.forEach(action -> action.onConectedAdded(mainUser));
    }

    public void desconectar() {
        // TODO
        this.connectionListenerListenerlist.forEach(action -> action.onDesconectedAdded(mainUser));
    }

    private void addUser(User user) {
        this.usersList.getUsuarios().add(user);
        this.userAddedListenerlist.forEach(action -> action.onUserAdded(user));
    }

    private void removeUser(User user) {
        this.usersList.getUsuarios().remove(user);
        this.userRemovedListenerlist.forEach(action -> action.onUserRemoved(user));
    }

    private void recieveMessage(Menssagem message) {
        this.messageRecievedListenerlist.forEach(action -> action.onMessageRecieved(message));
    }

}
