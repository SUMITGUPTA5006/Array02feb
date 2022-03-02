import java.util.*;
public class LargestInArray
{
public static void main(String[] args)
{
int max;
Scanner s = new Scanner(System.in);
int a[] = {1,2,5,6,3,2,7,20,21,33}; ;
max = a[0];
for(int i = 0; i < 10; i++)
{
if(max < a[i])
{
max = a[i];
}
}
System.out.println("Maximum value in the array is:"+max);
}
}