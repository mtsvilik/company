package company.materialresource.material;

import company.materialresource.BuildingMaterial;

public class Brick extends BuildingMaterial {

    private String color;

    public Brick(String title) {
        super(title);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
