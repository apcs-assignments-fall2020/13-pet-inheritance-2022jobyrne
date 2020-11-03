public class DogClient {
    public static void main(String[] args) {
        Pet d1 = new Dog();
        System.out.println(d1);

        Pet d2 = new Dog("Buddy", 1, "Golden Retreiver");
        System.out.println(d2);
    }
}