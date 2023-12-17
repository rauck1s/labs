package org.example.laba3.productAndPackaging;

import org.example.laba3.helperClass.ProductPackaging;
import java.util.Objects;

public class PackagingPieceProduct extends PieceProduct implements ProductInterface {
    private int amount;
    private ProductPackaging packaging;
    public PackagingPieceProduct(ProductPackaging packaging, PieceProduct product, int amount ) throws IllegalAccessException {
        super(product.getNameProduct(), product.getDescriptions(), product.getWeightPieceProduct());
        if(amount <= 0){
            throw new IllegalAccessException("Exception: amount cannot be less that 1");
        }
        this.packaging = packaging;
        this.amount = amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ProductPackaging getPackaging() {
        return packaging;
    }

    public void setPackaging(ProductPackaging packaging) {
        this.packaging = packaging;
    }

    public int getAmount(){
        return amount;
    }
    @Override
    public double getNetto(){
        return amount * super.getWeightPieceProduct();
    }
    @Override
    public  double getBrutto(){
        return (amount * super.getWeightPieceProduct() + packaging.getPackagingWeight());
    }
    @Override
    public String getName(){
        return super.getNameProduct();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PackagingPieceProduct that = (PackagingPieceProduct) o;
        return amount == that.amount && Objects.equals(packaging, that.packaging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amount, packaging);
    }

    @Override
    public String toString() {
        return "PackagingPieceProduct{" + '\n' +
                "amount=" + amount + '\n' +
                ", packaging=" + packaging + '\n' +
                '}' + '\n';
    }
}