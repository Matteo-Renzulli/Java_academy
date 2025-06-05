package day_12;

public class EmployeeController {
    public static void raiseSalary(Employee emp, double byPercent) {
        double incremento = emp.getStipendio() * (1 + byPercent);
        emp.setStipendio(incremento + emp.getStipendio());
    }
}