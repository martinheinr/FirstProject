package heinrich.petar.hr.pretvaranjezvukautext;

import java.util.ArrayList;

public class Products {
    private Integer id;
    private String rootProduct;
    private String fullNameOfProduct;
    private String descriptionOfProduct;
    private Integer imageOfProduct;





    public Products(Integer id, String rootProduct, String fullNameOfProduct, String descriptionOfProduct, Integer imageOfProduct) {
        this.id = id;
        this.rootProduct = rootProduct;
        this.fullNameOfProduct = fullNameOfProduct;
        this.descriptionOfProduct = descriptionOfProduct;
        this.imageOfProduct = imageOfProduct;
    }


    public Products()  {

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRootProduct() {
        return rootProduct;
    }

    public void setRootProduct(String rootProduct) {
        this.rootProduct = rootProduct;
    }

    public String getFullNameOfProduct() {
        return fullNameOfProduct;
    }

    public void setFullNameOfProduct(String fullNameOfProduct) {
        this.fullNameOfProduct = fullNameOfProduct;
    }

    public String getDescriptionOfProduct() {
        return descriptionOfProduct;
    }

    public void setDescriptionOfProduct(String descriptionOfProduct) {
        this.descriptionOfProduct = descriptionOfProduct;
    }

    public Integer getImageOfProduct() {
        return imageOfProduct;
    }

    public void setImageOfProduct(Integer imageOfProduct) {
        this.imageOfProduct = imageOfProduct;
    }
}
