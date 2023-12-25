package org.example.laba3.productAndPackaging;

import org.example.laba3.filter.Filter;

public class ServiceProduct {
    public static int countByFilter(ProductBatch batch, Filter filter) {
        int count = 0;
        for(ProductInterface item: batch.getProduct()){
            if(item instanceof Product ){
                if(filter.apply(item.getName())){
                    count ++;
                }
            }
            if(item instanceof PackagingSetProduct){
                ProductInterface[] array = ((PackagingSetProduct) item).getProduct();
                for (ProductInterface productInterface : array) {
                    if (filter.apply(productInterface.getName())) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
