CREATE DATABASE dbLibrary
USE dbLibrary


GO
CREATE TABLE THUTHU
(
	MATT CHAR(10) NOT NULL PRIMARY KEY,
	MATKHAU CHAR(15) NOT NULL,
	HOTEN NVARCHAR(50),
	GIOITINH NCHAR(3),
	NGAYSINH DATE,
	SDT INT,
	EMAIL NVARCHAR(50),
	DIACHI NVARCHAR(50)
)

GO
CREATE TABLE DOCGIA
(
	MADG CHAR(10) NOT NULL PRIMARY KEY,
	MATKHAU CHAR(15) NOT NULL,
	TENDG NVARCHAR(50),
	GIOITINH NCHAR(3),
	DIACHI NVARCHAR(50),
	NGAYBD DATE NOT NULL,
	NGAYKT DATE NOT NULL,
	PHICOC MONEY
)

GO
CREATE TABLE SACH
(
	MASH CHAR(10) NOT NULL PRIMARY KEY,
	TENSH NVARCHAR(50),
	TENTG NVARCHAR(50),
	SOLUONG INT,
	NGAYNHAPSACH DATE,
	THELOAI NVARCHAR(50),
	NXB NVARCHAR(50),
	NAMXB CHAR(4),
	PHIDENBU MONEY,
	TINHTRANG NVARCHAR(50)
)

GO
CREATE TABLE MUONTRA
(
	MAMT CHAR(10) NOT NULL,
	MADG CHAR(10) NOT NULL,
	MATT CHAR(10) NOT NULL,
	MASH CHAR(10) NOT NULL,
	NGAYMUON DATE,
	NGAYTRADUKIEN DATE,
	NGAYTRATHUCTE DATE
)

ALTER TABLE MUONTRA
ADD  PRIMARY KEY (MAMT)


ALTER TABLE MUONTRA
ADD  CONSTRAINT FK_MT_SACH FOREIGN KEY(MADG)REFERENCES DOCGIA(MADG)

ALTER TABLE MUONTRA
ADD  CONSTRAINT FK_MT_NV FOREIGN KEY(MATT)REFERENCES THUTHU(MATT)

ALTER TABLE MUONTRA
ADD  CONSTRAINT FK_MT_SH FOREIGN KEY(MASH)REFERENCES SACH(MASH)


SET DATEFORMAT DMY

INSERT INTO THUTHU
VALUES ('TT001','THANHTRUNG',N'NGUYỄN THÀNH TRUNG',N'NAM','10/04/1987','0915481325','NGUYENTHANHTRUNG@GMAIL.COM',N'5 NGUYỄN SÁNG- TÂY THẠNH- TÂN PHÚ'),
('TT002','THANHTHANH',N'NGUYỄN THANH THANH',N'NỮ','10/03/1975','0354861746','NGUYENTHANHTHANH@GMAIL.COM',N'152 NGUYỄN HUỆ- QUẬN 1'),
('TT003','QUANGVU',N'ĐẶNG QUANG VŨ',N'NAM','17/10/1995','034865267','DANGQUANVU@GMAIL.COM',N'364 NGUYỄN CỪ- QUẬN 3')




INSERT INTO DOCGIA
VALUES('DG001','NGOCDUNG',N'PHAN THI NGOC DUNG',N'NỮ',N'2 NGUYỄN SÁNG-PHÚ NHUẬN','10/02/2019','10/02/2020',300000),
('DG002','VANTHIEN',N'NGUYỄN VĂN THIÊN',N'NAM',N'100 CMT8-TÂN PHÚ','15/10/2019','20/08/2020',300000),
('DG003','PHIDUNG',N'LÝ HOÀNG PHI DŨNG',N'NAM',N'32 NGUYỄN SÁNG-TÂN PHÚ','30/12/2018','17/05/2019',300000),
('DG004','THIVI',N'PHẠM THỊ VI',N'NỮ',N'25 LÊ LỢI-TÂN BÌNH','19/12/2020','13/05/2021',300000),
('DG005','LUONGDONG',N'NGUYỄN LƯƠNG ĐÔNG',N'NAM',N'12 NGUYỄN HUỆ-QUẬN 1','26/11/2020','30/07/2021',300000)



INSERT INTO SACH
VALUES('SH001',N'CHẾ TẠO ROBOT',N'A.ĐÔIARENCÔ',15,'16/02/2016',N'KHOA HỌC',N'BÁCH KHOA HÀ NỘI','2010',50000,N'ĐANG MƯỢN'),
('SH002',N'NÔNG HỌC VUI',N'HỘI KHKT LÂM NGHIỆP VIỆT NAM',25,'13/09/2015',N'KHOA HỌC',N'THANH NIÊN','2013',100000,N'ĐANG MƯỢN'),
('SH003',N'ENLIGH',N'ĐẶNG VĂN HẢO',34,'23/11/2017',N'GIÁO KHOA',N'GIÁO DỤC VÀ ĐÀO TẠO','2012',45000,N'KHÔNG MƯỢN'),
('SH004',N'CHÚ VOI BIẾT NÓI',N'NUYỄN XUÂN THÀNH',26,'13/10/1999',N'TRUYỆN TRANH',N'GIÁO DỤC VÀ ĐÀO TẠO',15000,'2014',N'KHÔNG MƯỢN')


INSERT INTO MUONTRA
VALUES('MT001','DG002','TT002','SH001','10/05/2019','11/06/2019','12/06/2019'),
('MT002','DG001','TT002','SH001','25/07/2019','5/01/2020','15/01/2020'),
('MT003','DG002','TT001','SH002','1/05/2020','21/05/2020','21/05/2020'),
('MT004','DG004','TT002','SH003','18/01/2018','30/05/2019','05/06/2019'),
('MT005','DG003','TT001','SH003','12/1/2020','25/07/2020','20/07/2020')



SELECT*FROM THUTHU
SELECT*FROM SACH
SELECT*FROM MUONTRA
SELECT*FROM DOCGIA

--TUỔI THỦ THƯ TỪ 18 TRỞ LÊN

create trigger KT_TUOI
on THUTHU
after insert
as
 begin
 declare @tuoi_tt int
 set @tuoi_tt = ( select year(getdate())-year(NGAYSINH) from inserted)
 if (@tuoi_tt < 18)
     begin 
            PRINT N'CHƯA ĐỦ 18 TUỔI'
     end
end
go

--KIỂM TRA SINH VIÊN ĐÃ ĐĂNG KÝ THẺ CHƯA

create trigger TG_NGAYBD_NGAYMT
on MUONTRA
after insert
as
 begin
 if (SELECT NGAYMUON FROM INSERTED) < (SELECT NGAYBD FROM DOCGIA WHERE MADG =(SELECT MADG FROM INSERTED))
     begin 
            PRINT N'PHẢI ĐĂNG KÝ TRƯỚC KHI MƯỢN'
     end
end
go

-- trigger update tình trạng sách -- 
create trigger update_tinhtrang
on sach
for insert, update
as
begin
	if(select ngaytrathucte from muontra)=null
	begin
		update sach
		set TINHTRANG=N'ĐANG MƯỢN'
		where (select MASH from inserted)=sach.MASH
	end
	else
	begin
		update sach
		set TINHTRANG=N'KHÔNG MƯỢN'
		where (select MASH from inserted)=sach.MASH
	end
end
-- Tống số đọc giả --
create proc tongsodocgia @so int output
with recompile
as
begin
	select @so = count(MADG) from docgia
end

declare @so int
exec tongsodocgia @so output
select @so

-- trigger update phí cọc --
create trigger update_phicoc
on docgia
for insert, update
as
begin
	if(select phicoc from inserted)=null
	begin
		update DOCGIA
		set PHICOC=300000
		where docgia.MADG=(select madg from inserted)
	end
end

-- Tổng số sách --
go
create proc tongsosach @so int output
with recompile
as
begin
	select @so=count(*)
	from SACH
end
declare @so int
exec tongsosach @so output
select @so
-- Tổng Phiếu mượn --
go
create proc tongsophieumuon @so int output
with recompile
as
begin
	select @so=count(*)
	from MUONTRA
end
-- Tổng số sách đã mượn --
go
create proc tongsosachdamuon @so int output
with recompile
as
begin
	select @so=count(*)
	from sach
	where TINHTRANG=N'ĐANG MƯỢN'
end

-- Tổng số sách còn lại --
go 
create proc tongsosachconlai @so int output
with recompile
as
begin
	select @so=count(*)
	from sach
	where TINHTRANG=N'KHÔNG MƯỢN'
end
-- Tổng số phiếu quá hạn --
alter proc tongsophieuquahan @so int output
with recompile
as
begin
	select @so=count(*)
	from MUONTRA
	where NGAYTRATHUCTE IS NULL
end

declare @so int
exec tongsophieuquahan @so output
select @so

-- tim kiem gan dung doc gia
create proc timkiemDG @dg nvarchar(50) 
as
	select * from DOCGIA where MADG  like N'%'+ @dg + '%' OR TENDG  like N'%'+ @dg + '%'

-- tim kiem gan dung thu thu
create proc timkiemTT @tt nvarchar(50) 
as
	select * from THUTHU where MATT  like N'%'+ @tt + '%' OR HOTEN  like N'%'+ @tt + '%'

-- tim kiem gan dung sách
create proc timkiemSH @sh nvarchar(50) 
as
	select * from SACH where MASH  like N'%'+ @sh + '%' OR TENSH  like N'%'+ @sh + '%'

-- tim kiem gan dung mượn trả
create proc timkiemMT @mt nvarchar(50) 
as
	select * from MUONTRA where MAMT  like N'%'+ @mt + '%' OR MADG  like N'%'+ @mt + '%' OR MATT  like N'%'+ @mt + '%'
