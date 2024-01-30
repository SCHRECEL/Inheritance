public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String IDNum, String firstName, String lastName, int YOB, double annualSalary) {
        super(IDNum, firstName, lastName, YOB, 0);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

}
