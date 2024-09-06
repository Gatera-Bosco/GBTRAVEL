/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gbtravel.dao;

import com.gbtravel.util.HibernateUtil;
import com.gbtravel.model.Passenger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hnjej
 */
public class PassengerDAO {
   public void savePassenger(Passenger passenger){
       Session session=HibernateUtil.getSessionFactory().openSession();
       Transaction tx=session.beginTransaction();
       session.save(passenger);
       tx.commit();
       session.close();
   } 
}
