package id.lisna.mobil.model;

public class Product {
    private int id;
    private String name;
    private float price;
    private int stock;
    private Category category;
    private boolean isAvailable;
    private String warna;

    public Product(int id, String name, float price, int stock, Category category, boolean isAvailable, String warna) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.isAvailable = isAvailable;
        this.warna = warna;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getWarna() {
        return warna;
    }

   public void setWarna(String warna) {
        this.warna = warna;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }
    
     public boolean isAvailabe() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    
}
