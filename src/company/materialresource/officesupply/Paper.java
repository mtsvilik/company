package company.materialresource.officesupply;

public class Paper extends OfficeSupply {

    private String classOfPaper;

    public Paper(String title) {
        super(title);
    }

    public String getClassOfPaper() {
        return classOfPaper;
    }

    public void setClassOfPaper(String classOfPaper) {
        this.classOfPaper = classOfPaper;
    }
}
