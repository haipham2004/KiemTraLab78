package com.example.PH39701_Lab5_6_0406.repository;

import com.example.PH39701_Lab5_6_0406.config.HibernateConfig;
import com.example.PH39701_Lab5_6_0406.entity.KhachHang;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;

public class KhachHangRepository {
    private List<KhachHang> listHD = new ArrayList<>();

    public List<KhachHang> getAll() {
        Session session = HibernateConfig.getFACTORY().openSession();
        listHD = session.createQuery("From KhachHang", KhachHang.class).getResultList();
        return listHD;
    }
}
