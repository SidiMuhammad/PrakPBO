package tugas3;

public class Kerucut extends Lingkaran implements MenghitungRuang {

    protected int tinggi;

    public Kerucut(int jari, int tinggi) {
        super(jari);
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
        return Math.PI*jari*jari*tinggi/3;
    }

    @Override
    public double luasPermukaan() {
        return Math.PI*jari*(jari+Math.sqrt(jari*jari+tinggi*tinggi));
    }
    
}
