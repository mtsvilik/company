package company.materialresource.material;

import company.materialresource.BuildingMaterial;

public class Block extends BuildingMaterial {

    private int size;

    public Block(String title) {
        super(title);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
