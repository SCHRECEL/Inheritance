public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String IDNum, String firstName, String lastName, int YOB, double hourlyPayRate) {
        super(IDNum, firstName, lastName, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            double regularPay = 40 * hourlyPayRate;
            double overtimePay = (hoursWorked - 40) * 1.5 * hourlyPayRate;
            return regularPay + overtimePay;
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        return "Regular Pay (40 hours): $" + (hoursWorked <= 40 ? weeklyPay : 40 * hourlyPayRate) +
                "\nOvertime Pay: $" + (hoursWorked > 40 ? (hoursWorked - 40) * 1.5 * hourlyPayRate : 0) +
                "\nTotal Pay: $" + weeklyPay;
    }
}
