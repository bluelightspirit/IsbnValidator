import java.util.Scanner;

/**
 * Project2
 *
 * @author Gary Young
 * @version 09/19/2022
 * Project2 determines if an ISBN # inputted by the user is invalid or valid.
 * If the ISBN # is invalid, this program gives specific responses why it is.
 * If the ISBN is valid, this program tells you so.
 */
 


public class IsbnValidator {
    /**
     * main method to ask user to input ISBN #, then
     * checks if the user input is a full integer number via array, then
     * checks length of user input, then
     * calculates the ISBN # if the length of user input is = to 10 or 13,
     * and prints to the user if the ISBN # is invalid or valid.
     * 
     * @param args scans for any line,
     * checks if the line contains only integer numbers
     * via String array .equals(),
     * tells the user it does not contain only integer numbers if otherwise,
     * checks the length of the user input,
     * where if the user input is not = to 10 or 13,
     * it prints to the user that the ISBN # is not valid.
     * after that, the String array is converted into a new int array,
     * then the checksum algorithms are run for 10 digits and 13 digits.
     * Finally, those checksum algorithms print to the user if their
     * ISBN number is either valid or invalid.
     */
    public static void main(String[] args) {
        System.out.println("Please enter a number for verification. Do not include spaces or dashes.");
        Scanner versNums = new Scanner(System.in);
        String userISBN;
        userISBN = versNums.nextLine();
        // next.charAt(0)?
        String[] userISBNintChkArr = new String[userISBN.length()];
    // create String array
        System.out.print("User input detected: ");
        for (int i = 0; i < userISBN.length(); i++){
            userISBNintChkArr[i] = userISBN.substring(i,i+1);
            System.out.print(userISBNintChkArr[i]);
        }
    // check array for contained ints of the String array
        for (int i=0; i < userISBN.length(); i++){
        String a = "0123456789";
            for (int onecharChk=0;onecharChk<10;onecharChk++){
            if (userISBNintChkArr[i].equals(a.substring(onecharChk,onecharChk+1))){
                onecharChk=10;
            }
            if (onecharChk==9 && !(userISBNintChkArr[i].equals(a.substring(onecharChk,onecharChk+1)))){
                System.out.println("\nInvalid input found! Input MUST BE an INTEGER number for verification!");
                System.out.print("Invalid character found at character #");
                System.out.print(i+1);
                System.out.println(" of given string!");
                System.out.println("Actual character detected: '" + userISBNintChkArr[i]+ "'");
                return;
            }
            
         }
        }
        System.out.println("\nValid integer number found!");
    // check length of user input
        System.out.println("Your user input length is " + userISBN.length() + "!");
        if (userISBN.length()==10){ // yourArray.length
            System.out.println("Your user input digit number is valid (10)!");
        }
        else if (userISBN.length()==13){
            System.out.println("Your user input digit number is valid (13)!");
        }
        else {
            System.out.println("Unfortunately, your input is not equivalent to 10 or 13 digits in length.");
            System.out.println("The number " + userISBN + " is not a valid ISBN length");
            return;
        }
    // create and set an integer array
        // create int array
        int[] userISBNintArr = new int[userISBN.length()];
        // set integer array numbers, referencing other array
        for (int i = 0; i < userISBN.length(); i++){
            userISBNintArr[i]=Integer.parseInt(userISBNintChkArr[i]);
        }
    // calculate ISBN number
        int total=0;
        int checkSum=0;
        // 13-digit checksum algorithm
        if (userISBN.length()==13){
        for (int i = 0; i < userISBN.length()-1; i++){
            if (i%2==0){
            total+=userISBNintArr[i];
        }
            else total+=userISBNintArr[i]*3;
        }
        checkSum = 10-(total%10);
        System.out.println("The checksum is " + checkSum);
        // compares checkSum # to 13th digit of array
        if (checkSum==userISBNintArr[12]){
            System.out.println("The number " + userISBN + " is a valid 13 digit ISBN");
            return;
        }
        else {
            System.out.println("The number " + userISBN + " is NOT a valid 13 digit ISBN");
            return;
        }
        }
        // 10-digit checksum algorithm
        for (int i = 0; i < userISBN.length()-1; i++){
            total+=userISBNintArr[i]*(10-i);
        }
        checkSum=total%11;
        checkSum=11-checkSum;
        checkSum=checkSum%11;
        System.out.println("The checksum is " + checkSum);
        // compares checkSum # to 10th digit of array
        if (checkSum==userISBNintArr[9]){
            System.out.println("The number " + userISBN + " is a valid 10 digit ISBN");
            return;
        }
        else {
            System.out.println("The number " + userISBN + " is NOT a valid 10 digit ISBN");
            return;
        }
}
}




