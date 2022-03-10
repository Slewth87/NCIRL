public class Largest{
    public static void main(String[] args){
        //vars
        int[] numbers;
        int largest;
        //initialise
        largest=0;
        numbers=new int[15];
        //populate array
        for (int i=0;i<numbers.length;i++){
            numbers[i] = ((int) (Math.random() * 10)+1);
        }
        //find the largest number
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>largest){
                largest=numbers[i];
            }
        }
        //Next 4 lines for testing/verification
        // for (int i=0;i<numbers.length;i++){
        //     System.out.println(numbers[i]);
        // }
        // System.out.println("--");

        //print the result
        System.out.println(largest);
    }
}