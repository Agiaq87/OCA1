import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
 
        list.add(0, 'V');
        list.add('T');
        list.add(1, 'E');
        list.add(3, 'O');
        
        if(list.contains('O')) { 
            list.remove('O'); // <- Runtime Exception IndexOutOfBoundException
        }
        
        for(char ch : list) { 
            System.out.print(ch);
        }
    }
}

/* 
Throw runtime Exception IndexOutOfBoundsException

$javac Test.java
$java -Xmx128M -Xms16M Test
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 79, Size: 4
	at java.util.ArrayList.rangeCheck(ArrayList.java:653)
	at java.util.ArrayList.remove(ArrayList.java:492)
	at Test.main(Test.java:14)
	
If you print the integer value of 'O' it's equal to 79
    System.out.println((int)'O');
*/
