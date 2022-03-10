public class EvenArray{
    //vars
    private int[] numbers;
    private int [] sorted;
    private int evens, odds, count, request;
    //constructor
    EvenArray(){ 
        evens = 0;
        odds = 0;
        count = 0;
    }
    public int[] newArray(int[] numbers, int request){
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]%2==0){
                evens++;
            } else {
                odds++;
            }
        }
        if (request==0){
            sorted = new int[evens];
            for (int i=0;i<numbers.length;i++){
                if (numbers[i]%2==0){
                    sorted[count] = numbers[i];
                    count++;
                }
            }
        } else if (request==1){
            sorted = new int[odds];
            for (int i=0;i<numbers.length;i++){
                if (numbers[i]%2!=0){
                    sorted[count] = numbers[i];
                    count++;
                }
            }
        }
        return sorted;
    }
}