public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(50000, 50);
        var employee2 = new Employee(40000,56);
//        employee1.setBaseSalary(50000);
//        employee1.setHourlyRate(50);
        int wage = employee1.calculateWage(30);
        System.out.println(wage);


        Browser browser1 = new Browser();
        browser1.navigate("...");


        //Variables have a static type, we cannot change it throughout the life og the program
        var textbox1 = new TextBox();
        textbox1.setText("Tracy.");
        System.out.println(textbox1.text);
        System.out.println(textbox1.text.toUpperCase());
    }
}
