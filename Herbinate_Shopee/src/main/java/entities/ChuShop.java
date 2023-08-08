package entities;

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
@Table(name = "ChuShop")
@NamedQuery(name = "ChuShop.findAll", query = "FROM ChuShop")
public class ChuShop 
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((soDienThoai == null) ? 0 : soDienThoai.hashCode());
		result = prime * result + ((tenDangNhapChuShop == null) ? 0 : tenDangNhapChuShop.hashCode());
		result = prime * result + ((tenShop == null) ? 0 : tenShop.hashCode());
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
		ChuShop other = (ChuShop) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (soDienThoai == null) {
			if (other.soDienThoai != null)
				return false;
		} else if (!soDienThoai.equals(other.soDienThoai))
			return false;
		if (tenDangNhapChuShop == null) {
			if (other.tenDangNhapChuShop != null)
				return false;
		} else if (!tenDangNhapChuShop.equals(other.tenDangNhapChuShop))
			return false;
		if (tenShop == null) {
			if (other.tenShop != null)
				return false;
		} else if (!tenShop.equals(other.tenShop))
			return false;
		return true;
	}
	/**
	 * @return the tenDangNhapChuShop
	 */
	public String getTenDangNhapChuShop() {
		return tenDangNhapChuShop;
	}
	/**
	 * @param tenDangNhapChuShop the tenDangNhapChuShop to set
	 */
	public void setTenDangNhapChuShop(String tenDangNhapChuShop) {
		this.tenDangNhapChuShop = tenDangNhapChuShop;
	}
	/**
	 * @return the matKhau
	 */
	public String getMatKhau() {
		return matKhau;
	}
	/**
	 * @param matKhau the matKhau to set
	 */
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	/**
	 * @return the hoVaTen
	 */
	public String getHoVaTen() {
		return hoVaTen;
	}
	/**
	 * @param hoVaTen the hoVaTen to set
	 */
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}
	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	/**
	 * @return the tuoi
	 */
	public int getTuoi() {
		return tuoi;
	}
	/**
	 * @param tuoi the tuoi to set
	 */
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	/**
	 * @return the diaChi
	 */
	public String getDiaChi() {
		return diaChi;
	}
	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}
	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	/**
	 * @return the tenShop
	 */
	public String getTenShop() {
		return tenShop;
	}
	/**
	 * @param tenShop the tenShop to set
	 */
	public void setTenShop(String tenShop) {
		this.tenShop = tenShop;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the listHoaDon
	 */
	public List<HoaDon> getListHoaDon() {
		return listHoaDon;
	}
	/**
	 * @param listHoaDon the listHoaDon to set
	 */
	public void setListHoaDon(List<HoaDon> listHoaDon) {
		this.listHoaDon = listHoaDon;
	}
	/**
	 * @return the system
	 */
	public System getSystem() {
		return system;
	}
	/**
	 * @param system the system to set
	 */
	public void setSystem(System system) {
		this.system = system;
	}
	@Id
	@Column(name="tenDangNhapChuShop",length=100,nullable=false)
	private String tenDangNhapChuShop;
	@Column(name="matKhau",length=100,nullable=false)
	private String matKhau;
	@Column(name="hoVaTen",length=100,nullable=false)
	private String hoVaTen;
	@Column(name="gioiTinh",length=100,nullable=false)
	private String gioiTinh;
	@Column(name="tuoi",length=100,nullable=false)
	private int tuoi;
	@Column(name="diaChi",length=100,nullable=false)
	private String diaChi;
	@Column(name="soDienThoai",length=100,nullable=false)
	private String soDienThoai;
	@Column(name="tenShop",length=100,nullable=false)
	private String tenShop;
	@Column(name="email",length=100,nullable=false)
	private String email;
	//Nối bảng
	@OneToMany(mappedBy = "maSanPham", cascade = CascadeType.ALL)
	private List<SanPham> listSanPham = new ArrayList<>();
	@OneToMany(mappedBy = "maHoaDon", cascade = CascadeType.ALL)
	private List<HoaDon> listHoaDon = new ArrayList<>();
	@ManyToOne
    @JoinColumn(name = "idSystem")
	private System system;
	public ChuShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChuShop(String tenDangNhapChuShop, String matKhau, String hoVaTen, String gioiTinh, int tuoi, String diaChi,
			String soDienThoai, String tenShop, String email) {
		super();
		this.tenDangNhapChuShop = tenDangNhapChuShop;
		this.matKhau = matKhau;
		this.hoVaTen = hoVaTen;
		this.gioiTinh = gioiTinh;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.tenShop = tenShop;
		this.email = email;
	}
	
}
