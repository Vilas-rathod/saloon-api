package com.vilas.service.clients;

import com.vilas.domain.PaymentMethod;
import com.vilas.exception.UserException;
import com.vilas.payload.response.PaymentLinkResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("PAYMENT")
public interface PaymentFeignClient {

    @PostMapping("/create")
    public ResponseEntity<PaymentLinkResponse> createPaymentLink(
            @RequestHeader("Authorization") String jwt,
            @RequestParam Long bookingId,
            @RequestParam PaymentMethod paymentMethod) throws UserException;
}
