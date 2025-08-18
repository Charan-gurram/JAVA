import java.util.Scanner;

public class Main {

    public float calculateSalary(float baseSal, float hraPercent, float na, float bonus) {
        float hra = (baseSal * hraPercent / 100);
        return baseSal + hra + na + bonus;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float baseSal = 50000;
        float finalSal = 0, hra = 0, na = 0, bonus = 0;
        String emp;

        System.out.println("Enter employee type (Manager / Employee / Intern): ");
        emp = sc.next();

        Main obj = new Main();

        if (emp.equalsIgnoreCase("Manager")) {
            hra = (baseSal * 30 / 100);
            na = 5000;
            bonus = 10000;
            finalSal = obj.calculateSalary(baseSal, 30, na, bonus);
        } else if (emp.equalsIgnoreCase("Employee")) {
            hra = (baseSal * 20 / 100);
            na = 3000;
            bonus = 5000;
            finalSal = obj.calculateSalary(baseSal, 20, na, bonus);
        } else if (emp.equalsIgnoreCase("Intern")) {
            hra = (baseSal * 10 / 100);
            na = 1000;
            bonus = 2000;
            finalSal = obj.calculateSalary(baseSal, 10, na, bonus);
        } else {
            System.out.println("Invalid employee type!");
            return;
        }

        System.out.println("Employee Type : " + emp);
        System.out.println("------------------------------");
        System.out.println("Basic Salary : " + baseSal);
        System.out.println("House Rent Allowance : " + hra);
        System.out.println("Night Allowance : " + na);
        System.out.println("Bonus : " + bonus);
        System.out.println("Final Salary : " + finalSal);
    }
}
