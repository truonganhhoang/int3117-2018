package demo;

public class PhanSo {
	private int tuSo;
	private int mauSo;

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	public PhanSo() {
	}

	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	public PhanSo add(PhanSo ps) {
		PhanSo result = new PhanSo();
		result.setTuSo(getTuSo() * ps.getMauSo() + getMauSo() * ps.getTuSo());
		result.setMauSo(getMauSo() * ps.getMauSo());
		return result;
	}

	public PhanSo minus(PhanSo ps) {
		PhanSo result = new PhanSo();
		result.setTuSo(getTuSo() * ps.getMauSo() - getMauSo() * ps.getTuSo());
		result.setMauSo(getMauSo() * ps.getMauSo());
		return result;
	}
	
	public String toString() {
		return getTuSo() + "/" + getMauSo();
	}
}
