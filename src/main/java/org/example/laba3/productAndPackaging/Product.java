package org.example.laba3.productAndPackaging;

import java.util.Objects;

public class Product {
    private String nameProduct;
    private String descriptions;
    public Product(String name, String descriptions) throws IllegalAccessException {
        if(name.isBlank()){
            throw new IllegalAccessException("Exception: incorrect name product");
        }
        this.descriptions = descriptions;
        this.nameProduct = name;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameProduct, product.nameProduct) && Objects.equals(descriptions, product.descriptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, descriptions);
    }

    @Override
    public String toString() {
        return "Product{" + '\n' +
                "nameProduct='" + nameProduct + '\n' +
                ", descriptions='" + descriptions + '\n' +
                '}' + '\n';
    }
}
