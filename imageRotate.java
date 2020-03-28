public class imageRotate{
    public static void main(String[] args) {
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        

        /*for (int i=0;i<input.length;i++){
            for (int k=0;k<input[0].length;k++){
                System.out.print(input[i][k] + " ");
            }
            System.out.println();
        }*/
        int[][] rotate = rotImage(input);
        System.out.println();

        for (int i=0;i<rotate.length;i++){
            for (int k=0;k<rotate[0].length;k++){
                System.out.print(rotate[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotImage(int[][] metrix){
        int value;
        for (int i=0;i<metrix.length;i++){
            for (int k=i;k<metrix[i].length;k++){
                value = metrix[i][k];
                metrix[i][k] = metrix[k][i];
                metrix[k][i] = value;
            }   
        }

        for (int i=0;i<metrix.length;i++){
            for (int k=0;k<metrix[0].length/2;k++){
                value = metrix[i][k];
                metrix[i][k] = metrix[i][metrix[0].length - k -1];
                metrix[i][metrix[0].length - k - 1] = value; 
            }
        }
        return metrix;
    }
}

