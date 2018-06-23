package com.tulu.worldquant;

import java.util.HashMap;

public class VerifyItem {
    static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {
        HashMap<String, Float> originPrices = new HashMap<String, Float>();
        if (origItems.length != origPrices.length || items.length != prices.length)
            return -1;

        for (int i=0;i<origItems.length;i++){
            originPrices.put(origItems[i],new Float(origPrices[i]));
        }

        int ret = 0;
        for (int i=0;i<items.length;i++){
            String item = items[i];

            Float origPrice = originPrices.get(item);
            if (origPrice == null)
                ret ++;

            Float actualPrice = new Float(prices[i]);
            if (!origPrice.equals(actualPrice))
                ret++;
        }
        return ret;
    }
}
