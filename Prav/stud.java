            
/** Write a program to input name and roll number of n number of students and store it in a dat file.
 */
import java.util.Scanner;
import java.io.*;
class stud
{
    Scanner xy=new Scanner(System.in);
    private void input()throws IOException
    {
        FileOutputStream fos=new FileOutputStream("exp.dat");
        DataOutputStream dos=new DataOutputStream(fos);
        System.out.println("Enter number of students");
        int n=xy.nextInt();
        int r,i;
        String name;
        for(i=1;i<=n;i++)
        {
                try
                {
                    
                        System.out.println("Enter a name");
                        name=xy.next();
                        System.out.println("Enter roll no");
                        r=xy.nextInt();
                        dos.writeUTF(name);
                        dos.writeInt(r);
                }
            
                catch(Exception e)
                {
                    System.out.println("Wrong input");
                }
                
            }
            dos.close();
            fos.close();
        }
    private void read()throws IOException
    {
        FileInputStream fis=new FileInputStream("exp.dat");
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
                System.out.println("name: "+name1);
                System.out.println("Roll no: "+r1);
            }
            catch(EOFException e)
            {
                System.out.println("End of File");
                EOF=true;
            }
        }
    }
    void main()throws IOException
    {
        input();
        read();
    }
}