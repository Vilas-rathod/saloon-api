package com.vilas.messaging;


import com.vilas.modal.PaymentOrder;

import com.vilas.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookingEventConsumer {


    private final BookingService bookingService;

    @RabbitListener(queues = "booking-queue")
    public void bookingUpdateListener(PaymentOrder paymentOrder){

        System.out.println("Received message: " + paymentOrder);

        bookingService.bookingSucess(paymentOrder);

        System.out.println("Received message: " + paymentOrder);

    }
}
