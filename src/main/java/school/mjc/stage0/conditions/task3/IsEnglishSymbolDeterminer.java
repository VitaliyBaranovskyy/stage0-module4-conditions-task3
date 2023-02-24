package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        
         if (symbol >= 'A' & symbol <='z')
   
 System.out.println("English");

  else
  System.out.println("Non English");
  
  
}
public static void main(String[] args){
    IsEnglishSymbolDeterminer main = new IsEnglishSymbolDeterminer();
    
    main.isEnglishSymbol('B');
        
    }
}
