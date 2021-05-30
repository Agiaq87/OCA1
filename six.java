import java.time.Period;

public class Test {
    public static void main(String [] args) {
        Period period = Period.of(0, 0, 0);
        System.out.println(period);
    }
}

/*
$javac Test.java
$java -Xmx128M -Xms16M Test
P0D
*/
