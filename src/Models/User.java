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
public class User {
    private String nick;
    private String id;
    private String add;
    private int roomId;

    public User() {
    }

    public User(String nick, String id, String add, int roomId) {
        this.nick = nick;
        this.id = id;
        this.roomId = roomId;
    }

    
    
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
    
    @Override
    public String toString() {
        return this.nick;
    }
    
}
