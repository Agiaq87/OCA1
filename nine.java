class Message {
    String msg = "Happy New Year!";

    public void print() { 
        System.out.println(msg);
    } 
}

public class Test {
    public static void change(Message m) { //Line n5
        m = new Message(); //Line n6
        m.msg = "Happy Holidays!"; //Line n7 
    }

    public static void main(String[] args) { 
        Message obj = new Message(); //Line n1 
        obj.print(); //Line n2
        change(obj); //Line n3
        obj.print(); //Line n4 
    }
}

/*
Correct answer it's 
Happy New Year!
Happy New Year!

Remember: object on line 7 are eligible to GC
*/
