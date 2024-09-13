package org.example.LibraryApps;

public class DVD extends LibraryMaterials {
    String materialName = "DVD";
    private int available = 5;

    void borrowMaterial(){
        try {
            if (available == 0){
                throw new Exception("DVD are not available");
            }
            available--;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    void returnMaterial(){
        try {
            if (available == 5){
                throw new Exception("This isn't our DVD");
            }

            available++;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    int getAvailable(){
        return available;
    }

    String getMaterialName(){
        return materialName;
    }
}
