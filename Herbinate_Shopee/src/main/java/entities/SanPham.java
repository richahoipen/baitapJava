package entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
@Entity
@Table(name = "SanPham")
@NamedQuery(name = "SanPham.findAll", query = "FROM SanPham")
public class SanPham 
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maSanPham == null) ? 0 : maSanPham.hashCode());
		result = prime * result + soSeri;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		if (maSanPham == null) {
			if (other.maSanPham != null)
				return false;
		} else if (!maSanPham.equals(other.maSanPham))
			return false;
		if (soSeri != other.soSeri)
			return false;
		return true;
	}
	/**
	 * @return the maSanPham
	 */
	public String getMaSanPham() {
		return maSanPham;
	}
	/**
	 * @param maSanPham the maSanPham to set
	 */
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	/**
	 * @return the tenSanPham
	 */
	public String getTenSanPham() {
		return tenSanPham;
	}
	/**
	 * @param tenSanPham the tenSanPham to set
	 */
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	/**
	 * @return the loaiSanPham
	 */
	public String getLoaiSanPham() {
		return loaiSanPham;
	}
	/**
	 * @param loaiSanPham the loaiSanPham to set
	 */
	public void setLoaiSanPham(String loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}
	/**
	 * @return the giaTien
	 */
	public double getGiaTien() {
		return giaTien;
	}
	/**
	 * @param giaTien the giaTien to set
	 */
	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}
	/**
	 * @return the soSeri
	 */
	public int getSoSeri() {
		return soSeri;
	}
	/**
	 * @param soSeri the soSeri to set
	 */
	public void setSoSeri(int soSeri) {
		this.soSeri = soSeri;
	}
	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	/**
	 * @return the chuShop
	 */
	public ChuShop getChuShop() {
		return chuShop;
	}
	/**
	 * @param chuShop the chuShop to set
	 */
	public void setChuShop(ChuShop chuShop) {
		this.chuShop = chuShop;
	}
	/**
	 * @return the khachHang
	 */
	public KhachHang getKhachHang() {
		return khachHang;
	}
	/**
	 * @param khachHang the khachHang to set
	 */
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	/**
	 * @return the hoaDon
	 */
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	/**
	 * @param hoaDon the hoaDon to set
	 */
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
	@Id
	@Column(name="maSanPham",length=100,nullable=false)
	private String maSanPham;
	@Column(name="tenSanPham",length=100,nullable=false)
	private String tenSanPham;
	@Column(name="loaiSanPham",length=100,nullable=false)
	private String loaiSanPham;
	@Column(name="giaTien",length=100,nullable=false)
	private double giaTien;
	@Column(name="soSeri",length=100,nullable=false)
	private int soSeri;
	@Column(name="soLuong",length=100,nullable=false)
	private int soLuong;
	//Nối bảng
	@ManyToOne
    @JoinColumn(name = "tenDangNhapChuShop")
	private ChuShop chuShop;
	@ManyToOne
    @JoinColumn(name = "tenDangNhapKhachHang")
	private KhachHang khachHang;
	@ManyToOne
    @JoinColumn(name = "maHoaDon")
	private HoaDon hoaDon;
	
	public SanPham(String maSanPham, String tenSanPham, String loaiSanPham, double giaTien, int soSeri, int soLuong) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.loaiSanPham = loaiSanPham;
		this.giaTien = giaTien;
		this.soSeri = soSeri;
		this.soLuong = soLuong;
	}
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getThanhTien()
	{
		return getGiaTien()*getSoLuong();
	}
	
}
