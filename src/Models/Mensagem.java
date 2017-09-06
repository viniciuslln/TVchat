/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author 912313
 */
public class Mensagem {
    private String mensagem;
    private User user;

    public Mensagem(String mensagem, User user) {
        this.mensagem = mensagem;
        this.user = user;
    }
    
    @Override
    public String toString() {
        return String.format("@%s: %s", this.user.getNick(), this.mensagem); 
    }
    
    
}
