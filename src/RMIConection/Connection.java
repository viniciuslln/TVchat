/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIConection;

import Models.Menssagem;
import Models.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 912313
 */
public class Connection {
    private static Connection INSTANCE;
    
    private User mainUser;
    private List<User> usersList = new ArrayList<>();
    
    private Connection(){}
    
    public static Connection  getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Connection();
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
    
    public void conectar(String ip, int port){
        mainUser = new User();
        this.connectionListenerListenerlist.forEach(action-> action.onConectedAdded(mainUser));
    }
    
    public void desconectar(){
        
        this.connectionListenerListenerlist.forEach(action-> action.onDesconectedAdded(mainUser));
    }
    
    private void addUser(User user){
        this.usersList.add(user);
        this.userAddedListenerlist.forEach(action -> action.onUserAdded(user));
    }
    
    private void removeUser(User user){
        this.usersList.remove(user);
        this.userRemovedListenerlist.forEach(action -> action.onUserRemoved(user));
    }
    
    private void recieveMessage(Menssagem message){
        this.messageRecievedListenerlist.forEach(action -> action.onMessageRecieved(message));
    }
    
    ///---------------------LISTENERS--------------------------------------
    
    List<UserAddedListener> userAddedListenerlist = new ArrayList<>();
    List<UserRemovedListener> userRemovedListenerlist = new ArrayList<>();
    List<MessageRecievedListener> messageRecievedListenerlist = new ArrayList<>();
    List<ConnectionListener> connectionListenerListenerlist = new ArrayList<>();
        
    public void addUserAddedListener( UserAddedListener listener ){
        this.userAddedListenerlist.add(listener);
    }
    public void addUserRemovedListener( UserRemovedListener listener ){
        this.userRemovedListenerlist.add(listener);
    }
    public void addMessageRecievedListener( MessageRecievedListener listener ){
        this.messageRecievedListenerlist.add(listener);
    }
    
    public interface ConnectionListener{ 
        public void onConectedAdded(User user);
        public void onDesconectedAdded(User user);
    }
    
    public interface UserAddedListener{ 
        public void onUserAdded(User user);
    }
    
    public interface UserRemovedListener{ 
        public void onUserRemoved(User user);
    }
    
    public interface MessageRecievedListener{ 
        public void onMessageRecieved(Menssagem message);
    }
        
}
