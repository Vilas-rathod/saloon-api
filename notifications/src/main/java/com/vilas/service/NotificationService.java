package com.vilas.service;

import com.vilas.modal.Notification;
import com.vilas.payload.dto.NotificationDTO;

import java.util.List;

public interface NotificationService {
    NotificationDTO createNotification(Notification notification);
    List<Notification> getAllNotificationsByUserId(Long userId);
    List<Notification> getAllNotificationsBySalonId(Long salonId);
    Notification markNotificationAsRead(Long notificationId) throws Exception;
    void deleteNotification(Long notificationId);
    List<Notification> getAllNotifications();
}
