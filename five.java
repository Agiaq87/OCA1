public class Test {
    public static void main(String[] args) {
        int grade = 60;

        
        // This is an assignment
        // It produce a compilation error
        if(grade = 60) 
            System.out.println("You passed..."); 
        else
            System.out.println("You failed...");
    }
}

/*
$javac Test.java
Test.java:7: error: incompatible types: int cannot be converted to boolean
        if(grade = 60) 
                 ^
1 error

Remember that a boolean assignment it's accepted

Example of if with boolean assignment
        boolean t = false;
        
        if (t = true) {
            System.out.print("This is printed because t = true");
        }
        
        ...
        
    Execution:
        $javac Test.java
        $java -Xmx128M -Xms16M Test
        This is printed because t = true
        
Example of if with boolean assignment
        
*/
