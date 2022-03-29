package restaurant;

import java.util.Date;

public class MenuItem {

    private String itemName;
    private double price;
    private String description;
    private String category;
    private boolean newItem;
    private Date createdAt;

    public MenuItem(String itemName, double price, String description, String category, boolean newItem) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
        this.createdAt = new Date();
    }

    public void setItemName (String aItemName) {
        itemName = aItemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription (String aDescription) {
        description = aDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setCategory (String aCategory) {
        category = aCategory;
    }

    public String getCategory () {
        return category;
    }

    public void setNewItem (boolean aNewItem) {
        newItem = aNewItem;
    }

    public boolean getNewItem () {
        return newItem;
    }

    public Date getCreatedAt () {
        return createdAt;
    }

    public void setCreatedAt(Date aCreatedAt) {
        this.createdAt = aCreatedAt;
    }
}
