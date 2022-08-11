package company.materialresource.material;

import company.materialresource.BuildingMaterial;

public class Module extends BuildingMaterial {

    private String shape;

    public Module(String title) {
        super(title);
    }

    public Module() {
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
