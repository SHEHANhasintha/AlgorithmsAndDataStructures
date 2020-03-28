import java.util.HashMap;

public class firstNonRepeatingCharacter{
    public static void main(String[] args) {
        String s = "aarrrrrrrrrjhhhsh";
        System.out.println(firstNonRepeatingChar(s));
    }


    public static char firstNonRepeatingChar(String s){
        String[] arr = s.split("");
        HashMap<String,Integer> assign = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if (assign.containsKey(arr[i])){
                assign.put(arr[i],assign.get(arr[i])+1);
            }else{
                assign.put(arr[i],1);
            }
        }
        String curr;
        for (int i =0;i<arr.length;i++){
            curr = arr[i];
            if ((assign.get(curr)) == 1){
                return arr[i].charAt(0);
            }
        }

        return '_';
    }

}