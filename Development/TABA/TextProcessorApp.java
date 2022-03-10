//Richard Duffy - Software Development TABA 2021

//My student number is: 20195966
//Second last digit: 6 So using Encoding Rules ER1
//last digit 6: So using input approach Rules MPA1

//Importing to use a JOptionPane for user input
import javax.swing.JOptionPane;

//Defining class
public class TextProcessorApp{
    //Setting as Main class
    public static void main(String[] args){
        //Declaring variables
        String[] para, words, filtered;
        int paraNo, wordNo;
        String encoded, filterOut = "";
        //Declaring objects, using my instantiable class
        TextProcessor t;
        t = new TextProcessor();
        //Question 1 inputs
        //First input, to get the number of paragraphs to be encoded, as per MPA1
        paraNo = Integer.parseInt(JOptionPane.showInputDialog(null, "Question 1:\n\nEnter the number of paragraphs to be encoded:"));
        //Now that I know the number of paragraphs, I can actualise my array with that number
        para = new String[paraNo];
        //Looping to present a separate input for each paragraph expected.
        for (int i=0;i<paraNo;i++){
            para[i] = JOptionPane.showInputDialog(null, "Question 1:\n\nEnter paragraph No. "+(i+1)+":");
        }
        //Question 2 inputs:
        //First input, to get the number of words to be taken in
        wordNo = Integer.parseInt(JOptionPane.showInputDialog(null, "Question 2:\n\nEnter the number of words to be entered:"));
        //Now that I know the number of words, I can actualise my array with that number
        words = new String[wordNo];
        //Looping to present a separate input for each word expected.
        for (int i=0;i<wordNo;i++){
            words[i] = JOptionPane.showInputDialog(null, "Question 2:\n\nEnter word No. "+(i+1)+":");
        }
        //Calling the set methods from my instantiable class, to provide it with the paragraphs and words Arrays it needs to process.
        t.setPara(para);
        t.setWords(words);
        //Calling the process methods from my instantiable class, to tell it to perform its calculations
        t.encode();
        t.filter();
        //Using the get methods from the instantiable class to receive the output
        encoded = t.getEncode();
        filtered = t.getFiltered();
        //Creating a loop to convert the filtered words String Array into a String for easier output on a single screen.
        for (int i=0;i<filtered.length;i++) {
            filterOut = filterOut + "\n\n" + filtered[i];
        }
        //Presenting the received output to the user
        JOptionPane.showMessageDialog(null, "Question 1 output:\n\n"+encoded);
        JOptionPane.showMessageDialog(null, "Question 2 output:"+filterOut);
    }
}