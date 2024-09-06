/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gbtravel.service;

import com.gbtravel.model.Passenger;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author hnjej
 */
public interface PassengerServiceInterface extends Remote{
    public void savePassenger(Passenger passenger) throws RemoteException;
}
