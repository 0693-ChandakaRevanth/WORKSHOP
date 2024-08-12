import java.util.Scanner;
public class First_Last_Occurence {
    static int first_occurence(int[] arr,int target){
        int left=0,right=arr.length-1,mid;
        while(left<right){
            mid=left+(right-left)/2;
            if(arr[mid]==target) {
                int i = 0;
                while(i<=mid){
                    if(arr[i]==target)
                        return i;
                    else
                        i++;
                }
            }
            if(arr[mid]>target)
                right=mid-1;
            else
                left=mid+1;
        }
        return -1;
    }
    static int last_occurence(int[] arr,int target){
        int left=0,right=arr.length-1,mid;
        while(left<right){
            mid=left+(right-left)/2;
            if(arr[mid]==target) {
                int i = arr.length-1;
                while(i>=mid){
                    if(arr[i]==target)
                        return i;
                    else
                        i--;
                }
            }
            if(arr[mid]>target)
                right=mid-1;
            else
                left=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Sorted Array with Duplicate Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target Element to find the First Occurence: ");
        int target=sc.nextInt();
        System.out.println(first_occurence(arr,target));
        System.out.println("Enter the Target Element to find the Last Occurence: ");
        target=sc.nextInt();
        System.out.println(last_occurence(arr,target));
    }
}