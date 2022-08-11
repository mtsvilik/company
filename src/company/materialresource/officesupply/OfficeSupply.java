package company.materialresource.officesupply;

public class OfficeSupply {

    private String title;
    private int quantity;

    public OfficeSupply(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
