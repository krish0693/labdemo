package com.spring.model;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table
@Entity(name = "subscriptions")
public class Subscriptions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String subscriptionName;


    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }
}
