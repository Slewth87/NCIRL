//Richard Duffy - Software Development TABA 2021

//My student number is: 20195966
//Second last digit: 6 So using Encoding Rules ER1
//last digit 6: So using Encoding Rules MPA1

//Defining the class at the outset (Question 1a. 1st requirement)
public class TextProcessor {
    //declaring variables (Question 1a. 2nd requirement)
    private String[] para, words, filtered;
    private StringBuffer strBuff;
    private int queries,wLength,added,count;
    private String encoded;
    //constructor (Question 1a. 3rd requirement)
    public TextProcessor(){
        //actualising these variables here means that the class is essentially reset whenever it is used to make an object
        //Question 1 variables
        encoded = "";
        queries = 0;
        strBuff = new StringBuffer();
        //Question 2 variables
        count = 1;
        added = 0;
    }
    //set method (Question 1a. 4th requirement)
    public void setPara(String[] para){
        // using "para" as the variable name in both this method, and the received argument, necessitates the use of "this."
        this.para = para;
    }
    //Question 2 set method
    public void setWords(String[] words){
        // using "words" as the variable name in both this method, and the received argument, necessitates the use of "this."
        this.words = words;
    }
    //process method (Question 1a. 5th requirement)
    public void encode(){
        //First, set a loop so that these calculations are run for each received paragraph in the array.
        for (int i=0;i<para.length;i++){
            //Next, a nested loop to analyse each character in the current paragraph
            for (int j=0;j<para[i].length();j++){
                //First encoding rule, count the interrogative statements. This means counting the uses of '?'
                if(para[i].charAt(j) == '?'){
                    queries++;
                }
                //Second encoding rule, add the first letter of my first name and last letter of my last name (Ry) after every vowel
                //Manipulating the contents of a string, so using a StringBuffer for this
                //Will always need to add the current character first
                strBuff.append(para[i].charAt(j));
                //Then appending the "Ry" if the current character is a vowel
                if(Character.toLowerCase(para[i].charAt(j)) == 'a' || Character.toLowerCase(para[i].charAt(j)) == 'e' || Character.toLowerCase(para[i].charAt(j)) == 'i' || Character.toLowerCase(para[i].charAt(j)) == 'o' || Character.toLowerCase(para[i].charAt(j)) == 'u' ){
                    strBuff.append('R');
                    strBuff.append('y');
                }
            }
            //Need to prepare my final output, making sure that that I'm not overwriting anything required during the course of the loops
            encoded = encoded + queries + strBuff.toString();
            //There's no need for paragraph spacing after the last paragraph, so I used an if statement to only put that in if it's not the last run of the loop
            if (i != para.length-1){
                 encoded = encoded + "\n\n";
            }
            //Need to reset my StringBuffer and queries variables, otherwise these will stack and interfere with the output of the loops on subsequent paragraphs
            strBuff.delete(0, strBuff.length());
            queries = 0;
        }
    }
    //Question 2 process method
    public void filter(){
        //Setting a baseline with the length of the first word
        wLength = words[0].length();
        //Running a loop to skip the first word (which is already analysed), and check all the other words
        for (int i=1;i<words.length;i++) {
            //If the current word is shorter, it overwrites my wLength value
            if (words[i].length()<wLength) {
                wLength = words[i].length();
                //If the wLength is altered, it resets the count
                count = 1;
                //I had an error on line 73. I was only comparing the length of the current word to the length of the previous word, instead of to the stored wLength. This console line helped me find the problem to correct it.
                //System.out.println("Length: "+wLength);
            //If it finds another word the same length, the count is reset
            } else if (words[i].length()==words[i-1].length()) {
                count++;
            }
        }
        //Once I know how many shortest equal length words there are, I can use this actualise my filtered String Array
        filtered = new String[count];
        //I had an error on line 80 that meant the if statement was not triggering to increase the count ( I left out .length() so it was comparing the actual Strings, not the length of them ). This console line helped me find the problem to correct it.
        //System.out.println("Filtered: "+filtered.length);
        //Looping through the wods again, and adding the shortest words to the new filtered String Array
        for (int i=0;i<words.length;i++) {
            if (words[i].length() == wLength){
                filtered[added] = words[i];
                //increasing the added count sets the correct index for storing the next word
                added++;
            }
        }
    }
    //get method (Question 1a. 6th requirement)
    public String getEncode(){
        return encoded;
    }
    //Question 2 get method
    public String[] getFiltered(){
        return filtered;
    }
}