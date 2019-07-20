/** Write a program to calculate the product of two matrices.
 * 
 * class: matrix
 * 
 * Data members: int m[][],r,c
 * 
 * Member functions:
 * matrix(int x, int y)- to assign r=x, c=y.
 * void input()- input values to matrix
 * void display()-display the matrix
 * matrix multiplication(matrix m1, matrix m2)-returns the product of two matrices
 */
import java.util.Scanner;
class matrix
{
    int m[][],r,c,i,j,k,s;
    Scanner xy=new Scanner(System.in);
    matrix(int x, int y)
    {
        r=x;
        c=y;
        m=new int[r][c];
    }
    private void input()
    {
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                m[i][j]=xy.nextInt();
            }
        }
    }
    private void display()
    {
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }
    private matrix multiplication(matrix m1, matrix m2)
    {
        matrix obj=new matrix(2,2);
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)      
            {
                for(k=0;k<3;k++)
                {
                    obj.s=obj.s+(m1.m[i][k]*m2.m[k][j]);
                }
                obj.m[i][j]=obj.s;
                obj.s=0;
            }
        }
        return obj;
    }
    void main()
    {
        matrix a=new matrix(2,3);
        matrix b=new matrix(3,2);
        System.out.println("Input first matrix:");
        a.input();
        System.out.println("Input second matrix:");
        b.input();
        System.out.println("First matrix:");
        a.display();
        System.out.println("Second matrix:");
        b.display();
        matrix mul=new matrix(2,2);
        mul=mul.multiplication(a,b);
        System.out.println("Result matrix:");
        mul.display();
    }
}