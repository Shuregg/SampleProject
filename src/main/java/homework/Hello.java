package homework;

public class Hello {
    public static boolean check (String txt) {
        String low = txt.toLowerCase();
        if(low.startsWith("здравствуйте")) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
String text = "Здравствуйте, добрый день, привет.";
if(check(text)) {
    System.out.println("Культурно!");
} else {
    System.out.println("Не очень то и вежливо!");
}
    }
}
