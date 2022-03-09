package model;

public class Train extends Transport {
	private int soToa;
	
	public Train(float giaVe, int soGhe) {
		super(giaVe, soGhe);
	}

	public int getSoToa() {
		return soToa;
	}

	public void setSoToa(int soToa) {
		this.soToa = soToa;
	}

	

}
