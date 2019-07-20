import java.util.Scanner;
import java.io.*;
class s
{
    Scanner sc=new Scanner(System.in);
    void input()throws IOException
    {
        FileOutputStream fos=new FileOutputStream("S.txt");
        DataOutputStream dos =new DataOutputStream(fos);
        System.out.println("Enter number of students");
        int n=sc.nextInt();
        int r,i;
        String name;
        for(i=0;i<=n;i++)
        {
            try
            {   
                System.out.println("Enter name");
                name=sc.next();
                System.out.println("roll no");
                r=sc.nextInt();
                dos.writeUTF(name);
                dos.writeInt(r);
            }
            catch (Exception e)
            {
                System.out.println("Wrong INput");
            }
        }
        dos.close();
        fos.close();
    }
    
    void read() throws IOException
    {
        FileInputStream fis=new FileInputStream("S.txt");
        DataInputStream dis=new DataInputStream(fis);
        boolean EOF=false;
        while(!EOF)
        {
            try
            {
                String name1;
                int r1;
                name1=dis.readUTF();
                r1=dis.readInt();
                System.out.println("Name : " +name1);
                System.out.println("Roll no: "+r1);
            }
            catch (EOFException e)
            {
                System.out.println("End of File");
                EOF=true;
            }
        }
        fis.close();
        dis.close();
    }
    void main () throws IOException
    {
        input ();
        read();
    }
}
         
    