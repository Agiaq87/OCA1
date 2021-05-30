public class E {
    public class A {
        public void print() {
            System.out.println("A"); 
        }
    }
    
     public class B extends A {
        public void print() {
            System.out.println("B");  
        }
     }
    
    
    public static void main(String[] args) {
            A obj1 = new A();
            B obj2 = (B)obj1; // It will throw a ClassCastException at runtime...
            obj2.print();
    } 
}
