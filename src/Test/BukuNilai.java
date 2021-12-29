package Test;

public class BukuNilai {
    private String namaMtKuliah;
    
    public BukuNilai(String nama){
        namaMtKuliah = nama;
    }
    
    public void setNamaMataKuliah(String nama){
        namaMtKuliah = nama;
    }
    
    public String getNamaMataKuliah(){
        return namaMtKuliah;
    }
    
    public void tampilPesan(){
        System.out.println("Selamat Datang untuk " + getNamaMataKuliah());
    }
}
