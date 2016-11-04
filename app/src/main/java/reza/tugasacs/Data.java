package reza.tugasacs;

/**
 * Created by Reza on 13/10/2016.
 */
public class Data {
    protected int jumlahNG;
    protected int jumlahMG;
    protected int jumlahMR;
    protected int jumlahK;
    protected long totalBayar;
    protected long hargaNG = 12000;
    protected long hargaMG = 10000;
    protected long hargaMR = 11000;
    protected long hargaK = 14000;

    public int getJumlahNG() {
        return jumlahNG;
    }

    public void setJumlahNG(int jumlahNG) {
        this.jumlahNG = jumlahNG;
    }

    public int getJumlahMG() {
        return jumlahMG;
    }

    public void setJumlahMG(int jumlahMG) {
        this.jumlahMG = jumlahMG;
    }

    public int getJumlahMR() {
        return jumlahMR;
    }

    public void setJumlahMR(int jumlahMR) {
        this.jumlahMR = jumlahMR;
    }

    public int getJumlahK() {
        return jumlahK;
    }

    public void setJumlahK(int jumlahK) {
        this.jumlahK = jumlahK;
    }

    public long getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar() {
        this.totalBayar = ((jumlahNG*hargaNG)+(jumlahMG*hargaMG)+(jumlahMR*hargaMR)+(jumlahK*hargaK));
    }

    public String getTeksTotalBayar() {
        String teks;
        teks = String.valueOf(this.totalBayar);
        return teks;
    }
}
