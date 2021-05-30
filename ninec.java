    } 
}

// Object create in change not modified original passed;
// How can i refer to original?
// 1) Not make new instance inside change
// 2) Make change return Message and assign it in main
public class Test {
    public static void change(Message m) { //Line n5
        //m = new Message(); //Line n6
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
Happy New Year!
Happy Holidays!
*/
