/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIConection;

import RMIConection.Interfaces.ConnectionListener;
import RMIConection.Interfaces.LoggerListener;
import RMIConection.Interfaces.MessageRecievedListener;
import RMIConection.Interfaces.UserAddedListener;
import RMIConection.Interfaces.UserRemovedListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 939247
 */
public class SuperConnection {
    ///---------------------LISTENERS--------------------------------------

    List<UserAddedListener> userAddedListenerlist = new ArrayList<>();
    List<UserRemovedListener> userRemovedListenerlist = new ArrayList<>();
    List<MessageRecievedListener> messageRecievedListenerlist = new ArrayList<>();
    List<ConnectionListener> connectionListenerListenerlist = new ArrayList<>();
    List<LoggerListener> loggerListenerlist = new ArrayList<>();

    public void addUserAddedListener(UserAddedListener listener) {
        this.userAddedListenerlist.add(listener);
    }

    public void addUserRemovedListener(UserRemovedListener listener) {
        this.userRemovedListenerlist.add(listener);
    }

    public void addMessageRecievedListener(MessageRecievedListener listener) {
        this.messageRecievedListenerlist.add(listener);
    }
    
    public void addLoggerListener(LoggerListener listener) {
        this.loggerListenerlist.add(listener);
    }
    
    public void logging(String mensagem){
        this.loggerListenerlist.forEach(a -> a.onLogging(mensagem));
    }
}
