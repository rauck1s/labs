package org.example.lab3;

import org.example.lab3.productAndPackaging.PackagingPieceProduct;
import org.example.lab3.productAndPackaging.PieceProduct;
import org.example.lab3.helperClass.ProductPackaging;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PackagingPieceProductTest {
    private static PackagingPieceProduct gunsPacked;
    @BeforeEach
     void setUp() throws IllegalAccessException {
        ProductPackaging packed = new ProductPackaging("For Ak-47", 10);
        PieceProduct guns = new PieceProduct("Ak-47", "From РАССИЯ", 4);
        gunsPacked = new PackagingPieceProduct(packed, guns,10);
    }
    @Test
    void getNetto() {
        assertEquals(40, gunsPacked.getNetto());
    }
    @Test
    void getBrutto() {
        assertEquals(50, gunsPacked.getBrutto());
    }
}