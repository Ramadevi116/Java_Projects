package com.barclays.task;

import com.barclays.dao.POffersDao;
import com.barclays.model.Offers;
import com.barclays.model.TaskResult;

import java.util.concurrent.Callable;

public class POffersTask  implements Callable<TaskResult> {

    private String cardNumber;

    public POffersTask(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public TaskResult call() throws Exception{
        System.out.println("Enter into POffersTask");
        POffersDao pOffersDao = new POffersDao();
        Offers pOffers = pOffersDao.getOffers(cardNumber);

        System.out.println("Exit from POffersTask");
        return TaskResult.builder()
                .taskName("pTask")
                .taskResult(pOffers)
                .build();
    }
}
