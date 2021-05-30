class Pen {}

public class TestPen {
    public static void main(String[] args) {
        new Pen(); // Eligible to GC from line 7
        Pen p = new Pen(); // Not eligible
        
        change(p); // Object from line 15 it's eligible to GC because it's unreachable
        
        System.out.println("About to end.");
    }
    
    public static void change(Pen pen) {
        pen = new Pen();
    }
}

/*
$javac TestPen.java
$java -Xmx128M -Xms16M TestPen
About to end.

Answer it's 2
*/
