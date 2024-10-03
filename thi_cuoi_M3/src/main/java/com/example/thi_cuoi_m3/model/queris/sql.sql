CREATE DATABASE quanlymatbang;
USE quanlymatbang;

CREATE TABLE matbang (
    MaMatBang CHAR(7) ,
    DienTich Int ,
    TrangThai bit,
    Tang INT,
    LoaiVanPhong bit,
    MoTaChiTiet varchar(50),
    GiaChoThue DECIMAL,
    NgayBatDau DATE,
    NgayKetThuc DATE,
    PRIMARY KEY (MaMatBang)
);

INSERT INTO matbang (MaMatBang, DienTich, TrangThai, Tang, LoaiVanPhong, MoTaChiTiet, GiaChoThue, NgayBatDau, NgayKetThuc) VALUES
('MB001', 50, 1, 3, 0, 'Văn phòng hiện đại', 1500.00, '2024-01-01', '2024-12-31'),
('MB002', 70, 0, 5, 1, 'Văn phòng sang trọng', 2500.00, '2024-02-01', '2024-11-30'),
('MB003', 40, 1, 2, 0, 'Văn phòng nhỏ gọn', 1200.00, '2024-03-01', '2024-10-31');