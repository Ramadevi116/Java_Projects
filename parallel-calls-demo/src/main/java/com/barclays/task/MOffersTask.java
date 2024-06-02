package com.barclays.task;

import com.barclays.dao.MOffersDao;
import com.barclays.dao.POffersDao;
import com.barclays.model.Offers;
import com.barclays.model.TaskResult;

import java.util.concurrent.Callable;

public class MOffersTask implements Callable<TaskResult> {

    private String cardNumber;

    public MOffersTask(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public TaskResult call() throws Exception{
        System.out.println("Enter into MOffersTask");
        MOffersDao mOffersDao = new MOffersDao();
        Offers mOffers = mOffersDao.getOffers(cardNumber);

        System.out.println("Exit from MOffersTask");
        return TaskResult.builder()
                .taskName("mTask")
                .taskResult(mOffers)
                .build();
    }
}
