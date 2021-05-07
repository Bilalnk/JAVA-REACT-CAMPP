package com.company;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {


        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(new Customer(1,"Bilal", "Karataş", new Date(), "111111"));

    }
}
