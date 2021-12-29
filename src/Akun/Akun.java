package Akun;

public class Akun {
    private double saldo;
    
    public Akun (double saldoAwal){
        if (saldoAwal > 0.0) {
            saldo = saldoAwal;
        }
    }
    
    public void kredit (double jumlah){
        saldo = saldo + jumlah;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
