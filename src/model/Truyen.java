/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author hp
 */
public class Truyen extends Book{
    
    private String skin;
    
    public Truyen() {
    }

    public Truyen(String skin, String publisher, String id, String name, String author, int pages, float cost) {
        super(publisher, id, name, author, pages, cost);
        this.skin = skin;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    @Override
    public String toString() {
        return getPublisher()+" "+getId()+" "+getPages()+" "+getName()+" "+getAuthor()+" "+getCost()+" "+getSkin();
    }

    
    
    
}
