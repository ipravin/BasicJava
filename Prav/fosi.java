import java.util.Scanner;
import java.io.*;
class fosi
{
    Scanner sc=new Scanner(System.in);
    void inp() throws IOException
    {
        FileOutputStream fos=new FileOutputStream("Vowels.txt");
        System.out.println("Enter a Sentence");
        String s=sc.next();
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            fos.write(ch);
        }
        fos.close();
    }
    void remvow() throws IOException
    {
        FileInputStream fis=new FileInputStream("Vowels.txt");
        FileOutputStream fos=new FileOutputStream("Rem.txt");        
        int p;
        char ch;
        
        while((p=fis.read())!=-1)
        {
            ch= (char)p;
             if(ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U'&&ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
             {
                 fos.write(ch);
                }
        }
        fos.close();
        fis.close();
        File f1=new File("Vowel.txt");
        f1.delete();
        File f2=new File("Rem.txt");
        boolean ren=f2.renameTo(f1);
        if(!ren)
        {
            System.out.println("Error");
            System.exit(0);
        }
        else
        {
            FileInputStream fin=new FileInputStream("Vowel.txt");        
            System.out.println("Text after removing vowels:");
            while((p=fin.read())!=-1)
            {
                System.out.print((char)p);
            }
            fin.close();
        }
    }
}

            
         