import java.util.HashMap;

public class crypt{
    public static void main(String[] args) {
        String[] crypt = {"AA", "AA", "AA"};
        char[][] solution = {{'A', '0'},
                            {'M', '1'},
                            {'Y', '2'},
                            {'E', '5'},
                            {'N', '6'},
                            {'D', '7'},
                            {'R', '8'},
                            {'S', '9'}};
        System.out.println(crypto(crypt, solution));
    }

    public static boolean crypto(String[] crypt,char[][] solution){
        HashMap<String,Integer> sol = new HashMap<>();
        for (int i=0;i<solution.length;i++){
                sol.put(Character.toString(solution[i][0]), Integer.parseInt(Character.toString(solution[i][1])));
        }
        String str = "";
        for (int i=0;i<crypt.length;i++){
            for (int k=0;k<crypt[i].length();k++){
                str += sol.get(Character.toString(crypt[i].charAt(k)));
            }
            crypt[i] = str;str="";
        }

        for (int i=0;i<crypt.length;i++){
        if ((!crypt[i].equals("0")) && (crypt[i].startsWith("0"))){
            
            return false;}
        } 

        if (Integer.parseInt(crypt[0]) + Integer.parseInt(crypt[1]) == Integer.parseInt(crypt[2]))
            return true;
        return false;
    }
}