package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        
  if (character >= 'A' & character <= 'z')
            System.out.println("English alphabet!");
        
         
        if (character == 'A' || character =='a' || character =='E' || character =='e' || character =='I' || character=='i' || character == 'O' || character=='o'
        
             || character=='U' || character =='u' || character=='Y' || character=='y' || character=='Y' || character=='y')
       System.out.println("Vowel");
     
        if (character=='B' || character=='b' || character=='C' || character=='c' || character=='D' || character=='d' || character=='F' || character=='f' || character=='G' || character=='g'
             || character=='H' || character=='h' || character=='J' || character=='j' || character=='K' || character=='k' || character=='L' || character=='l'|| character=='M' || character=='m' 
             || character=='N' || character=='n' || character=='P' || character=='p' || character=='Q' || character=='q' || character=='R' || character=='r' || character=='S' || character=='s'
             ||character=='T' || character=='t' || character=='V' || character=='v'|| character=='W' || character=='w' || character=='X' || character=='x' || character=='Z' || character=='z') 
        System.out.println("Consonant");

   if (character <'A' || character>'z') 
       System.out.println("wrong alphabet!");
   
   
   
}

public static void main(String[] args){
    
   AlphabeticCharacters main = new AlphabeticCharacters();
    
    main.vowelDeterminer('щ');       
        
        
    }
}
