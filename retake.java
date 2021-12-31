import java.util.Scanner;

/*accepts an annual salary of an employee
*display your 
*annual rate:xxx,xxx.xx
*monthly rate: xxx,xx
*daily rate: x,xxx.xx
*hourly rate:xxx.xx
*annual tax deduction:xx,xxx.xx
*monthly tax deduction:x,xxx.xx
*net pay:xx,xxx.xx
*/

public class retake {

    public static void main(String[] args) {
        Scanner sync = new Scanner(System.in);


        //variable declaration//
        Double a_sal;
        final int months=12;
        final int wrkngdays=22;
        final int wrknghours=8;
        Double monthlY;
        Double per_day;
        Double per_hour;
        
        

        //input statement//
        System.out.print("Enter your Annual Salary:");
        a_sal = sync.nextDouble();
        
        //process #1//
        monthlY= a_sal/months;
        per_day=monthlY/wrkngdays;
         per_hour=per_day/wrknghours;
         System.out.println("_______________________________________________________");
        System.out.println("Your Annual Salary:........................."+ String.format("%.2f",a_sal));
        System.out.println("Your Monthly Rate:.........................." + String.format("%.2f", monthlY));
        System.out.println("Your Daily Rate:............................" + String.format("%.2f", per_day));
        System.out.println("Your Hourly Rate:..........................." + String.format("%.2f", per_hour));
        System.out.println("________________________________________________________");
        //process #2//
        
        while(true){
            if(a_sal>= 0 && a_sal<250000){     //from 0 to 250000 annual income//

                Double tax_excess = a_sal ;
                Double tax_deduction=.0*tax_excess+0;
                Double a=tax_deduction;         //Annual tax Deduction//
                Double b=a/wrkngdays;           //Monthly tax Deduction//
                Double net_pay=monthlY-b;
    
                System.out.println("Your Annual Tax Deduction:............. " + String.format("%.2f",a));
                System.out.println("Monthly Tax Deduction:................. " + String.format("%.2f",b));
                System.out.println("Net Pay:............................... " + String.format("%.2f",net_pay));
                break;
            }
            else if(a_sal>= 250000 && a_sal<400000){        //from 250000 to 400000 annual income//
    
                Double tax_excess = a_sal ;
                Double tax_deduction=0.20*tax_excess+0;
                Double a=tax_deduction;         //Annual tax Deduction//
                Double b=a/wrkngdays;           //Monthly tax Deduction//
                Double net_pay=monthlY-b;
    
                System.out.println("Your Annual Tax Deduction:............. " + String.format("%.2f",a));
                System.out.println("Monthly Tax Deduction:................. " + String.format("%.2f",b));
                System.out.println("Net Pay:............................... " + String.format("%.2f",net_pay));
                break;
            }
            else if(a_sal>= 400000 && a_sal<800000){            //from 400000 to 800000 annual income//
    
                Double tax_excess = a_sal- 30000-400000;
                Double tax_deduction=30000+(tax_excess*.25);
                Double a=tax_deduction;             //Annual tax Deduction//
                Double b=a/wrkngdays;               //Monthly tax Deduction//
                Double net_pay=monthlY-b;
    
                System.out.println("Your Annual Tax Deduction:............. " + String.format("%.2f",a));
                System.out.println("Monthly Tax Deduction:................. " + String.format("%.2f",b));
                System.out.println("Net Pay:............................... " + String.format("%.2f",net_pay));
                break;
            }
            else if(a_sal>= 800000 && a_sal<2000000){           //from 800000 to 2000000 annual income//
    
                Double tax_excess = a_sal- 130000-800000;
                Double tax_deduction=130000+(tax_excess*.30);
                Double a=tax_deduction;             //Annual tax Deduction//
                Double b=a/wrkngdays;                   //Monthly tax Deduction//
                Double net_pay=monthlY-b;
    
                System.out.println("Your Annual Tax Deduction:............. " + String.format("%.2f",a));
                System.out.println("Monthly Tax Deduction:................. " + String.format("%.2f",b));
                System.out.println("Net Pay:............................... " + String.format("%.2f",net_pay));
                break;
            }
            else if(a_sal>= 2000000 && a_sal<8000000){          //from 2000000 to 8000000 annual income//
    
                Double tax_excess = a_sal- 490000-2000000;
                Double tax_deduction=490000+(tax_excess*.32);
                Double a=tax_deduction;                      //Annual tax Deduction//
                Double b=a/wrkngdays;                       //Monthly tax Deduction//
                Double net_pay=monthlY-b;
    
                System.out.println("Your Annual Tax Deduction:............. " + String.format("%.2f",a));
                System.out.println("Monthly Tax Deduction:................. " + String.format("%.2f",b));
                System.out.println("Net Pay:............................... " + String.format("%.2f",net_pay));
                break;
            }
            else if(a_sal>= 8000000 && a_sal<10000000){         //from 800000 to 10000000 annual income//
    
                Double tax_excess = a_sal- 2410000-8000000;
                Double tax_deduction=2410000+(tax_excess*.35);
                Double a=tax_deduction;                    //Annual tax Deduction//
                Double b=a/wrkngdays;                        //Monthly tax Deduction//
                Double net_pay=monthlY-b;
    
                System.out.println("Your Annual Tax Deduction:............. " + String.format("%.2f",a));
                System.out.println("Monthly Tax Deduction:................. " + String.format("%.2f",b));
                System.out.println("Net Pay:............................... " + String.format("%.2f",net_pay));
                
                break;
            }//end of statement//

        }
         
    }//end of main{}//


   



//end of class{}//
}
