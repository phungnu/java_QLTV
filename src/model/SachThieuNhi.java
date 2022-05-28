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
public class  SachThieuNhi extends Book{
    
    private int age;
    
    public SachThieuNhi() {
    }

    public SachThieuNhi(int age, String publisher, String id, String name, String author, int pages, float cost) {
        super(publisher, id, name, author, pages, cost);
        this.age = age;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getPublisher()+" "+getId()+" "+getPages()+" "+getName()+" "+getAuthor()+" "+getCost()+" "+getAge();
    }
    
    
}
