import java.util.*;
public class Union_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array-1 Size: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter Array-2 Size:");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(a.contains(arr1[i]))
                continue;
            else
                a.add(arr1[i]);
        }
        for (int num : arr2) {
            if (a.contains(num)) {
                continue;
            } else {
                a.add(num);
            }
        }
        System.out.println(a);
    }
}