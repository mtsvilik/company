package company.project;

import company.materialresource.BuildingMaterial;
import company.materialresource.officesupply.OfficeSupply;

import java.math.BigDecimal;
import java.util.List;

public class PromotionProject<M extends BuildingMaterial, S extends OfficeSupply> {

    private String projectTitle;
    private Integer square;
    private BigDecimal price;
    private List<M> materials;
    private List<S> supplies;

    public PromotionProject(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<M> getMaterials() {
        return materials;
    }

    public void setMaterials(List<M> materials) {
        this.materials = materials;
    }

    public List<S> getSupplies() {
        return supplies;
    }

    public void setSupplies(List<S> supplies) {
        this.supplies = supplies;
    }
}
