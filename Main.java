import java.io.*;
import java.util.*;
class Main{
public static void main(String[] args)throws IOException
{
int n,m,ans=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
m=Integer.parseInt(br.readLine());
while(m>0)
{
  n=m%10;
  ans=ans+n;
  m=m/10;
}
System.out.println(ans);
}
}
