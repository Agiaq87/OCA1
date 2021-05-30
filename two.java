import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] names = { "Smith", "Brown", "Thomas", "Taylor", "Jones" }; 
        List<String> list = new ArrayList<>();

        for (int x = 0; x < names.length; x++) {
            list.add(names[x]); 
            switch (x) {
                case 2:
                    continue;
            }
            break; // EXECUTED at first try
        }
        
        System.out.println(list.size()); 
    }
}

/*
$javac Test.java
$java -Xmx128M -Xms16M Test
1
*/
