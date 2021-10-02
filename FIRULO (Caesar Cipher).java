import java.util.*;
class FIRULO
{
    static int a[],lth, choice;
    static char alpha[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
    'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    static Scanner sc = new Scanner (System.in);
    public static void main (String args[])
    {
        int i; 
        //The next 7 lines are for the user inout for the choice of Caesar
        System.out.println("The options are:-");
        System.out.println("1. Caesar Cipher Shift Encode");
        System.out.println("2. Caesar Cipher Shift Decode");
        System.out.println("3. Create Ur Own Transposition Cipher Code");
        System.out.println("4. Decode the language through ur Code");

        System.out.println("Enter your choice");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            int a[]= InpUniConv();// Calls  the method to input the value

            System.out.println("Enter the shift");
            int shift= sc.nextInt();

            for(i=0;i<lth;i++)
            {
                if (a[i]!= 32)
                {
                    if (a[i]>64 && a[i]<91)
                    {
                        int c= a[i]- shift;
                        if (c<65)
                        {
                            a[i]=91-(65-c);
                        }
                        else
                        {
                            a[i] = c;
                        }
                    }

                    if (a[i]>96 && a[i]<123)
                    {
                        int c= a[i]- shift;
                        if (c<97)
                        {
                            a[i]=122-(97-c);
                        }
                        else
                        {
                            a[i] = c;
                        }
                    }
                }
            }
            PrintWorConv(a);
            break;
            case 2:
            int d[] = InpUniConv();
            System.out.println("Enter the shift:- ");
            int shift2 = sc.nextInt();
            for(i=0;i<lth;i++)
            {
                if (d[i]!= 32)
                {
                    if (d[i]>64 && d[i]<91)
                    {
                        int c= d[i]+ shift2;
                        if (c>90)
                        {
                            d[i]=64+(c-90);
                        }
                        else
                        {
                            d[i] = c;
                        }
                    }

                    if (d[i]>96 && d[i]<123)
                    {
                        int c= d[i]+ shift2;
                        if (c>123)
                        {
                            d[i]=96+(c-122);
                        }
                        else
                        {
                            d[i] = c;
                        }

                    }

                }
            }
            PrintWorConv(d);
            break;
            case 3:
                char alphauser[] = InpSen3();
                int e[]= InpUniConv();
                for(int i4=0;i4<lth;i4++)
                {
                    char temp3 = (char) e[i4];
                    for(int j3=0;j3<52;j3++)
                    {
                        if (temp3==alpha[j3])
                        {
                            e[i4]=alphauser[j3];
                        }
                    }
                }
                PrintWorConv(e);
            break;
            case 4:
                char alphauser4[]=InpSen3();
                int f[]=InpUniConv();
                for(i=0;i<lth;i++)
                {
                    char temp4 = (char) f[i];
                    for(int j4=0;j4<52;j4++)
                    {
                        if(temp4==alphauser4[j4])
                        {
                            f[i]=alpha[j4];
                        }
                    }
                }
                PrintWorConv(f);
            break;
        }
    }

    static int[] InpUniConv()
    {
        System.out.println ("Enter the sentence:-");
        String usrinp = sc.next();
        usrinp = usrinp.trim();
        lth = usrinp.length(); int i;
        int b[] = new int [lth]; 
        for (i=0;i<lth;i++)
        {
            char ch = usrinp.charAt(i);
            b[i] = ch;
        } 

        return b;
    }

    static void PrintWorConv(int a[])
    {
        System.out.println("The output result is:-");

        for (int i=0;i<lth;i++)
        {
            char usrout = (char) a[i];
            System.out.print(usrout);
        }

    }

    static char[] InpSen3()
    {
        System.out.println("Enter the corresponding code values of the alphabets");
        char alphauser1[]=new char[52];
        for(int i3=0;i3<52;i3++)
        {
            System.out.print(alpha[i3]+":- ");
            alphauser1[i3]= sc.next().charAt(0);
        }
        return alphauser1;
    }
}

