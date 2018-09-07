
public class Mahasiswa {
	String nama;
	int npm;
	String universitas;
	int umur;
	int semester;
	String angkatan;
	
	public Mahasiswa(String nama, int npm, String universitas, int umur, int semester, String angkatan) {
		super();
		this.nama = nama;
		this.npm = npm;
		this.universitas = universitas;
		this.umur = umur;
		this.semester = semester;
		this.angkatan = angkatan;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getNpm() {
		return npm;
	}
	public void setNpm(int npm) {
		this.npm = npm;
	}
	public String getUniversitas() {
		return universitas;
	}
	public void setUniversitas(String universitas) {
		this.universitas = universitas;
	}
	public int getUmur() {
		return umur;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getAngkatan() {
		return angkatan;
	}
	public void setAngkatan(String angkatan) {
		this.angkatan = angkatan;
	}
}
