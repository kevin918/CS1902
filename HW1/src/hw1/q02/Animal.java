/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw1.q02;

/**
 *
 * @author kai918
 */
public class Animal {
    public String type;
    public String sound;

    public Animal(String types, String string) {
        this.type=types;
        this.sound=string;
    }
    String getType(){
        return type;
    }
    String getSound(){
        return sound;
    }
}
