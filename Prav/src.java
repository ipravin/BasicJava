import java.util.Scanner;
import java.io.*;
class src
{
    Scanner sc=new Scanner(System.in);
    void input()throws IOException
    {
        FileOutputStream fos=new FileOutputStream("search.txt");
        System.out.println("Enter a sentence");
        String x=sc.nextLine()+" ";
        char ch;
        for(int i=0;i<x.length();i++)
        {
            ch=x.charAt(i);
            fos.write(ch);
        }
        fos.close();
    }
    void search() throws IOException
    {
        FileInputStream fis=new FileInputStream("search.txt");
        System.out.println("Enter a word to be searched");
        String n=sc.next();
        int p,flag=0;
        String t="";
        while((p=fis.read())!=-1)
        {
            char ch=(char)p;
            if(ch!=' ')
            {
                t=t+Character.toString(ch);
            }
            else if(ch==' ')
            {
                if(t.equalsIgnoreCase(n))
                {
                    flag=1;
                    break;
                }
                else
                {
                    t="";
                    continue;
                }
            }
        }
        if(flag==1)
        System.out.println(n+"is found");
        fis.close();
        
    }
    void main () throws IOException
    {
        input();
        search();
        
}
 
}