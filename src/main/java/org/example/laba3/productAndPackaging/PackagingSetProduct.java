package org.example.laba3.productAndPackaging;

import org.example.laba3.helperClass.ProductPackaging;

import java.util.Arrays;
import java.util.Objects;

public class PackagingSetProduct implements ProductInterface {
    private  ProductInterface[] product;
    private ProductPackaging packed;
    public PackagingSetProduct(ProductInterface[] product, ProductPackaging packed) throws IllegalArgumentException {
        if(product == null) {
            throw new IllegalArgumentException("Exceptions: NullPointerExceptions");
        }
        this.packed = packed;
        this.product = product;
    }

    public ProductInterface[] getProduct() {
        return product;
    }

    public void setProduct(ProductInterface[] product) {
        this.product = product;
    }

    public ProductPackaging getPacked() {
        return packed;
    }

    public void setPacked(ProductPackaging packed) {
        this.packed = packed;
    }

    @Override
    public String getName() {
        return null;
    }

    public double getNetto(){
        double total = 0;
        for (ProductInterface item : product) {
            if (item == null) continue;
            total += item.getBrutto();
        }
        return total;
    }
    public double getBrutto(){
        double total = 0;
        for (ProductInterface item : product) {
            if (item == null) continue;
            total += item.getBrutto();
        }
        return total + packed.getPackagingWeight();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PackagingSetProduct that = (PackagingSetProduct) o;
        return Arrays.equals(product, that.product) && Objects.equals(packed, that.packed);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(packed);
        result = 31 * result + Arrays.hashCode(product);
        return result;
    }
    @Override
    public String toString() {
        return "PackagedSet{" + '\n' +
                "product=" + Arrays.toString(product) + '\n' +
                ", packed=" + packed + '\n' +
                '}' + '\n';
    }
}