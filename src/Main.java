import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(new Worker("ID001", "John", "Doe", 1980, 15.0));
        workers.add(new Worker("ID002", "Jane", "Smith", 1990, 18.0));
        workers.add(new Worker("ID003", "Bob", "Johnson", 1985, 20.0));

        workers.add(new SalaryWorker("ID004", "Alice", "Williams", 1988, 60000));
        workers.add(new SalaryWorker("ID005", "Chris", "Brown", 1995, 80000));
        workers.add(new SalaryWorker("ID006", "Eva", "Davis", 1982, 70000));

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Payroll:");

            for (Worker worker : workers) {
                double hoursWorked = (week == 2) ? 50 : 40;
                System.out.println("\n" + worker.fullName());
                System.out.println(worker.displayWeeklyPay(hoursWorked));
            }
        }
    }
}
