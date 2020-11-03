public class Dog extends Pet {
    // Instance variable(s)
    //already has name and age from pet
    private String Breed;

    // Constructors
    public Dog(String name, int age, String dogBreed)
    {
        ///THIS
        super(name, age);
        this.Breed = Breed;
    }

    public Dog()
    {
        super("dogster", 3);
        this.Breed = "German Shepard";
    }

    // makeNoise() method
    public void makeNoise()
    {
        System.out.println("ruff");
    }

    // toString method
    public String toString()
    {
        String str = this.getName() + ", " + this.getAge() + ", " + this.getgetBreed();
        return str;
    }

    // Getter
    public String getgetBreed() 
    {
        return this.Breed;
    }

    // Setter
    public void setgetBreed(String Breed) 
    {
        
            this.Breed = Breed;
        
    }
}