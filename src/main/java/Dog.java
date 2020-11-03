public class Dog extends Pet {
    // Instance variable(s)
    //already has name and age from pet
    private String Breed;

    // Constructors
    public Dog(String name, int age, String dogBreed)
    {
        ///THIS
        super(name, age);
        this.Breed = dogBreed;
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
        String str = this.getName() + ", " + this.getAge() + ", " + this.getBreed();
        return str;
    }

    // Getter
    public String getBreed() 
    {
        return this.Breed;
    }

    // Setter
    public void setBreed(String Breed) 
    {
        
            this.Breed = Breed;
        
    }
}