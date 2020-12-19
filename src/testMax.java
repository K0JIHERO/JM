import java.util.Arrays;

public class testMax {
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
        StringBuilder text = new StringBuilder("");
        int count = 1;
        for (int i = 0; i < roles.length; i++) {
            text.append(roles[i])
                    .append(":")
                    .append('\n');
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    String a = j+1 + ")";
                    text.append(textLines[j].replaceFirst(roles[i] + ":", a))
                            .append('\n');
                }
                count++;
            }
        }
        return text.toString();
    }
}