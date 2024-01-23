public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bharat", 1, 200);
        int check = (int) ((Math.random() * 10)) % 2;

        if (check == 0) {
            e1.attendence = false;
        } else {
            e1.attendence = true;
        }

        if (e1.attendence) {
            System.out.println("Employee is present");
            e1.workHour = 8;
        } else {
            System.out.println("Employee is absent");
        }

        //it is a Not static method
        Main m1 = new Main();
        System.out.println(m1.calculateSalary(e1));
    }


        double calculateSalary (Employee e)
        {
            return e.workHour * e.wagePerHour;
        }

}