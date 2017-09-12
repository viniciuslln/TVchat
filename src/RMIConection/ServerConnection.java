/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIConection;

/**
 *
 * @author vinic
 */
public class ServerConnection {

    private static ServerConnection INSTANCE;
    private ServerConnection(){};
    
    boolean prontoParaIniciar;
    
    public static ServerConnection  getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ServerConnection();
        }        
        return INSTANCE;
    }
    
    public void start() throws Exception{
        if(prontoParaIniciar)
        {
            
        }
        else
            throw new Exception("Não foram informadas todas informações para iniciar");
    }
}
