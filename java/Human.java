class Human{
    private String nik;
    private String nama;
    private char gender;

    public Human(){
        this.nama = "";
        this.nik = "";
        this.gender = '-';
    }
    public Human(String nama, String nik, char gender){
        this.nama = nama;
        this.nik = nik;
        this.gender = gender;
    }

    public String getNik(){
        return this.nik;
    }
    public String getNama(){
        return this.nama;
    }
    public char getGender(){
        return this.gender;
    }

    public void setNik(String nik){
        this.nik = nik;
    }
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public void life(){
        System.out.println(this.nama + " Sudah hidup");
    }
}
class Mahasiswa extends Human{
    private String nim;
    private String fakultas;
    private String prodi;

    public Mahasiswa(){
        this.nim = "";
        this.fakultas = "";
        this.prodi = "";
    }
    public Mahasiswa(String nik, String nama, char gender,String nim, String fakultas, String prodi){
        setNama(nama);
        setNik(nik);
        setGender(gender);
        this.nim = nim;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }

    public String getNim(){
        return this.nim;
    }
    public String getFakultas(){
        return this.fakultas;
    }
    public String getProdi(){
        return this.prodi;
    }

    public void setNim(String nim){
        this.nim = nim;
    }
    public void setFakultas(String fakultas)
    {
        this.fakultas = fakultas;
    }
    public void setProdi(String prodi)
    {
        this.prodi = prodi;
    }

    public void mhs()
    {
        System.out.println(getNama() + "Sudah jd mahasiswa");
    }
}
class Univ extends Mahasiswa{
    private String kampus;
    private String email;

    public Univ(){
        this.kampus = "";
        this.email = "";
    }
    public Univ(String nim, String prodi, String fakultas, String kampus, String email){
        setNim(nim);
        setProdi(prodi);
        setFakultas(fakultas);
        this.kampus = kampus;
        this.email = email;
    }

    public String getKampus(){
        return this.kampus;
    }
    public String getEmail(){
        return this.email;
    }

    public void setKampus (String kampus)
    {
        this.kampus = kampus;
    }
    public void setEmail (String email)
    {
        this.email = email;
    }

    public void universitas()
    {
        System.out.println(getNim() + "Sudah jd mahasiswa di " + getKampus());
    }
}