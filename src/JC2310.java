public class JC2310 {
    public static void main(String[] args) {
        String string1 = new String("олWas it a cat I saw?");
//        String string2 = new String("A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.");
//        String simpleString = new String("abadaba");
//        //String s = simpleString.equalsIgnoreCase(simpleString.);
//        String empty = new String("");
//        String string11 = string1.replaceAll("[^a-zA-Z0-9]", "");
//        String reverse = new StringBuilder(string11).reverse().toString();
//
//
//        boolean b = string11.equalsIgnoreCase(reverse);
//        System.out.println(string11);
//        System.out.println(reverse);
//        System.out.println(b);

        System.out.println(isPalindrome(string1));


    }
    public static boolean isPalindrome(String text) {
        String text1 = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder textB = new StringBuilder(text1).reverse();
        System.out.println(textB);
        return text1.equalsIgnoreCase(String.valueOf(textB));
    }
}
