package com.example.thi_cuoi_m3.model;

import java.util.Date;

public class Premises {
    private String maMataBang;
    private int dienTich;
    private boolean trangThai;
    private int tang;
    private boolean loaiMatBang;
    private String moTa;
    private double giaChoThue;
    private Date ngayBatDau;
    private Date ngayKetThuc;

    public Premises(String maMataBang, int dienTich, boolean trangThai, int tang, boolean loaiMatBang, String moTa, double giaChoThue, Date ngayBatDau, Date ngayKetThuc) {
        this.maMataBang = maMataBang;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
        this.tang = tang;
        this.loaiMatBang = loaiMatBang;
        this.moTa = moTa;
        this.giaChoThue = giaChoThue;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public double getGiaChoThue() {
        return giaChoThue;
    }

    public void setGiaChoThue(double giaChoThue) {
        this.giaChoThue = giaChoThue;
    }

    public boolean getLoaiMatBang() {
        return loaiMatBang;
    }

    public void setLoaiMatBang(boolean loaiMatBang) {
        this.loaiMatBang = loaiMatBang;
    }

    public String getMaMataBang() {
        return maMataBang;
    }

    public void setMaMataBang(String maMataBang) {
        this.maMataBang = maMataBang;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
}
