import java.util.*;

public class Java{
    public static List<Integer> duplicate(List<Integer> arr){
        Map<Integer, Integer> freq = new HashMap<>();
        for(int x : arr){
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() > 1){
                res.add(entry.getKey());
            }
        }
        return res;
    }

    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(12, 3, 45, 5, 12, 3, 5, 12, 45, 12, 5);
        List<Integer> res = duplicate(arr);
        for(int x : res){
            System.out.print(x + " ");
        }
    }
}