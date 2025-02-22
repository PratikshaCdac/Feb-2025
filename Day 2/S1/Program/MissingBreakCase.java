public class MissingBreakCase {  
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
                break;  // Prevents fall-through
            case 2: 
                System.out.println("Level 2"); 
                break;  // Prevents fall-through
            case 3: 
                System.out.println("Level 3"); 
                break;  // Prevents fall-through
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
}
