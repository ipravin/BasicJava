class stackop
{
    int s[]=new int [20];
    int sp,n;
    stackop(int nm)
    {
        for(int i=0;i<20;i++)
        
            s[i]=0;
            sp=-1;
            n=nm;
    }
    void pushdata (int item)
    {
        if(sp==(n-1))
        System.out.println("Stack Overflows");
        else
        {
            sp++;
            s[sp]=item;
        }
    }
    void popdata()
    {
        int v;
        if(sp==-1)
        System.out.println("Stack Underflows");
        else
        {
            v=s[sp];
            System.out.println("POpped out : " +v);
            sp--;
        }
    }
    void display()
    {
        if(sp==-1)
        System.out.println("Stack Empty");
        else
        {
            System.out.println("SP--------->|" +s[sp]+"|");
            System.out.println("____");
            for(int i=sp-1;i>=0;i--)
            {
                System.out.println("  |"+s[i]+"|");
                System.out.println("___");
            }
        }
    }
}

        
        