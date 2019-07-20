/** Write a program to store a sentence in a file and count the number of characters, words and lines in that
 *  file.
 */
import java.util.Scanner;
import java.io.*;
class file_count
{
    Scanner xy=new Scanner(System.in);
    private void input()throws IOException
    {
        FileOutputStream out=new FileOutputStream("count.txt");
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
    private void count()throws IOException
    {
        FileInputStream in=new FileInputStream("count.txt");
        int p,cc=0,wc=0,lc=0;
        char ch;
        while((p=in.read())!=-1)
        {
            ch=(char)p;
            cc++;
            if(ch==' ')
            {
                wc++;
            }
            else if(ch=='.')
            {
                lc++;
            }
        }
        in.close();
        System.out.println("Characters: "+(cc-1));
        System.out.println("Words: "+wc);
        System.out.println("Lines: "+lc);
    }
    void main()throws IOException
    {
        input();
        count();
    }
}