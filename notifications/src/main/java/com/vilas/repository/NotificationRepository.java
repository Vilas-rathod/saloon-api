package com.vilas.repository;

import com.vilas.modal.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification,
        Long> {
    List<Notification> findByUserId(Long userId);
    List<Notification> findBySalonId(Long salonId);
}
