package restaurant;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        ArrayList<MenuItem> Menu = new ArrayList<>();
        Menu.add(new MenuItem("Mozzarella Sticks", 9.99, "fried cheese", "Appetizer", true));
        Menu.add(new MenuItem("Fried Pickles", 6.99, "deep fried pickled cucumbers with ranch dressing", "Appetizer", true));
        Menu.add(new MenuItem("Spaghetti", 9.99, "handmade spaghetti with marinara sauce", "Main", true));
        Menu.add(new MenuItem("Lasagna", 9.99, "Garfield's favorite food", "Main", false));
        Menu.add(new MenuItem("Ice Cream", 4.99, "frozen sugar milk", "Dessert", true));
        Menu.add(new MenuItem("Creme Broule", 5.99, "custard with a melted sugar shell", "Dessert", true));
    }


}
