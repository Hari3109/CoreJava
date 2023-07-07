package codingPractice;

public class CountTheNoOfVowels {
    public static void main(String[] args) {
        String s = "capgemini";
        int count = 0;
        StringBuilder sb = new StringBuilder(s);

        for (char c : sb.toString().toCharArray()) {
            if (String.valueOf(c).toLowerCase().matches(".*[aeiou].*")) {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}
