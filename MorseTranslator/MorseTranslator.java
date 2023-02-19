import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseTranslator {

    private Map<Character, String> morseMap = new HashMap<>();

    public static void main(String[] args) {

        MorseTranslator morseTranslator = new MorseTranslator();

        morseTranslator.makeMap();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase and I will convert to morse code for you: ");
        String input = scanner.nextLine();

       String converted= convertToMorse(input,morseTranslator);
        System.out.println(converted);
    }


    public static String convertToMorse(String input, MorseTranslator morseTranslator){
        String answer="";
        input=input.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            char inputChar = input.charAt(i);
            //morseTranslator is the object to get to the property called morseMap
            //call the get method to return the value associated with the key
            String morseString = morseTranslator.morseMap.get(inputChar);
            answer+=morseString+" ";
        }

        return answer;
    }
    public void makeMap(){ // this method belongs to an object
        morseMap.put('A', "*-");
        morseMap.put('B', "-***");
        morseMap.put('C', "-*-*");
        morseMap.put('D', "-**");
        morseMap.put('E', "*");
        morseMap.put('F', "**-*");
        morseMap.put('G', "--*");
        morseMap.put('H', "****");
        morseMap.put('I', "**");
        morseMap.put('J', "*---");
        morseMap.put('K', "-*-");
        morseMap.put('L', "*-**");
        morseMap.put('M', "--");
        morseMap.put('N', "-*");
        morseMap.put('O', "---");
        morseMap.put('P', "*--*");
        morseMap.put('Q', "--*-");
        morseMap.put('R', "*-*");
        morseMap.put('S', "***");
        morseMap.put('T', "-");
        morseMap.put('U', "**-");
        morseMap.put('V', "***-");
        morseMap.put('W', "*--");
        morseMap.put('X', "-**-");
        morseMap.put('Y', "_*__");
        morseMap.put('Z', "--**");
    }
}
