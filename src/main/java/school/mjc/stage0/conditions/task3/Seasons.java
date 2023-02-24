package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        
        if (month == 12 )
    System.out.println("Winter");
    
    if (month >0 & month<3)
    System.out.println("Winter");
    
    if (month >=3 & month <=5 )
    System.out.println("Spring");
    
    if (month > 5 & month <=8)
    System.out.println("Summer");
    
    if (month >8 & month <12)
    System.out.println("Outumn");
    
    if ( month >12 | month ==0)
    System.out.println("wrong number!");
    
    

    }
    
    public static void main(String args[]) {
        
     Seasons main = new Seasons ();
     main.tellTheSeasonByMonthNumber(6);

    }
}
