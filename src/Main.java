public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.baseSalary = 50_000;
        employee1.hourlyRate = 20;
        int wage = employee1.calculateWage(30);
        System.out.println(wage);
    }
}
