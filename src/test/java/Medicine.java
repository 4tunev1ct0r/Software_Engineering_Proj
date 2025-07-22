
public class Medicine {
    
    private int id, quantity, Sellingprice, Buyingprice;
    private String Name, Description;
    public Medicine(){
        this.id = 0;
        this.quantity = 0;
        this.Sellingprice = 0;
        this.Buyingprice = 0;
        this.Name = "";
        this.Description = "";
    }
    public Medicine(int id, int quantity, String Name, int Sellingprice, int Buyingprice, String Description){
        this.id = id;
        this.quantity = quantity;
        this.Name = Name;
        this.Sellingprice = Sellingprice;
        this.Buyingprice = Buyingprice;
        this.Description = Description; 
        
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

    public int getSellingprice() {
        return Sellingprice;
    }

    public void setSellingprice(int Sellingprice) {
        this.Sellingprice = Sellingprice;
    }

    public int getBuyingprice() {
        return Buyingprice;
    }

    public void setBuyingprice(int Buyingprice) {
        this.Buyingprice = Buyingprice;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "Medicine{" + "id=" + id +"\n Name=" + Name + "\n Selling_price=" + Sellingprice + "\n Buying_price=" + Buyingprice + "\n Quantity=" + quantity +  "\n Description=" + Description + '}';
    }
    
    
}
