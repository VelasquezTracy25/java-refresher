public class Employee {
    private int baseSalary;
    private int hourlyRate;

    //constructor using setters instead local variables since we've set them up with illegal argument exceptions
    public Employee(int baseSalary, int hourlyRate) {
        this.setBaseSalary(baseSalary);
        this.setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        //encapsulate this if statement in the employee class instead of doing every time
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        }
        this.baseSalary = baseSalary;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        }
        this.hourlyRate = hourlyRate;
    }
}
