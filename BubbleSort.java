import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of a array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter "+size+" elements in the array : ");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        
        System.out.println("UnSorted Array : ");
        for(int i=0;i<size;i++)
            System.out.print(" "+arr[i]);
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i]<arr[j]){
                    //swap logic
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Array : ");
        for(int i=0;i<size;i++)
            System.out.print(" "+arr[i]);

    }
    
}
