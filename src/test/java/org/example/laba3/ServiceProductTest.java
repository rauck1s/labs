package org.example.laba3;

import org.example.laba3.filter.LengthStringFilter;
import org.example.laba3.helperClass.ProductPackaging;
import org.example.laba3.productAndPackaging.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceProductTest {

    private ProductBatch batch;
    private ProductBatch batch1;
    private static LengthStringFilter filter;

    @BeforeEach
    void setUp() throws IllegalAccessException {
        ProductPackaging packed = new ProductPackaging("Pack", 0.1);
        WeightProduct apple = new WeightProduct("Apple ", "red apple");
        WeightProduct bananas = new WeightProduct("Bananas", "default bananas");
        WeightProduct cherry = new WeightProduct("Cherry", "cherry cherryyyyy");

        PackagingWeightProduct applePacked = new PackagingWeightProduct(packed, apple, 1);
        PackagingWeightProduct bananasPacked = new PackagingWeightProduct(packed, bananas, 0.5);
        PackagingWeightProduct cherryPacked = new PackagingWeightProduct(packed, cherry, 2);

        ProductPackaging boxFruits = new ProductPackaging("Box fruits", 1);
        ProductInterface[] fruitsInterface = new ProductInterface[]{applePacked, bananasPacked, cherryPacked};
        PackagingSetProduct fruits = new PackagingSetProduct(fruitsInterface, boxFruits, "fruits");

        ProductPackaging boxForMelonAndWatermelon = new ProductPackaging("Packed melon and watermelon", 1);
        PieceProduct melon = new PieceProduct("melon", "default melon", 1.8);
        PackagingPieceProduct melonPacked = new PackagingPieceProduct(boxForMelonAndWatermelon, melon,4);

        PieceProduct watermelon = new PieceProduct("watermelon", "default watermelon", 8);
        PackagingPieceProduct watermelonPacked = new PackagingPieceProduct(boxForMelonAndWatermelon, watermelon,4);

        ProductInterface[] allBerriesAndFruits = new ProductInterface[]{watermelonPacked, melonPacked,
                fruits};

        batch = new ProductBatch(allBerriesAndFruits, "Berries and fruits");
        filter = new LengthStringFilter();
    }
    @Test
    void countByFilter() {
        for(ProductInterface product: batch.getProduct()){
            System.out.println(product.getName());
        }
        assertEquals(2, ServiceProduct.countByFilter(batch,filter));
    }
}