/** Write a program according to the following:
 * 
 * Member Functions:
 * void input()- To accept number of customers and enter their name, number and transaction amount in a dat
 *               file.
 * void display()- Display the bill if transaction amount is > 5000.
 */
import java.util.*;
import java.io.*;
class cust
{
    Scanner xy=new Scanner(System.in);    
    private void input()throws IOException
    {
        FileOutputStream fos=new FileOutputStream("bill.dat");
        DataOutputStream dos=new DataOutputStream(fos);
        System.out.println("Enter number of customers");
        int n=xy.nextInt();
        int num,i;
        double amt;
        String name;
        for(i=1;i<=n;i++)
        {
            try
            {
                System.out.println("Enter name");
                name=xy.next();
                System.out.println("Enter customer number");
                num=xy.nextInt();
                System.out.println("Enter transaction amount");
                amt=xy.nextDouble();
                dos.writeUTF(name);
                dos.writeInt(num);
                dos.writeDouble(amt);
            }
            catch(Exception e)
            {
                System.out.println("Wrong Input");
            }
        }
        dos.close();
        fos.close();
    }
    private void display()throws IOException
    {
        FileInputStream fis=new FileInputStream("bill.dat");
        DataInputStream dis=new DataInputStream(fis);
        boolean EOF=false;
        while(!EOF)
        {
            try
            {
                String name1=dis.readUTF();
                int num1=dis.readInt();
                double amt1=dis.readDouble();
                if(amt1>5000)
                {
                    System.out.println("Customer Name: "+name1);
                    System.out.println("Customer Number: "+num1);
                    System.out.println("Transaction amount: "+amt1);
                }
                else
                {
                   System.out.println("Bill can't be shown since amount is less 5000");
                }
            }
            catch (EOFException e)
            {
                System.out.println("End of bill");
                EOF=true;
            }
        }
        dis.close();
        fis.close();
    }
    void main()throws IOException
    {
        input();
        display();
    }
}