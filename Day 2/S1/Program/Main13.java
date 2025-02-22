public class Main13 { 
    public static void main(String[] args) { 
        String str = null;
        
        if (str != null) {
            System.out.println(str.length());  // Only call length() if str is not null
        } else {
            System.out.println("str is null, cannot call length()");
        }
    } 
}
