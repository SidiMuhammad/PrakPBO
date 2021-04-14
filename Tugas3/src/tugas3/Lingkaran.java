package tugas3;

public class Lingkaran implements MenghitungBidang{
    
    protected int jari;

    public Lingkaran(int jari) {
        this.jari = jari;
    }

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }
    
    @Override
    public double luas() {
        return Math.PI*jari*jari;
    }
    
    @Override
    public double keliling() {
        return Math.PI*2*jari;
    }
}
