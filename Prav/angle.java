/** Write a program to find the sum of two angles.
 * 
 * Class: angle
 *
 *Data members:
 * int deg,min
 * void input()-input the angle in degree and minutes format
 * void display()-display the angle
 * angle sumangle(angle x, angle y)-Calculate difference between two angles
 */
import java.util.Scanner;
class angle
{
    int deg,min;
    Scanner xy=new Scanner(System.in);
    angle()
    {
        deg=min=0;
    }
    private void input()
    {
        System.out.println("Enter degrees");
        deg=xy.nextInt();
        System.out.println("Enter minutes");
        min=xy.nextInt();
    }
    private void display()
    {
        System.out.println("Degrees: "+deg);
        System.out.println("Minutes: "+min);
    }
    private angle sumangle(angle x,angle y)
    {
        angle obj=new angle();
        obj.deg=x.deg+y.deg;
        obj.min=x.min+y.min;
        if(obj.min>=60)
        {
            obj.deg=obj.deg+(obj.min/60);
            obj.min=obj.min%60;
        }
        return obj;
    }
    void main()
    {
        angle a1=new angle();
        angle a2=new angle();
        System.out.println("Input first angle");
        a1.input();
        System.out.println("Input second angle");
        a2.input();
        System.out.println("First angle");
        a1.display();
        System.out.println("Second angle");
        a2.display();
        angle sum=new angle();
        sum=sum.sumangle(a1,a2);
        System.out.println("Sum:");
        sum.display();
    }
}