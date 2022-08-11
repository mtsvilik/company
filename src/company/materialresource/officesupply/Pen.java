package company.materialresource.officesupply;

public class Pen extends OfficeSupply {

    private String color;

    public Pen(String title) {
        super(title);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
