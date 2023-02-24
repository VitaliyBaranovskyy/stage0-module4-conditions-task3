package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        
     if(month == 1){
       System.out.println("Junuary days = " + 31);
       
        }
        else
        
        if(month == 2){
       System.out.println("February days = " + 28); 
        }
        else
        if(month == 3){
        System.out.println("March days = " + 31);
     }
     else 
     if (month == 4){
         System.out.println("April days = " + 30);
     }
     else
     if (month == 5){
         System.out.println("May days = " + 31);
     }
     else
     if (month==6){
         System.out.println("June days = " + 30);
     }
     else
     if (month == 7){
     System.out.println("July days = " + 31);
     }
     else
     if (month ==8){
         
       System.out.println("Agust days = " + 31);
     }
     else
     if (month == 9){
         System.out.println("September days = " + 30);
     }
    else
     if (month == 10){
         System.out.println("October days = " + 31);
     }
     if (month == 11){
         System.out.println("November days = " + 30);
     }
       else
       if (month == 12){
           System.out.println("Desember days = " + 31);
       }

}

public static void main(String[] args){
    
    DaysInMonthPrinter main = new DaysInMonthPrinter();
    
    main.amountOfDays(2);   
        
    }
}
