package org.example.lab3.helperClass;

import java.util.Objects;

public class ProductPackaging{
    private String packagingName;
    private double packagingWeight;
    public ProductPackaging(String name, double weight){
        this.packagingWeight = weight;
        this.packagingName = name;
    }

    public void setPackagingName(String packagingName) {
        this.packagingName = packagingName;
    }

    public void setPackagingWeight(double packagingWeight) {
        this.packagingWeight = packagingWeight;
    }

    public String getPackagingName() {
        return packagingName;
    }

    public double getPackagingWeight() {
        return packagingWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductPackaging that = (ProductPackaging) o;
        return Double.compare(packagingWeight, that.packagingWeight) == 0 && Objects.equals(packagingName, that.packagingName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packagingName, packagingWeight);
    }

    @Override
    public String toString() {
        return "ProductPackaging{" + '\'' +
                "packagingName='" + packagingName + '\'' +
                ", packagingWeight=" + packagingWeight + '\'' +
                '}' + '\'';
    }
}
