import java.util.Scanner;
import java.io.*;
class aaaa

{
    Scanner sc =new Scanner(System.in);
     void input()throws IOException
    {
        FileOutputStream out =new FileOutputStream("count.txt");
        System.out.println("Enter a sentence");
        String s=sc.nextLine()+" " ;
        
        for(int i=0;i<s.length();i++)
        {
            out.write(s.charAt(i));
        }
        out.close();
    }

    void output() throws IOException
    {
        FileInputStream in=new FileInputStream ("count.txt");
        int p=0,cc=0,wc=0,lc=0;
        char ch;
        while((p=in.read())!=-1)
        {   
            ch=(char)p;
            cc++;
            if(ch==' ')
            wc++;
            else if(ch=='.')
            lc++;
        }
        in.close();
        System.out.println("No of words" +wc);
        System.out.println("No of chars" +cc);
        System.out.println("No of lines" +lc);    
    }
}