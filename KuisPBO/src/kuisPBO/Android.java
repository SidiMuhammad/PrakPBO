package kuisPBO;

public class Android implements Seleksi{
    protected int nilaiTulis;
    protected int nilaiCoding;
    protected int nilaiWawancara;
    
    public Android(int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
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
        return nilaiTulis*0.2+nilaiCoding*0.5+nilaiWawancara*0.3;
    }
}
