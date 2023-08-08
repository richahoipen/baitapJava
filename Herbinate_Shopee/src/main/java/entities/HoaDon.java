package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "HoaDon")
@NamedQuery(name = "HoaDon.findAll", query = "FROM HoaDon")
public class HoaDon 
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHoaDon == null) ? 0 : maHoaDon.hashCode());
		result = prime * result + soHoaDon;
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
		HoaDon other = (HoaDon) obj;
		if (maHoaDon == null) {
			if (other.maHoaDon != null)
				return false;
		} else if (!maHoaDon.equals(other.maHoaDon))
			return false;
		if (soHoaDon != other.soHoaDon)
			return false;
		return true;
	}
	/**
	 * @return the maHoaDon
	 */
	public String getMaHoaDon() {
		return maHoaDon;
	}
	/**
	 * @param maHoaDon the maHoaDon to set
	 */
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	/**
	 * @return the tenHoaDon
	 */
	public String getTenHoaDon() {
		return tenHoaDon;
	}
	/**
	 * @param tenHoaDon the tenHoaDon to set
	 */
	public void setTenHoaDon(String tenHoaDon) {
		this.tenHoaDon = tenHoaDon;
	}
	/**
	 * @return the ngayLapHoaDon
	 */
	public LocalDate getNgayLapHoaDon() {
		return ngayLapHoaDon;
	}
	/**
	 * @param ngayLapHoaDon the ngayLapHoaDon to set
	 */
	public void setNgayLapHoaDon(LocalDate ngayLapHoaDon) {
		this.ngayLapHoaDon = ngayLapHoaDon;
	}
	/**
	 * @return the soHoaDon
	 */
	public int getSoHoaDon() {
		return soHoaDon;
	}
	/**
	 * @param soHoaDon the soHoaDon to set
	 */
	public void setSoHoaDon(int soHoaDon) {
		this.soHoaDon = soHoaDon;
	}
	/**
	 * @return the listSanPham
	 */
	public List<SanPham> getListSanPham() {
		return listSanPham;
	}
	/**
	 * @param listSanPham the listSanPham to set
	 */
	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
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
	@Id
	@Column(name="maHoaDon",length=100,nullable=false)
	private String maHoaDon;
	@Column(name="tenHoaDon",length=100,nullable=false)
	private String tenHoaDon;
	@Column(name="ngayLapHoaDon",length=100,nullable=false)
	private LocalDate ngayLapHoaDon;
	@Column(name="soHoaDon",length=100,nullable=false)
	private int soHoaDon;	
	//Nối bảng
	@OneToMany(mappedBy = "maSanPham", cascade = CascadeType.ALL)
	private List<SanPham> listSanPham = new ArrayList<>();
	@ManyToOne
    @JoinColumn(name = "tenDangNhapChuShop")
	private ChuShop chuShop;
	@ManyToOne
    @JoinColumn(name = "tenDangNhapKhachHang")
	private KhachHang khachHang;
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon(String maHoaDon, String tenHoaDon, LocalDate ngayLapHoaDon, int soHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
		this.tenHoaDon = tenHoaDon;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.soHoaDon = soHoaDon;
	}
	
}
