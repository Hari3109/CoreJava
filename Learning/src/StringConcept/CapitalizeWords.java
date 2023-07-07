package StringConcept;

public class CapitalizeWords {
    public static void main(String[] args) {
        String input = "today is 4th day of week today is wonderful day";
        String capitalizedString = capitalizeWords(input);
        System.out.println(capitalizedString);
    }

    public static String capitalizeWords(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String capitalizedWord = firstChar + word.substring(1);
                result.append(capitalizedWord).append(" ");
            }
        }

        return result.toString().trim();
    }
}



