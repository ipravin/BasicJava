/** Write a program to input elements in two arrays and merge the elements of both the arrays in a third
 *  array.
 */
import java.util.Scanner;
class merge_sort_array
{
    Scanner xy=new Scanner(System.in);
    void main()
    {
        System.out.println("Enter range 1 array");
        int m=xy.nextInt();
        System.out.println("Enter range 2 array");
        int n=xy.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        int mer[]=new int[m+n];
        int i,temp;
        System.out.println("Enter elements of 1 array");
        for(i=0;i<m;i++)
        {
            a[i]=xy.nextInt();
        }
        System.out.println("Enter elements of 2 array");
        for(i=0;i<n;i++)
        {
            b[i]=xy.nextInt();
        }
        for(i=0;i<m;i++)
        {
            mer[i]=a[i];
        }
        int x=i;
        for(i=0;i<n;i++)
        {
            mer[x]=b[i];
            x++;
        }
        int l=mer.length;
        System.out.println("Unsorted merged array");
        for(i=0;i<l;i++)
        {
            System.out.println(mer[i]);
        }
        int j;
        for(i=0;i<l-1;i++)
        {
            for(j=0;j<(l-1)-i;j++)
            {
                if(mer[j]>mer[j+1])
                {
                  temp=mer[j];
                  mer[j]=mer[j+1];
                  mer[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted merged array");
        for(i=0;i<l;i++)
        {
            System.out.println(mer[i]);
        }
    }
}