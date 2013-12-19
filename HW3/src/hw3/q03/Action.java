/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3.q03;

import hw3.common.MyStack;

/**
 *
 * @author kai918
 */
class Action {
    public String value;
    public String name;
    public String substitude; 
    public int    position;
    public int    replace;  
    
    public Action()
    {
        this.value = "";
    }
    public Action(String name)
    {
        this.name  = name;
        this.value = "";
    }   
    public void delete(int first, int last)
    {   
        this.position = first;    
        String old      = getValue();
        this.substitude = old.substring(first-1,last);        
        String pre      = old.substring(0, first-1);
        String post     = old.substring(last, old.length());
        old             = pre + post;
        this.value      = old.toString();
    }
    public String getValue()
    {
        return this.value;
    }
    
    public void insert(String value, int position)
    {
        this.position   = position;
        this.substitude = value;
        String old      = getValue();   
        String pre      = old.substring(0, position);
        String post     = old.substring(position, old.length());
        old             = pre + value + post;
        this.value      = old.toString();
    }
    
    public void replace(int first, int last, String value)
    {  
        String old      = getValue();
        this.position   = first;
        this.substitude = old.substring(first-1,last);
        this.replace    = value.length();
        String pre      = old.substring(0, first-1);
        String post     = old.substring(last, old.length());
        old             = pre + value + post;
        this.value      = old.toString();
    }
    
    public void setValue(String value)
    {
        this.substitude = this.value;
        this.value      = value;
    }
    
    public void hackerSetValue(String value)
    {
        this.value = value;
    }
    
    public void undo()
    {
        this.value = "";
    }

    void undoDelete() {
        String old  = getValue();
        String pre  = old.substring(0, position-1);
        String post = old.substring(position-1, old.length());
        old         = pre + substitude + post;
        this.value  = old.toString();
    }
    
    void undoInsert() {
        String old  = getValue();
        String pre  = old.substring(0, position);
        String post = old.substring(position + substitude.length(), old.length());
        old         = pre + post;
        this.value  = old.toString();
    }
    void undoReplace() {
        String old = getValue();
        String pre  = old.substring(0, position-1);
        String post = old.substring(position+replace-1, old.length());
        old         = pre + substitude + post;
        this.value  = old.toString();
    }
}
