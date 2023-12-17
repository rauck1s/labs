package org.example.laba3.productAndPackaging;
import org.example.laba3.helperClass.ProductPackaging;

import java.util.Objects;

public class PackagingWeightProduct extends WeightProduct implements ProductInterface {
    private ProductPackaging packaging;
    private double weight;
    public PackagingWeightProduct(ProductPackaging packaging, Product product, double weight) throws IllegalAccessException {
        super(product.getNameProduct(), product.getDescriptions());
        if(weight <= 0){
            throw new IllegalAccessException("Exception: incorrect weight package");
        }
        if(packaging.getPackagingName().isBlank()){
            throw new IllegalAccessException("Exception: incorrect name package");
        }
        this.packaging = new ProductPackaging(packaging.getPackagingName(), packaging.getPackagingWeight());
        this.weight = weight;
    }

    public ProductPackaging getPackaging() {
        return packaging;
    }

    public void setPackaging(ProductPackaging packaging) {
        this.packaging = packaging;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getName() {
        return super.getNameProduct();
    }

    @Override
    public double getNetto() {
        return weight;
    }
    @Override
    public double getBrutto() {
        return weight + packaging.getPackagingWeight();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackagingWeightProduct that = (PackagingWeightProduct) o;
        return Double.compare(weight, that.weight) == 0 && Objects.equals(packaging, that.packaging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), packaging, weight);
    }

    @Override
    public String toString() {
        return "PackagingWeightProduct{" + '\n' +
                "packaging=" + packaging + '\n' +
                ", weight=" + weight + '\n' +
                '}' + '\n';
    }
}
