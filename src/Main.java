import java.util.Arrays;
import java.util.Scanner;
class b {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter elements of an array : ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int [] a=new int[n];
        for(int i=0; i<a.length;i++){
            System.out.print("Enter "+ (i+1)+ " Element : ");
            a[i]=sc.nextInt();
        }
        for(int i=0 ; i<a.length;i++){
            for (int j=0; j<a.length-1; j++){
                if (a[j]>a[j+1]){
                    int swap=a[j];
                    a[j]=a[j+1];
                    a[j+1]=swap;
                }
            }
        System.out.println(a[i]);
            }
        }}


