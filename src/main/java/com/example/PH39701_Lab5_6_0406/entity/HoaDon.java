package com.example.PH39701_Lab5_6_0406.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name="HoaDon")
@Entity
@Getter
@Setter
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idHoaDon")
    private int idHoaDon;

    @Column(name="maHoaDon")
    private String maHoaDon;

    @Column(name="tongTienHang")
    private float tongTienHang;

    @Column(name="tienThua")
    private float tienThua;

    @Column(name="ghiChu")
    private String ghiChu;

    @Column(name="maGiaoDich")
    private String maGiaoDich;

    @Column(name="idKhachHang")
    private int idKhachHang;

}
