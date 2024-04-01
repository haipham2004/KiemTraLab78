package com.example.PH39701_Lab5_6_0406.repository;

import com.example.PH39701_Lab5_6_0406.config.HibernateConfig;
import com.example.PH39701_Lab5_6_0406.entity.HoaDon;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class HoaDonRepository {
    private List<HoaDon> listHD = new ArrayList<>();

    public List<HoaDon> getAll() {
        Session session = HibernateConfig.getFACTORY().openSession();
        listHD = session.createQuery("From HoaDon", HoaDon.class).getResultList();
        return listHD;
    }

    public HoaDon gtOnee(int id) {
        Transaction transaction = null;
        HoaDon hd = null;
        try (Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            hd = session.get(HoaDon.class, id);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return hd;
    }

    public boolean add(HoaDon hd) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hd);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean update(HoaDon hd) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.update(hd);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean delete(HoaDon hd) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(hd);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        HoaDonRepository repo = new HoaDonRepository();
        System.out.println("HoaDon: " + repo.getAll());
    }
}
