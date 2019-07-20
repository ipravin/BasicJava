import java.util.Scanner;
import java.io.*;
class dat
{
    Scanner sc=new Scanner (System.in);
    void input() throws IOException
    {
        FileOutputStream o=new FileOutputStream( "Cust.dat");
        DataOutputStream out =new DataOutputStream(o);
        System.out.println("Enter no of customers");
        int n=sc.nextInt();
        String s="";
        int num;
        double amt;
        for(int i=0;i<n;i++)
        {
            try
            {
                System.out.println("Enter Name of Customer");
                s=sc.next();
                out.writeUTF(s);
                System.out.println("Enter No of Customer");
                num=sc.nextInt();
                out.writeInt(num);
                System.out.println("Enter amt");
                amt=sc.nextDouble();
                out.writeDouble(amt);
            }
            catch ( Exception e)
            {
                System.out.println("Wrong Input");
                
            }
        }
        out.close();
        o.close();
    }
    void display() throws IOException
    {
        FileInputStream inn=new FileInputStream("Cust.dat");
        DataInputStream in=new DataInputStream(inn);
        boolean EOF=false;
        while(!EOF)
        {
            try
            {
                String name1=in.readUTF();
                int num1=in.readInt();
                double amt1=in.readDouble();
                if(amt1>5000)
                {
                    System.out.println(" Name of Customer" +name1);
                    System.out.println("Number of Customer" +num1);
                    System.out.println("Amount of Customer" +amt1);
                }
                else
                System.out.println("Enter Name of Customer");
            }
            catch (Exception e)
            {
                System.out.println("End of File");
                EOF =true;
            }
        }
        in.close();
        inn.close();
    }
}
