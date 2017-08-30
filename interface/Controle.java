/**
 * Esta é a classe de Interface Remota
*/

public interface Controle extends java.rmi.Remote{
  //metodo para cadastro de usuario
  public void cadUser(string nick) throws java.rmi.RemoteException;

  //metodo que envia uma mensagem para todos usuarios
  public void sendToAll(String msg, String fromNick) throws java.rmi.RemoteException;

  //metodo que envia uma mensagem para um usuario 
  public void sendToOne(String msg, String fromNick, String toNick) throws java.rmi.RemoteException;

  //metodo usado pelo servidor para cadastrar o numero de usuarios do chat
  public void setNumUsuarios(int numUser) throws java.rmi.RemoteException;

  //metodo usado pelo servidor para cadastrar o numero de salas do chat
  public void setNumRoom(int numRoom) throws java.rmi.RemoteException;
  
}//end Controle
