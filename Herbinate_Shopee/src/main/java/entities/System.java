package entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "System")
@NamedQuery(name = "System.findAll", query = "FROM System")
public class System 
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSystem == null) ? 0 : idSystem.hashCode());
		result = prime * result + numberSeri;
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
		System other = (System) obj;
		if (idSystem == null) {
			if (other.idSystem != null)
				return false;
		} else if (!idSystem.equals(other.idSystem))
			return false;
		if (numberSeri != other.numberSeri)
			return false;
		return true;
	}
	/**
	 * @return the idSystem
	 */
	public String getIdSystem() {
		return idSystem;
	}
	/**
	 * @param idSystem the idSystem to set
	 */
	public void setIdSystem(String idSystem) {
		this.idSystem = idSystem;
	}
	/**
	 * @return the nameSystem
	 */
	public String getNameSystem() {
		return nameSystem;
	}
	/**
	 * @param nameSystem the nameSystem to set
	 */
	public void setNameSystem(String nameSystem) {
		this.nameSystem = nameSystem;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the numberSeri
	 */
	public int getNumberSeri() {
		return numberSeri;
	}
	/**
	 * @param numberSeri the numberSeri to set
	 */
	public void setNumberSeri(int numberSeri) {
		this.numberSeri = numberSeri;
	}
	/**
	 * @return the listChuShop
	 */
	public List<ChuShop> getListChuShop() {
		return listChuShop;
	}
	/**
	 * @param listChuShop the listChuShop to set
	 */
	public void setListChuShop(List<ChuShop> listChuShop) {
		this.listChuShop = listChuShop;
	}
	/**
	 * @return the listKhachHang
	 */
	public List<KhachHang> getListKhachHang() {
		return listKhachHang;
	}
	/**
	 * @param listKhachHang the listKhachHang to set
	 */
	public void setListKhachHang(List<KhachHang> listKhachHang) {
		this.listKhachHang = listKhachHang;
	}
	@Id
	@Column(name="idSystem",length=100,nullable=false)
	private String idSystem;
	@Column(name="nameSystem",length=100,nullable=false)
	private String nameSystem;
	@Column(name="country",length=100,nullable=false)
	private String country;
	@Column(name="city",length=100,nullable=false)
	private String city;
	@Column(name="numberSeri",length=100,nullable=false)
	private int numberSeri;
	//Nối bảng
	@OneToMany(mappedBy = "tenDangNhapChuShop", cascade = CascadeType.ALL)
	private List<ChuShop> listChuShop=new ArrayList<>();
	@OneToMany(mappedBy = "tenDangNhapKhachHang", cascade = CascadeType.ALL)
	private List<KhachHang> listKhachHang=new ArrayList<>();
	public System(String idSystem, String nameSystem, String country, String city, int numberSeri) {
		super();
		this.idSystem = idSystem;
		this.nameSystem = nameSystem;
		this.country = country;
		this.city = city;
		this.numberSeri = numberSeri;
	}
	public System() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
