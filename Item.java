
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/*
 * Question 21
 * The Item class should produce the item description 
 * it's the item's responsibility to describe itself.
 * The Room class should fetch and combine that description 
 * into its own getLongDescription().
 * The Game class should be responsible for printing the 
 * description, since it manages player interaction.
 */
public class Item
{
    private String description;
    private double weight; 
    private String name;
    public Item(String description, double weight) {
        this.description = description;
        this.weight = weight;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    
    public String getName(){
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getLongDescription() {
        return description + " (Weight: " + weight + "kg)";
    }
}
