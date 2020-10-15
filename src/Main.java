public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setBaseSalary(50000);
        employee1.setHourlyRate(50);
        int wage = employee1.calculateWage(30);
        System.out.println(wage);
    }
}
