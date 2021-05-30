class Message {
    String msg = "Happy New Year!";

    public void print() { 
        System.out.println(msg);
    } 
}

// Object create in change not modified original passed;
// What is the result if change parameter it's final?
public class Test {
    public static void change(final Message m) { //Line n5
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
Result is:
Test.java:13: error: final parameter m may not be assigned
        m = new Message(); //Line n6
        ^
1 error
*/
