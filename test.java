import java.util.*;
class test
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String given=s.next();
        String result="";
        for(int i=0;i<given.length();i++)
        {
        	if(!(result.contains(String.valueOf(given.charAt(i)))))
        	{
                result=result+String.valueOf(given.charAt(i));
        	}
        }
        System.out.print(result.length());
    }
}
