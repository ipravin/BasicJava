/** Write a program to input a sentence in a file and enter a word to search in the file.k
 */
import java.util.Scanner;
import java.io.*;
class search
{
    Scanner xy=new Scanner(System.in);
    private void input()throws IOException
    {
        FileOutputStream out=new FileOutputStream("search.txt");
        System.out.println("Enter a sentence");
        String s=xy.nextLine()+" ";
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            out.write(ch);
        }
        out.close();
    }
    private void search()throws IOException
    {
        FileInputStream in=new FileInputStream("search.txt");
        System.out.println("Enter a word to search");
        String n=xy.next();
        int p,flag=0;
        char ch;
        String t="";
        while((p=in.read())!=-1)
        {
            ch=(char)p;
            if(ch!=' ')
            {
                t=t+Character.toString(ch);
            }
             else if(ch== ' ')
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
        {
            System.out.println(n+"is found");
        }
        else
        {
            System.out.println(n+" is not found");
        }
        in.close();
    }
    void main()throws IOException
    {
        input();
        search();
    }
}