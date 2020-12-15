// Reverse the provided string

//reverseAString('hello') return 'olleh'
//reverseAString('Howdy') return 'ydwoH'

 public class AdventDay9 {
     public static void main(String[] args) {
         reverseAString("hello");
         reverseAString("Howdy");

     }

     public static void reverseAString(String oldString){
         char[] newString = oldString.toCharArray();

         for (int i = newString.length - 1; i >= 0; i--)
             System.out.print(newString[i]);
     }
}
