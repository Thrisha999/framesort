import java.io.*;
importjava.util.*;
class Framesort
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println(&quot;enter the number of frames:&quot;);
int n=s.nextInt();
intseq[]=new int[n];
String msg[]=new String[n];
for(inti=0;i&lt;n;i++)
{
System.out.println(&quot;enter the sequence no.of frame&quot;+(i+1)+&quot;:&quot;);
seq[i]=s.nextInt();
s.nextLine();
System.out.println(&quot;enter the msg in frmae&quot;+(i+1)+&quot;:&quot;);
msg[i]=s.nextLine();
}
for(inti=0;i&lt;n;i++)
{
for(int j=0;j&lt;n;j++)
{
if(seq[j]&gt;seq[i])
{
int temp=seq[i];

seq[i]=seq[j];
seq[j]=temp;
String tem=msg[i];
msg[i]=msg[j];
msg[j]=tem;
}
}
}
for(inti=0;i&lt;n;i++)
{
System.out.println(&quot;frame sequence no -&gt;&quot;+seq[i]);
System.out.println(&quot;frame message -&gt;&quot;+msg[i]);
}
}
}