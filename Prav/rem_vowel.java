/** Write a program to input a sentence in a txt file and remove vowels from it.
 */
import java.util.Scanner;
import java.io.*;
class rem_vowel
{
    Scanner xy=new Scanner(System.in);
    private void input()throws IOException
    {
        FileOutputStream out=new FileOutputStream("vowel.txt");
        System.out.println("Enter a sentence");
        String s=xy.nextLine();
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            out.write(ch);
        }
        out.close();
    }
    private void remove()throws IOException
    {
        FileInputStream in=new FileInputStream("vowel.txt");
        FileOutputStream out=new FileOutputStream("rem.txt");
        int p;
        char ch;
        while((p=in.read())!=-1)
        {
            ch=(char)p;
                if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'&&ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
            {
                out.write(ch);
            }            
        }
        out.close();
        in.close();
        File f1=new File("vowel.txt");
        f1.delete();
        File f2=new File("rem.txt");
        boolean ren=f2.renameTo(f1);
        if(!ren)
        {
            System.out.println("Error");
            System.exit(0);
        }
        else
        {
            FileInputStream fin=new FileInputStream("vowel.txt");
            System.out.println("Text after removing vowels:");
            while((p=fin.read())!=-1)
            {
                System.out.print((char)p);
            }
            fin.close();
        }
    }
    void main()throws IOException
    {
        input();
        remove();
    }
}