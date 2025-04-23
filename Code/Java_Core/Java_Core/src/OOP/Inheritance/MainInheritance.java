package OOP.Inheritance;

public class MainInheritance {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.setName("Dog");
//        animal.setAge(5);
//        System.out.println("Animal Name: " + animal.getName());
//        System.out.println("Animal Age: " + animal.getAge());

        Dog dog = new Dog();
        dog.setName("Bulldog");
        System.out.println("Dog Name: " + dog.getName()); // ohh lạ nhỉ trong class dog đâu có name đâu ta
        // câu trả lời ơr đây là do kế thừa vì khi dog được kế thừa class animal thì class dog có thể dửa dụng cá method mà class animal có

    }
}
