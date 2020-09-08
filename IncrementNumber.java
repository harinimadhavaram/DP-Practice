import java.util.*;
//INCREMENT AN ARBITRARY-PRECISION INTEGER

public class IncrementNumber {
    public List<Integer> findSum(List<Integer> arr){
        int n = arr.size() - 1;
        arr.set(n, arr.get(n) + 1);
    
        for(int i = n; i > 0 && arr.get(i) == 10; i--){
            arr.set(n, 0);
            arr.set((i - 1), arr.get(i - 1)+ 1);
            
        }
        if(arr.get(0) == 10){
            arr.set(0, 0);
            // 1 gets added before 0 making it to 10
            arr.add(0, 1);
          
        }
       return arr;
    }
    public static void main(String[] args) {
        IncrementNumber obj = new IncrementNumber();
        List<Integer> arr = new ArrayList<>();
       // arr.add(1);
        arr.add(9);
        arr.add(9);
        List res = obj.findSum(arr);
        System.out.println(res);
    }
}