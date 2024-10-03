package com.example.thi_cuoi_m3.service;

import com.example.thi_cuoi_m3.common.BaseRepository;
import com.example.thi_cuoi_m3.model.Premises;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PremisesServiceImpl implements PremisesService{
    private static BaseRepository baseRepository;
    {
        try {
            baseRepository = new BaseRepository();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private static final String FIND_ALL = "SELECT * FROM matbang";

    @Override
    public List<Premises> findAll() {
        Connection connection = baseRepository.getConnection();
        List<Premises> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL);
            ResultSet result = preparedStatement.executeQuery();
            list = toList(result);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return list;
    }

    private List<Premises> toList(ResultSet result) throws SQLException {
        List<Premises> list = new ArrayList<>();
        while(result.next()) {
            String ma = result.getString("MaMatBang");
            int dienTich = result.getInt("DienTich");
            boolean trangThai = result.getBoolean("TrangThai");
            int tang = result.getInt("Tang");
            boolean loai = result.getBoolean("LoaiVanPhong");
            String moTa = result.getString("MoTaChiTiet");
            float gia = result.getFloat("GiaChoThue");
            Date daystart = result.getDate("NgayBatDau");
            Date dayend = result.getDate("NgayKetThuc");
            list.add(new Premises (ma,dienTich,trangThai,tang,loai,moTa,gia,daystart,dayend));
        }
        return list;
    }
}
