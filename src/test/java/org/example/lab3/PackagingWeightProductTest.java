package org.example.lab3;

import org.example.lab3.productAndPackaging.PackagingWeightProduct;
import org.example.lab3.helperClass.ProductPackaging;
import org.example.lab3.productAndPackaging.WeightProduct;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackagingWeightProductTest {
    PackagingWeightProduct candy;
    @BeforeEach
    void setUp() throws IllegalAccessException {
        ProductPackaging packed = new ProductPackaging("For candy", 0.5);
        WeightProduct rafaello = new WeightProduct("rafaello", "rafaello is good");
        candy = new PackagingWeightProduct(packed, rafaello, 1);
    }

    @Test
    void getNetto() {
        assertEquals(1, candy.getNetto());
    }

    @Test
    void getBrutto() {
        assertEquals(1.5, candy.getBrutto());
    }
}