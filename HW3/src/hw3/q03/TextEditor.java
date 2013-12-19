package hw3.q03;

import hw3.common.MyStack;

public class TextEditor
{
    public  MyStack<Action> history;
    Action  act = new Action();
    public TextEditor()
    {
        history=new MyStack<>();
    }

    public  void delete(int first, int last)
    {
        act.name = "delete";
        act.delete(first, last);
        history.push(act);
    }
    
    public String getValue()
    { 
        if(history.peek()==null)
        {
            return "";
        }
        return history.peek().getValue();
    }
   
    public void insert(String value, int position)
    {
        act.name = "insert";
        act.insert(value, position);
        history.push(act);
    }
    
    
    public void replace(int first, int last, String value)
    {
        act.name = "replace";
        act.replace(first, last, value);
        history.push(act);
    }
    
    public void setValue(String value)
    {
        act.name = "set";
        act.setValue(value);
        history.push(act);
    } 
    
    public void hackerSetValue(String value)
    {
        act.setValue(value);
    }
      
    public void undo()
    {
        if(history.peek()==null)
        {
            act.value = "";
        }
        else{
            String back = history.peek().name;
            switch(back)
            {
                case"delete":
                    act.undoDelete();
                    history.pop();
                    break;
                case"replace":
                    act.undoReplace();
                    history.pop();
                    break;
                case"insert":
                    act.undoInsert();
                    history.pop();
                    break;
                default:
                    act.undo();
                    break;
            }
        }
    }
}
