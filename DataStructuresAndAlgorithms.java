import java.util.HashMap;

public class DataStructuresAndAlgorithms{
    public static void main(String[] args) {
        int[] input = {1,1,1,2, 2,1};
        int output = firstDuplicate(input);
        System.out.println(output);
    }


    public static int firstDuplicate(int[] a) {
        //liner Solution
        HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
        int maxItem = 100000+1;
        
        for (int i=0;i<a.length;i++){
            if (!numbers.containsKey(a[i])){
                numbers.put(a[i],maxItem);
            }else{
                if (i < numbers.get(a[i])){
                    numbers.put(a[i],i);
                }
            }
        }

        int minValue = maxItem;
        int returnValue = -1;
        for (int i=0;i<a.length;i++){
            if (numbers.get(a[i]) < minValue){
                minValue = numbers.get(a[i]);
                returnValue = a[i];
            }
        }

        return returnValue;
    
    }

}



