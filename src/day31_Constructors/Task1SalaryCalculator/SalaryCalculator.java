package day31_Constructors.Task1SalaryCalculator;

public class SalaryCalculator {
    public double hourlyRate,stateTaxRate,federalTaxRate;
    public int weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate * weeklyHours *52;
    }
    public double stateTax(){
        return salary() * (stateTaxRate / 100);
    }
    public double federalTax(){
        return salary() * (federalTaxRate / 100 );
    }
    public double salaryAfterTax(){
        return salary()-stateTax()-federalTax();
    }

    public String toString() {
        return "SalaryCalculator{" +
                "Salary=" + salary() +
                ", stateTax=" + stateTax() +
                ", federalTax=" + federalTax() +
                ", Salary After Tax=" + salaryAfterTax() +
                '}';
    }
}
