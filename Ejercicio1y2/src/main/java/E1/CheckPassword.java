package E1;

import java.util.ArrayList;

/**
 * a) Must contain only alphanumeric characters (a−z, A−Z, 0−9);
 * b) There must be an even number of letters;
 * c) There must be an odd number of digits.
 *
 * -Input: a string S of N characters.
 * -The string S can be divided into words by splitting it and removing spaces.
 * -The goal is to choose the longest word that is a valid password.
 *
 * For example, given "test 5 a0A pass007 ?xy1".
 * - There are five words and three of them are valid passwords: "5", "a0A" and
 * "pass007".
 * - The longest password is "pass007" and its length is 7.
 *
 * Generate a class that, given a non-empty string S consisting of N characters:
 *
 * -Returns the length of the longest word in the string that is a valid
 * password.
 * -If there is not a valid word, your function should return -1, as explained
 * above.
 *
 */

public class CheckPassword {

    private String S;

    public CheckPassword(String S) {
        this.S = S;
    }

    public static void main(String[] args) throws Exception {
        String string = "test 5 a0A pass007 passss008 ?xy1";
        CheckPassword checkPassword = new CheckPassword(string);

        int longestPassword = checkPassword.longestPassword();

        System.out.println("The lenght of the longest valid password is: "+longestPassword);
    }


    //Dividimos el String de entrada en un String[]
    private String[] splitString() {
        return this.S.split(" ");
    }

    //Convertimos cada elemento del String[] en un char[] para validar los dígitos y números
    private boolean isValid(String stringWord) {
        int letters = 0;
        int digits = 0;
        char[] arrayCharWord = stringWord.toCharArray();

        for (char c : arrayCharWord) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                digits++;
            } else {
                return false;
            }
        }
        boolean wordAllowed = (letters % 2 == 0) && (digits % 2 == 1);
        return wordAllowed;
    }

    // Devolvemos un arreglo con los passwords que cumplen las condiciones
    private ArrayList<Integer> validPasswords(){
        String[] words = splitString();
        ArrayList<String> validPasswords = new ArrayList<>();
        ArrayList<Integer> validPasswordsLenght = new ArrayList<>();

        for (String word : words) {
            if (isValid(word)) {
                validPasswordsLenght.add(word.length());
                validPasswords.add(word);
            }
        }
        System.out.println("The valid passwords are: " + validPasswords);
        return validPasswordsLenght;
    }

    //Devolvemos el password con mayot longitud
    public int longestPassword() throws Exception {
        ArrayList<Integer> validPasswordsLenght = validPasswords();

        if(validPasswordsLenght.size()!=0){
            Integer maxElement = validPasswordsLenght
                    .stream()
                    .max(Integer::compare)
                    .orElseThrow(()->new Exception ("Not max element found"));
            return maxElement;
        }else{
            return -1;
        }
    }


}
