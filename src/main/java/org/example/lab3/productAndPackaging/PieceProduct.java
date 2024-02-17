package org.example.lab3.productAndPackaging;

import java.util.Objects;

public class PieceProduct extends Product {
    private double weightPieceProduct;
    public PieceProduct(String name, String descriptions, double weight) throws IllegalAccessException {
        super(name, descriptions);
        this.weightPieceProduct = weight;
    }

    public double getWeightPieceProduct() {
        return weightPieceProduct;
    }

    public void setWeightPieceProduct(double weightPieceProduct) {
        this.weightPieceProduct = weightPieceProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PieceProduct that = (PieceProduct) o;
        return Double.compare(weightPieceProduct, that.weightPieceProduct) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weightPieceProduct);
    }

    @Override
    public String toString() {
        return "PieceProduct{" + '\n' +
                "weightPieceProduct=" + weightPieceProduct + '\n' +
                '}' + '\n';
    }
}
