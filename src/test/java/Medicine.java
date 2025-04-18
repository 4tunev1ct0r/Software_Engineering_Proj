
public class Medicine {
    
    private int id, quantity, Selling_price, Buying_price;
    private String Name, usage;
    public Medicine(){
        this.id = 0;
        this.quantity = 0;
        this.Selling_price = 0;
        this.Buying_price = 0;
        this.Name = "";
        this.usage = "";
    }
    public Medicine(int id, int quantity, String Name, int Selling_price, int Buying_price, String usage){
        this.id = id;
        this.quantity = quantity;
        this.Name = Name;
        this.Selling_price = Selling_price;
        this.Buying_price = Buying_price;
        this.usage = usage; 
        
    }
//Now starts the portion for our setters and getter for the information of our code 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getSelling_price() {
        return Selling_price;
    }

    public void setSelling_price(int Selling_price) {
        this.Selling_price = Selling_price;
    }

    public int getBuying_price() {
        return Buying_price;
    }

    public void setBuying_price(int Buying_price) {
        this.Buying_price = Buying_price;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "Medicine{" + "id=" + id + "\n quantity=" + quantity + "\n Name=" + Name + "\n Selling_price=" + Selling_price + "\n Buying_price=" + Buying_price + "\n usage=" + usage + '}';
    }
    
    
}
