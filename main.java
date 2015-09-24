import java.util.Scanner;

public class main
{
    public static void main(String[] args)
	{

        Scanner user_input = new Scanner (System.in);

        String name;
        System.out.print("Enter your name here: ");
        name = user_input.next();

        float salary;
        System.out.print("Enter your salary here: ");
        salary = user_input.nextFloat();



        float tax;
         if (salary <= 10000){
             tax = 20;
         } else if (salary >10000 ) {
             tax = 25;
         } else {
             tax = 0;
         }

        float result = CalculateSalaryWithTax(tax, name, salary);

    }
       public static float CalculateSalaryWithTax(float tax, String name, float salary)
       {
           System.out.println("Starting to calculate tax for" + " " + name);
           System.out.println(salary + "- Salary before tax");

           float TaxDeduction = ((tax) / (100) * (salary));
           System.out.println(TaxDeduction + " - Tax to be subtracted");
           System.out.println("Finished calculating tax for " + " " + name);
           float SalaryWithTax = (salary - TaxDeduction);
           System.out.println(SalaryWithTax + " - Amount to be paid");

           return SalaryWithTax;
       }
}
