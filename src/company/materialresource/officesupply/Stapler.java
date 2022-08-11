package company.materialresource.officesupply;

public class Stapler extends OfficeSupply {

    private String size;

    public Stapler(String title) {
        super(title);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
