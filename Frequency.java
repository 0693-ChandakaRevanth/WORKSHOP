import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        System.out.print("Enter the Size: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            list.add(sc.nextInt());
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer i:list){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entries: map.entrySet()){
            System.out.println(entries.getKey()+" : "+entries.getValue());
        }
    }
}
