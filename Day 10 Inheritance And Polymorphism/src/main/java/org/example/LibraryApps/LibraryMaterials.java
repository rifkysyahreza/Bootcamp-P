package org.example.LibraryApps;

public class LibraryMaterials {
    String materialName = "";
    int available = 0;

    void borrowMaterial(){
        try {
            if (available == 0){
                throw new Exception(this.materialName + " are not available");
            }
            available--;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void returnMaterial(){
        System.out.println("Returning");
    }

    int getAvailable(){
        return available;
    }

    String getMaterialName(){
        return materialName;
    }
}
