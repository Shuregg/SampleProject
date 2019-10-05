package lesson5;

public class Teacher extends Human { //Наследование
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age); //super - родительские данные
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    public void sayHello() {
        System.out.println("Здравствуйте, меня зовут " + name); //Переопределенеие
    }
    public void teach(Student student) {
        student.sayHello();
    }
}
