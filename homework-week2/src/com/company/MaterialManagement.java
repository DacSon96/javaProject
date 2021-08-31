package com.company;

public class MaterialManagement {
    private Material[] materials = new Material[0];

    public MaterialManagement() {
    }

    public MaterialManagement(Material[] materials) {
        this.materials = materials;
    }

    public Material[] getMaterials() {
        return materials;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

    public void addNewMaterialToList(Material material) {
        Material[] newMaterial = new Material[materials.length + 1];
        for (int i = 0; i < materials.length; i++) {
            newMaterial[i] = materials[i];
        }
        newMaterial[materials.length] = material;
    }

    public void updateMaterialInfo(Material material, int index) {
        materials[index] = material;
    }

    public void deleteMaterial(int index) {
        if (index < 0 || index >= materials.length) {
            System.out.println("Vị trí không hợp lệ");
        } else {
            Material[] newMaterial = new Material[materials.length - 1];
            int count = 0;
            for (int i = 0; i < materials.length; i++) {
                if (i == index) {
                    count++;
                }
                newMaterial[i - count] = materials[i];
            }
            materials = newMaterial;
        }
    }

}
