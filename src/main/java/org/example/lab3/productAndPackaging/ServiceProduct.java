package org.example.lab3.productAndPackaging;

import org.example.lab3.filter.Filter;

public class ServiceProduct {
    public static int countByFilter(ProductBatch batch, Filter filter) {
        int count = 0;
        for(ProductInterface item: batch.getProduct()){
            if(item instanceof Product || item instanceof PackagingSetProduct ){
                if(filter.apply(item.getName())){
                    count ++;
                }
            }
        }
        return count;
    }
}
