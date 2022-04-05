class sevenseg
{
    char a[][]=new char[6][3];
    public void fill(char c)
    {
        if(c=='a')
        {a[0][0]='*';a[0][1]='*';a[0][2]='*';}
        if(c=='b')
        {a[0][2]='*';a[1][2]='*';a[2][2]='*';}
        if(c=='c')
        {a[3][2]='*';a[4][2]='*';}
        if(c=='d')
        {a[4][0]='*';a[4][1]='*';a[4][2]='*';}
        if(c=='e')
        {a[3][0]='*';a[4][0]='*';}
        if(c=='f')
        {a[0][0]='*';a[1][0]='*';a[2][0]='*';}
        if(c=='g')
        {a[2][0]='*';a[2][1]='*';a[2][2]='*';}
    }
    public void no(int n)
    {
        String st="";
        if(n==0)
        st="abcdef";
        if(n==1)
        st="bc";
        if(n==2)
        st="abdeg";
        if(n==3)
        st="abcdg";
        if(n==4)
        st="bcfg";
        if(n==5)
        st="acdfg";
        if(n==6)
        st="acdefg";
        if(n==7)
        st="abc";
        if(n==8)
        st="abcdefg";
        if(n==9)
        st="abcdfg";
        for(int i=0;i<st.length();i++)
        fill(st.charAt(i));
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(a[i][j]=='*')
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(int n)
    {
        sevenseg obj=new sevenseg();
        String st=Integer.toString(n);
        for(int i=0;i<st.length();i++)
        {
            obj.a=new char[6][3];
            obj.no(Integer.parseInt(""+st.charAt(i)));
            try 
            { 
                Thread.sleep(1000);
            } 
            catch (InterruptedException ex) 
            { 
            }
            if(i==st.length()-1)
            break;
            System.out.print("\f");
        }
    }
}