public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bharat", 1, 200);
        int check = (int) ((Math.random() * 10)) %3;

        if (check == 0) {
            e1.attendence = 0;
        } else if(check ==1) {
            e1.attendence = 1;
        } else if (check ==2)
        {
            e1.attendence = 2;
        }

        if (e1.attendence ==1) {
            System.out.println("Employee is present");
            e1.workHour = 8;
        } else if(e1.attendence==0) {

            System.out.println("Employee is absent");
        }
        else if(e1.attendence==2)
        {
            System.out.println("Part time employee");
            e1.workHour=4;
        }

        //it is a Not static method
        Main m1 = new Main();
        System.out.println(m1.calculateSalary(e1));
        System.out.println("Employee Monthly Income : ");
        System.out.println(m1.monthlyWage(e1));

    }


        double calculateSalary (Employee e)
        {
            return e.workHour * e.wagePerHour;
        }
        double monthlyWage(Employee e)
        {
            return 20*e.workHour * e.wagePerHour;
        }

}