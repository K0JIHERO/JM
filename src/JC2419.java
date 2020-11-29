import java.util.Arrays;

public class JC2419 {
    public static void main(String[] args) {
        System.out.println(printTextPerRole(new String[]{"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"},
                new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"}));
    }
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            String role = roles[i] + ": ";
            text.append(role + "\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(role)) {
                    String newtext = textLines[j].replace(role, "");
                    text.append(j + 1 + ") " + newtext + "\n");
                }
            }
            text.append("\n");
        }
        return text.toString();
    }
}


//    public static String printTextPerRole(String[] roles, String[] textLines) {
//        StringBuilder text = new StringBuilder();
//        for (int i = 0; i < roles.length; i++) {
//            text.append(roles[i]+ ": \n");
//            for (int j = 0; j < textLines.length; j++) {
//                if (textLines[j].contains(roles[i])) {
//                    String newtext = textLines[j].replace(roles[i] + ":", "");
//                    text.append(j + 1 + ") " + newtext + "\n");
//                }
//            }
//            text.append("\n");
//        }
//        return text.toString();
//    }