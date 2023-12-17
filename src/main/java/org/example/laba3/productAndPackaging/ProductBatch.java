package org.example.laba3.productAndPackaging;

import java.util.Arrays;
import java.util.Objects;

public class ProductBatch {
    private String descriptions;
    private ProductInterface[] product;
    public ProductBatch(ProductInterface[] product, String descriptions) throws IllegalAccessException {
        if(product == null){
            throw new IllegalAccessException("Exception: NullPointerExceptions");
        }
        this.descriptions = descriptions;
        this.product = product;
    }
    public double getBrutto(){
        double total = 0;
        for (ProductInterface item : product) {
            if (item == null) continue;
            total += item.getBrutto();
        }
        return total;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public void setProduct(ProductInterface[] product) {
        this.product = product;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public ProductInterface[] getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductBatch that = (ProductBatch) o;
        return Objects.equals(descriptions, that.descriptions) && Arrays.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(descriptions);
        result = 31 * result + Arrays.hashCode(product);
        return result;
    }

    @Override
    public String toString() {
        return "ProductBatch{" + '\n' +
                "descriptions='" + descriptions + '\n' +
                ", product=" + Arrays.toString(product) + '\n' +
                '}' + '\n';
    }
}
