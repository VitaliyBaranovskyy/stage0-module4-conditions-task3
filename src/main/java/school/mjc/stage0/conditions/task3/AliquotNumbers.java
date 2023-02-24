package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
      
         if (first %2 == 0 )
    System.out.println("Aliquot");
    
    if (first %2 != 0  )
    System.out.println("Not aliquot");
    
    }
    
    public static void main(String args[]) {
        
     AliquotNumbers main = new AliquotNumbers ();
     main.isFirstAliquot(8,8);
        
    }
}
