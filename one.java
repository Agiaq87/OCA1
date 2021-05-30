import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super { 
    @Override
    public void m1() throws IOException { 
        throw new FileNotFoundException();
    }   
}

/*
$javac Test.java
Test.java:20: error: unreported exception IOException; must be caught or declared to be thrown
            s.m1();
                ^
1 error

Answer is Compilation Error
The program it's executed only if you ad catch IOException clause

        // If you add catch IOException, the program compile and print MN
        } catch (IOException w) {
            System.out.print("O");
        // If you add catch IOException, the program compile and print MN
*/
public class Test {
    public static void main(String[] args) {
    
        Super s = new Sub(); 
        try {
            s.m1();
        } catch (FileNotFoundException e) {
            System.out.print("M"); 
        } finally {
            System.out.print("N"); 
        }
    }
}
