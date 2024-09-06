/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gbtravel.dao;

import com.gbtravel.util.HibernateUtil;
import com.gbtravel.model.Agency;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hnjej
 */
public class AgencyDAO {

    public boolean saveAgency(Agency agency) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(agency);
        tx.commit();
        session.close();
        return true;
    }

    public boolean createAgency(Agency agency) {
        boolean result = false;
        String url = "jdbc:postgresql://localhost:5433/gbtravel_db";
        String sql = "INSERT INTO agency VALUES(?,?,?)";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, "postgres", "postgres");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, agency.getCode());
            ps.setString(2, agency.getAgencyName());
            ps.setString(3, agency.getContact());

            ps.executeUpdate();
            result = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AgencyDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }

    public boolean createAgencies(List<Agency> agencies) {

        int batchSize = 500;
        int counter = 0;

        boolean result = false;
        String url = "jdbc:postgresql://localhost:5433/gbtravel_db";
        String sql = "INSERT INTO agency VALUES(?,?,?)";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, "postgres", "postgres");
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement(sql);
            for (Agency agency : agencies) {
                ps.setString(1, agency.getCode());
                ps.setString(2, agency.getAgencyName());
                ps.setString(3, agency.getContact());
                ps.addBatch();
                counter++;
                if (counter == batchSize) {
                    counter = 0;
                    ps.executeBatch();
                }
            }
            ps.executeBatch();
            con.commit();
            result = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(AgencyDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                con.setAutoCommit(true);
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AgencyDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }

    public boolean updateAgency(Agency agency) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(agency);
        tx.commit();
        session.close();
        return true;
    }
}
