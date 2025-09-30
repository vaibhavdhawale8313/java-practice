
public class s1{
    public static void main(String args[]) {

        StringBuilder  sb = new StringBuilder("tony");

        System.out.println(sb); 

        // character at index
         System.out.println(sb.charAt(0));

        //  set char at index

        sb.setCharAt(0,'D');
        System.out.println(sb);

        // to insert at index

        sb.insert(0,'S');
        System.out.println(sb);

        
    //  to delete char at index

          sb.delete(1,2);
         System.err.println(sb);


        //  to add char in string

        sb.append("e");
        System.err.println(sb);

        // to calculate length of the string

        System.err.println(sb.length());
        
    
    }
    
 }