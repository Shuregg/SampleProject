package homework;

import java.util.Scanner;
    public class Pyessa {
        public static void printTextPerRole(String[] roles, String[] textLines) {
            for (int i = 0; i < roles.length ; i++) {
                System.out.println('\n' + roles[i]);
                for (int j = 0; j < textLines.length; j++) {
                    if(textLines[j].startsWith(roles[i])) {
                        System.out.println('\n' + j - 9 + ")" + textLines[j].replaceAll(roles[i] + ':', ""));
                    }
                }
            }
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
            printTextPerRole(cast, text);
        }
 
}
