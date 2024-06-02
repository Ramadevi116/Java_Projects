package com.barclays.task;

import com.barclays.dao.GOffersDao;
import com.barclays.model.Offers;
import com.barclays.model.TaskResult;
import lombok.Data;

import java.util.concurrent.Callable;

public class GOffersTask implements Callable<TaskResult> {

    private String cardNumber;

    public GOffersTask(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public TaskResult call() throws Exception{
        System.out.println("Enter into GOffersTask");
        GOffersDao gOffersDao = new GOffersDao();
        Offers gOffers = gOffersDao.getOffers(cardNumber);
        System.out.println("Exit from GOffersTask");
        return TaskResult.builder()
                .taskName("gTask")
                .taskResult(gOffers)
                .build();
    }
}
