package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
          if (salary!=0 & salary <= 10000) 
      
  System.out.println("salary after taxes = " + (salary-((salary*15)/100)));
  
       if (salary!=0 & salary <= 20000 & salary > 10000)
   System.out.println("salary after taxes = " + (salary-((salary*18)/100)));  
   
       if (salary!=0 & salary > 20000 )
       System.out.println("salary after taxes = " + (salary-((salary*20)/100)));
       
       if (salary <= 0)
       System.out.println("wrong input!");
  
}
public static void main(String[] args){
    SalaryCalculator main = new SalaryCalculator();
    
    main.calculateSalary(20000);
        
    }
}
