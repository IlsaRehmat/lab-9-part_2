import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private Room currentRoom;
    private List<Item> inventory;
    
    public Player(String name, Room startingRoom){
        this.name = name;
        currentRoom = startingRoom;
        inventory = new ArrayList<>();
    }
    
    public Room getCurrentRoom(){
        return currentRoom;
    }
    
    public void setCurrentRoom( Room room){
        this.currentRoom = room;
    }
    
    public String getName(){
        return name;
    }
    
    public List<Item> getInventory(){
        return inventory;
    }
    
    public void addItem(Item item){
        inventory.add(item);
    }
    
    public void removeItem(Item item){
        inventory.remove(item);
    }
}

