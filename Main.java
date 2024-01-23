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


        switch(e1.attendence) {
            case 1:
            System.out.println("Employee is present");
            e1.workHour = 8;
            break;

        case 2:


            System.out.println("Employee is absent");
            break;

        case 3:

            System.out.println("Part time employee");
            e1.workHour=4;
            break;
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