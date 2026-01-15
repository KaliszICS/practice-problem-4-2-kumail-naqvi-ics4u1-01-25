/**
 * Represents a Dog with a name, breed, and weight.
 * @author Kumail
 * @version 1.0
 */
public class Dog {
    private String name;
    private String breed;
    private int weight;

    /**
     * Constructs a Dog and initializes all instance variables.
     * @param name   the dog's name
     * @param breed  the dog's breed
     * @param weight the dog's weight (int)
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * Gets the dog's name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the dog's name.
     *
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the dog's breed.
     *
     * @return breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the dog's breed.
     *
     * @param breed new breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Gets the dog's weight.
     *
     * @return weight as an int
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the dog's weight.
     *
     * @param weight new weight as an int
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}