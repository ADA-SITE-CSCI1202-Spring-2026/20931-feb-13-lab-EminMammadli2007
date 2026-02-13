package week03.invoice;

public class Invoice {
    String partNumber;
    String description;
    int quantity;
    double priceperitem;

    public Invoice(String partNumber, String description, int quantity, double priceperitem){
        this.partNumber = partNumber;
        this.description = description;
        this.quantity = quantity;
        this.priceperitem = priceperitem;
    }

    public String getpartNumber() {
        return partNumber;
    }

    public void setpartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return priceperitem;
    }

    public void setPricePerItem(double priceperitem) {
        this.priceperitem = priceperitem;
    }

}
