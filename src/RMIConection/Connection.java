/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIConection;

import Models.User;

/**
 *
 * @author 912313
 */
public class Connection {
    private static Connection INSTANCE;
    
    private User mainUser;
    
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
        
    }
}
