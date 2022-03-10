public class Array{
    public static void main(String[] args){
        int[][] array;
        array = new int[2][4];
        for (int i=0;i<2;i++){
            for (int j=0;j<4;j++){
                array[i][j]=j+1;
            }
        }
        for (int i=0;i<2;i++){
            for (int j=0;j<4;j++){
                System.out.println(array[i][j]);
            }
        }
    }
}