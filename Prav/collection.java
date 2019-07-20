/** Write a program to display the common elemets between two arrays
 * 
 * class: angle
 * 
 * Data members:
 * int arr[],len
 * 
 * Member functions:
 * collection()-default constructor
 * void read()-input elements into array
 * collection common(collection a, collection b)-returns the common elements between two arrays
 * void display()-display the common elements
 */
import java.util.Scanner;
class collection
{
    int arr[],len=5,i,j,x=0;
    Scanner xy=new Scanner(System.in);
    collection()
    {
        arr=new int[len];
    }
    private void input()
    {
        for(i=0;i<len;i++)
        {
            arr[i]=xy.nextInt();
        }
    }
    private collection common(collection a,collection b)
    {
        collection obj=new collection();
        obj.x=0;
        for(i=0;i<len;i++)
        {
            for(j=0;j<5;j++)
            {
                if(a.arr[i]==b.arr[j])
                {
                    obj.arr[obj.x]=a.arr[i];
                    (obj.x)++;
                }
            }
        }
        return obj;
    }
    private void display()
    {
        for(i=0;i<5;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println(arr[i]);
            }
        }
    }
    void main()
    {
        collection a1=new collection();
        collection a2=new collection();
        System.out.println("Enter elements of array 1");
        a1.input();
        System.out.println("Enter elements of array 2");
        a2.input();
        collection col=new collection();
        col=col.common(a1,a2);
        System.out.println("Common elements");
        col.display();
    }
}