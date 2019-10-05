package lesson5;

public class Student extends Human implements Polite {
    private int form;

    public Student(String name, int age, int form) {
        super(name, age);
        this.form = form;
    }

    public int getForm() {
        return form;
    }

    public void goodBye() {
        System.out.println("До свидания"); //Полиморфизм
    }
}
