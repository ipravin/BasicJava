/** Write a program to input two dates and calculate the difference between them.
 */
import java.util.Scanner;
class date
{
    Scanner xy=new Scanner(System.in);
    int dd,mm,yy,d;
    date()
    {
        dd=mm=yy=0;
    }
    private void input()
    {
        d=xy.nextInt();
    }
    private void display()
    {
        System.out.println("Date is:"+d);
    }
    private date currentage(date d1,date m1,date y1,date d2,date m2,date y2)
    {
        date obj=new date();
        if(d1.dd>d2.dd)
        {
            obj.dd=d2.dd+30;
            obj.mm=m2.mm-1;
            if(m1.mm>m2.mm)
            {
                obj.mm=m2.mm+12;
                obj.yy=y2.yy-1;
            }
            else
            {
                obj.mm=m2.mm-m1.mm;
                obj.yy=y2.yy-y1.yy;
            }
        }
        else
        {
            obj.dd=d2.dd-d1.dd;
            obj.mm=m2.mm-m1.mm;
            obj.yy=y2.yy-y1.yy;
        }
        return obj;
    }
    void main()
    {
        date ad=new date();
        date am=new date();
        date ay=new date();
        date bd=new date();
        date bm=new date();
        date by=new date();    
        System.out.println("Enter first date");
        ad.input();
        ad.display();
        am.input();
        am.display();
        ay.input();
        ay.display();
        System.out.println("Enter second date");
        bd.input();
        bd.display();
        bm.input();
        bm.display();
        by.input();
        by.display();
        date diff=new date();
        diff=diff.currentage(ad,am,ay,bd,bm,by);
        diff.display();
        diff.display();
        diff.display();
    }
}