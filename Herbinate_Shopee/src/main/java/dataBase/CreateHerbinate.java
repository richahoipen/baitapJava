package dataBase;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import entities.ChuShop;
import entities.HoaDon;
import entities.SanPham;
import entities.System;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CreateHerbinate {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("shopee");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try 
		{
			//ChuShop(String tenDangNhapChuShop, String matKhau, String hoVaTen, String gioiTinh, int tuoi, String diaChi,String soDienThoai, String tenShop, String email)
			//HoaDon(String maHoaDon, String tenHoaDon, LocalDate ngayLapHoaDon, int soHoaDon)
			//KhachHang(String tenDangNhapKhachHang, String matKhau, String hoVaTen, String gioiTinh, int tuoi,String diaChi, String soDienThoai, String email)
			
			//System(String idSystem, String nameSystem, String country, String city, int numberSeri)
			
			//Khai báo System
			System s1=new System("VN1","Shopee","Vietnam","Hanoi",1);
			System s2=new System("VN2","Shop","Vietnam","HochiMinh",2);
			System s3=new System("VN3","LazShop","Vietnam","Danang",3);
			//Khai báo Chủ Shop
			ChuShop c1=new ChuShop("nam123","12345","Nguyen Van Nam","nam",34,"Long Bien","0987646636","Nam Teo","namTeo@gmail.com");
			ChuShop c2=new ChuShop("minh12","12345","Nguyen Van Minh","nam",34,"Long Thanh","0957646636","Minh Shop","minhVan@gmail.com");
			ChuShop c3=new ChuShop("ngoc12","12345","Hoang Ngoc","nu",33,"Ha Thanh","0757646636","HN Shop","ngoc@gmail.com");
			ChuShop c4=new ChuShop("bao123","12345","Bao Nam","nam",35,"Ho Chi Minh","0987646656","Nam Bao","baoTeo@gmail.com");
			ChuShop c5=new ChuShop("thu12","12345","Nguyen Ngoc Thu","nu",34,"Cau Giay","0357646636","Thu Cuoi","thu097@gmail.com");
			ChuShop c6=new ChuShop("an345","12345","Hoang An","nam",43,"Ha Tay","0557646636","An Nam Shop","anDaiCa@gmail.com");
			//Thêm chủ shop vào hệ thống
			s1.getListChuShop().add(c1);
			s1.getListChuShop().add(c2);
			s2.getListChuShop().add(c3);
			s2.getListChuShop().add(c4);
			s3.getListChuShop().add(c5);
			s3.getListChuShop().add(c6);
			//Khai báo hoá đơn
			HoaDon h1=new HoaDon("001","Lego",LocalDate.of(2023,5,7),1);
			HoaDon h2=new HoaDon("002","Gun",LocalDate.of(2023,4,6),2);
			HoaDon h4=new HoaDon("004","Phone",LocalDate.of(2023,4,7),4);
			HoaDon h5=new HoaDon("005","Bag",LocalDate.of(2023,2,6),5);
			HoaDon h6=new HoaDon("006","Yugioh",LocalDate.of(2023,4,7),6);
			//Thêm hoá đơn cho chủ shop
			c1.getListHoaDon().add(h1);
			c1.getListHoaDon().add(h2);
			c2.getListHoaDon().add(h4);
			c3.getListHoaDon().add(h5);
			c3.getListHoaDon().add(h6);
			//Khai báo sản phẩm 20 sản phẩm
			//SanPham(String maSanPham, String tenSanPham, String loaiSanPham, double giaTien, int soSeri, int soLuong)
			SanPham sp1= new SanPham("Lego1","Ship Kai","Lego", 10000000,123,4);
			SanPham sp2= new SanPham("Lego2","Car Kai","Lego", 20000000,423,3);
			SanPham sp3=new SanPham("Lego3","Bike Nya","Lego",300000000,457,2);
			SanPham sp4=new SanPham("Bag1","Black Bag","Bag",10000000,23454,10);
			SanPham sp5=new SanPham("Bag2","Gucci","Bag",100000000,235678,100);
			SanPham sp6=new SanPham("Yugioh1","Pot of greed","Card",200000,102938,100);
			SanPham sp7=new SanPham("Yugioh2","Solemn Strike","Card",21000,9876,20);
			SanPham sp8=new SanPham("Yugioh3","Card destruction","Card",10000,23453,200);
			SanPham sp9=new SanPham("Phone1","Iphone 14","Smart Phone",100231,2122,20);
			SanPham sp10=new SanPham("Phone2","Iphone 12","Smart Phone",2000032,2341,20);
			SanPham sp11= new SanPham("Lego6","Car Cole","Lego", 20000000,124,4);
			SanPham sp12= new SanPham("Lego4","Car Zane","Lego", 20000000,433,3);
			SanPham sp13=new SanPham("Lego5","Bike Lloyed","Lego",300000000,557,4);
			SanPham sp14=new SanPham("Bag3","Red Bag","Bag",10000000,23444,10);
			SanPham sp15=new SanPham("Bag4","Gray Bag","Bag",100000000,235688,100);
			SanPham sp16=new SanPham("Yugioh4","Pot of derise","Card",200000,102978,100);
			SanPham sp17=new SanPham("Yugioh5","Sky Striker","Card",21000,5876,20);
			SanPham sp18=new SanPham("Yugioh6","Hand destruction","Card",10000,73453,200);
			SanPham sp19=new SanPham("Phone3","Iphone 14","Smart Phone",100251,122,20);
			SanPham sp20=new SanPham("Phone4","Iphone 12","Smart Phone",2000032,341,20);
			//Them sản phẩm cho hoá đơn.
			h1.getListSanPham().add(sp1);
			h1.getListSanPham().add(sp2);
			h1.getListSanPham().add(sp11);
			h1.getListSanPham().add(sp12);
			
			h4.getListSanPham().add(sp9);
			h4.getListSanPham().add(sp10);
			h4.getListSanPham().add(sp19);
			h4.getListSanPham().add(sp20);
				
			
			//Thêm sản phẩm cho chủ shop;
			c1.getListSanPham().add(sp1);
			c1.getListSanPham().add(sp2);
			c1.getListSanPham().add(sp3);
			c1.getListSanPham().add(sp4);
			c1.getListSanPham().add(sp5);
			c1.getListSanPham().add(sp6);
			c1.getListSanPham().add(sp7);
			c1.getListSanPham().add(sp8);
			c1.getListSanPham().add(sp9);
			c1.getListSanPham().add(sp10);
			//
			c2.getListSanPham().add(sp1);
			c2.getListSanPham().add(sp2);
			c2.getListSanPham().add(sp3);
			c2.getListSanPham().add(sp4);
			c2.getListSanPham().add(sp5);
			c2.getListSanPham().add(sp6);
			c2.getListSanPham().add(sp7);
			c2.getListSanPham().add(sp8);
			c2.getListSanPham().add(sp9);
			c2.getListSanPham().add(sp10);
			//
			c3.getListSanPham().add(sp1);
			c3.getListSanPham().add(sp2);
			c3.getListSanPham().add(sp3);
			c3.getListSanPham().add(sp4);
			c3.getListSanPham().add(sp5);
			c3.getListSanPham().add(sp6);
			c3.getListSanPham().add(sp7);
			c3.getListSanPham().add(sp8);
			c3.getListSanPham().add(sp9);
			c3.getListSanPham().add(sp10);
			//
			c4.getListSanPham().add(sp1);
			c4.getListSanPham().add(sp2);
			c4.getListSanPham().add(sp3);
			c4.getListSanPham().add(sp4);
			c4.getListSanPham().add(sp5);
			c4.getListSanPham().add(sp6);
			c4.getListSanPham().add(sp7);
			c4.getListSanPham().add(sp8);
			c4.getListSanPham().add(sp9);
			c4.getListSanPham().add(sp10);
			//
			c5.getListSanPham().add(sp11);
			c5.getListSanPham().add(sp12);
			c5.getListSanPham().add(sp13);
			c5.getListSanPham().add(sp14);
			c5.getListSanPham().add(sp15);
			c5.getListSanPham().add(sp16);
			c5.getListSanPham().add(sp17);
			c5.getListSanPham().add(sp18);
			c5.getListSanPham().add(sp19);
			c5.getListSanPham().add(sp20);
			//
			c6.getListSanPham().add(sp11);
			c6.getListSanPham().add(sp12);
			c6.getListSanPham().add(sp13);
			c6.getListSanPham().add(sp14);
			c6.getListSanPham().add(sp15);
			c6.getListSanPham().add(sp16);
			c6.getListSanPham().add(sp17);
			c6.getListSanPham().add(sp18);
			c6.getListSanPham().add(sp19);
			c6.getListSanPham().add(sp20);
			
			
			em.merge(s1);
			em.merge(s2);
			em.merge(s3);
			
			JOptionPane.showMessageDialog(null, "Thành công.");
			
			
			
			

			em.getTransaction().commit();
			em.close();
			emf.close();
		} catch (Exception e) 
		{
			em.getTransaction().rollback();
		} finally 
		{
			em.close();
			emf.close();
		}

	}

}
