package kuisPBO;

public class Web implements Seleksi{
    protected int nilaiTulis;
    protected int nilaiCoding;
    protected int nilaiWawancara;
    
    public Web(int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }

    public int getNilaiTulis() {
        return nilaiTulis;
    }

    public void setNilaiTulis(int nilaiTulis) {
        this.nilaiTulis = nilaiTulis;
    }

    public int getNilaiCoding() {
        return nilaiCoding;
    }

    public void setNilaiCoding(int nilaiCoding) {
        this.nilaiCoding = nilaiCoding;
    }

    public int getNilaiWawancara() {
        return nilaiWawancara;
    }

    public void setNilaiWawancara(int nilaiWawancara) {
        this.nilaiWawancara = nilaiWawancara;
    }
    
    @Override
    public double nilaiAkhir() {
        return nilaiTulis*0.4+nilaiCoding*0.35+nilaiWawancara*0.25;
    }
}