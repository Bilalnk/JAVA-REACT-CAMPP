package com.Test;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StrabucksCustomerManager;
import Entities.Customer;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {


    	BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
    //	BaseCustomerManager customerManager = new StrabucksCustomerManager(new MernisServiceAdapter());

            
        
        customerManager.save(new Customer(1,"Bilal Nadir", "Karataþ", new Date(1999,1,26), "111111111"));

        System.out.println();
    }
}
