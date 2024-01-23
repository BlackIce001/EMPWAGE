public class Main
{
    public static void main(String[] args)
{
    Employee e1 = new Employee("Rishabh",1);
    int check = (int)((Math.random()*10))%2;

    if(check==0)
    {
        (e1.attendence)=false;
    }
    else {
        (e1.attendence) = true;
    }
    if(e1.attendence) {
        System.out.println("he is present");
    }
    else{
        System.out.println("he is absent");


    }

}

    }