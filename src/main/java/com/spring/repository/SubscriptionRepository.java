package com.spring.repository;

import com.spring.model.Subscriptions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface SubscriptionRepository extends JpaRepository<Subscriptions, Serializable> {
}
