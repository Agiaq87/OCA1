public class Test {
    public static void main(String [] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(null).length());
    }
}

/*
$javac Test.java
Test.java:6: error: reference to append is ambiguous
        System.out.println(sb.append(null).length());
                             ^
  both method append(CharSequence) in StringBuilder and method append(char[]) in StringBuilder match
1 error

NOTE: append it's overloaded, so compile can't determinate wich method can be applied
*/
