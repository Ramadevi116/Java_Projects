package com.barclays.dao;

import com.barclays.model.Offers;

public class POffersDao {
    public Offers getOffers(String cardNumber){
        return Offers.builder()
                .desc("good")
                .oid("111")
                .expDate("30-may-2024")
                .name("iphone")
                .imgUrl("http://amazon/iphone.jpg")
                .build();
    }
}
