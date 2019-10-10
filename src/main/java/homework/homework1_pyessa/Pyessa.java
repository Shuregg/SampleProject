package homework.homework1_pyessa;

import java.util.Scanner;
    public class Pyessa {
        public static String printTextPerRole(String[] roles, String[] textLines) {
            String newtxt = "";
            for (int i = 0; i < roles.length ; i++) {
                System.out.println('\n' + roles[i]);
                newtxt = newtxt + ('\n' + roles[i]);
                for (int j = 0; j < textLines.length; j++) {
                    if(textLines[j].startsWith(roles[i])) {
                        System.out.println('\n' + (j - 9) + ")" + textLines[j].replaceAll(roles[i] + ':', ""));
                        newtxt = newtxt + ('\n' + (j-9) + ")" + textLines[j].replaceAll(roles[i] + ':', ""));
                    }
                }
            }
            return newtxt;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] cast = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
            //////////////////////////////////////////////////////////////////////////////////////
            String[] text = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                             "Аммос Федорович: Как ревизор?",
                             "Артемий Филиппович: Как ревизор?",
                             "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                             "Аммос Федорович: Вот те на!",
                             "Артемий Филиппович: Вот не было заботы, так подай!",
                             "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
            for (int i = 0; i < printTextPerRole(cast, text).length(); i++) {
                System.out.println(printTextPerRole(cast, text));
            }
            printTextPerRole(cast, text);
        }
 
}
