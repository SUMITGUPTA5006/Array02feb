public class jenkins{  
    public static int getLargest(int[] a, int total){  
    int temp;  
    for (int i = 0; i < total; i++)   
            {  
                for (int j = i + 1; j < total; j++)   
                {  
                    if (a[i] > a[j])   
                    {  
                        temp = a[i];  
                        a[i] = a[j];  
                        a[j] = temp;  
                    }  
                }  
            }  
           return a[total-1];  
    }  
    public static void main(String args[]){  
    int a[]={69,34,29,54,36,99,49,101,21,19};  
    System.out.println("Largest: "+getLargest(a,6));  
    }}