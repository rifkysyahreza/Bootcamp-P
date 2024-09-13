package org.example.LibraryApps;

public class Books extends LibraryMaterials {
    String materialName = "Books";
    private int available = 10;

    void borrowMaterial(){
        try {
            if (available == 0){
                throw new Exception("Books are not available");
            }
            available--;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    void returnMaterial(){
        try {
            if (available == 10){
                throw new Exception("This isn't our books");
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
