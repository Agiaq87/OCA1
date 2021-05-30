class PenDrive { 
    int capacity;
    
    PenDrive(int capacity) { 
        this.capacity = capacity;
    } 
}

class OTG extends PenDrive {
    String type;
    String make;
    
    // Note Java compiler add super() silently...
    OTG(int capacity, String type) {
       // ... but PenDrive constructor required a param (int capacity)
       // This generated an compilation 
       /*INSERT-1*/
    }
    
    OTG(String make) {
        // ... but PenDrive constructor required a param (int capacity)
       // This generated an compilation error
       /*INSERT-2*/
        this.make = make; 
    }
}


public class Test {
    public static void main(String [] args) {
        OTG obj = new OTG(128, "TYPE-C");
        System.out.println(obj.capacity + ":" + obj.type);
    }
}

/*
$javac Test.java
Test.java:14: error: constructor PenDrive in class PenDrive cannot be applied to given types;
    OTG(int capacity, String type) {
                                   ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
Test.java:19: error: constructor PenDrive in class PenDrive cannot be applied to given types;
    OTG(String make) {
                     ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
2 errors

Solution it's insert at /*INSERT-1*/
/*
super(capacity);
this.type = type;
*/
