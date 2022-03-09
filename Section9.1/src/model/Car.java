package model;

public class Car extends Transport{
	private String loaiXe;

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public Car(float giaVe, int soGhe) {
		super(giaVe, soGhe);
	}

}
