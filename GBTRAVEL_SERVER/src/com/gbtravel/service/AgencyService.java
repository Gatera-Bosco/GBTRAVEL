/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gbtravel.service;

import com.gbtravel.dao.AgencyDAO;
import com.gbtravel.model.Agency;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author hnjej
 */
public class AgencyService extends UnicastRemoteObject implements AgencyServiceInterface{

    public AgencyService() throws RemoteException {
        super();
    }

    
    @Override
    public void saveAgency(Agency agency) throws RemoteException {
        AgencyDAO agencyDao=new AgencyDAO();
        agencyDao.saveAgency(agency);
    }

    @Override
    public void updateAgency(Agency agency) throws RemoteException {
        AgencyDAO agencyDao=new AgencyDAO();
        agencyDao.updateAgency(agency);
    }
    
}
