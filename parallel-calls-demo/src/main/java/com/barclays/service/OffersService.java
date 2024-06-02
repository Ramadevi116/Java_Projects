package com.barclays.service;

import com.barclays.model.Offers;
import com.barclays.model.TaskResult;
import com.barclays.task.GOffersTask;
import com.barclays.task.MOffersTask;
import com.barclays.task.POffersTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class OffersService {

    public List<Offers> getOffers(String cardNumber) throws InterruptedException, ExecutionException {
        List<Offers> offersList = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Set<Callable<TaskResult>> tasks = new HashSet<>();
        tasks.add(new GOffersTask(cardNumber));
        tasks.add(new POffersTask(cardNumber));
        tasks.add(new MOffersTask(cardNumber));

        List<Future<TaskResult>> futureList = executorService.invokeAll(tasks);

        for (Future<TaskResult> future : futureList) {
            TaskResult taskResult = future.get(); //typecasting
            Offers offers = (Offers) taskResult.getTaskResult();
            offersList.add(offers);
        }
        executorService.shutdown();
        return offersList;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        OffersService offersService = new OffersService();
        List<Offers> offersList = offersService.getOffers("4579769548432129121");
        System.out.println("List of offers: " + offersList);
    }
}
