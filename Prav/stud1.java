import java.util.Scanner;
import java.io.*;
class stud1
{
    Scanner sc=new Scanner(System.in);
    void inp() throws IOException
    {
        FileOutputStream fos=new FileOutputStream("Stud1.dat");
        DataOutputStream dos=new DataOutputStream(fos);
        System.out.println("Enter Number of Students");
        int n=sc.nextInt();
        int r,i;
        String name;
        for(i=0;i<n;i++)
        {
            try
            {
                    System.out.println("Enter a name");
                    name=sc.next();
                    System.out.println("Enter roll no");
                    r=sc.nextInt();
                    dos.writeUTF(name);
                    dos.writeInt(r);
                }
                catch(Exception e)
                {
                    System.out.println("Wrong Input");
                }
            }
            dos.close();
            fos.close();
        }
        void read() throws IOException
        {
            FileInputStream fis=new FileInputStream("Stud1.dat");
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
                    System.out.println("Name "+name1+ "Roll"+r1);
                }
                catch(Exception e)
                {
                    EOF=true;
                }
            }
            dis.close();
            fis.close();
        }
        void main() throws IOException
        {
            inp();
            read();
            
        }
    }

                    
     