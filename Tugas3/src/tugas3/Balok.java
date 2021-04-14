package tugas3;

public class Balok extends PersegiPanjang implements MenghitungRuang {

    protected int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        return panjang*lebar*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }
    
}
