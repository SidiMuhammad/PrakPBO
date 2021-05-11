package tugas5;

public class PersegiPanjang implements MenghitungBidang {
    
    protected int panjang;
    protected int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double luas() {
        return panjang*lebar;
    }
    
    @Override
    public double keliling() {
        return 2*(panjang+lebar);
    }
}
