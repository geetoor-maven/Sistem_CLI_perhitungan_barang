
package Final_sls;


public class Array {
   
    private Integer kode_barang;
    private String nama_barang;
    private String lempar_jenis;
    private Integer jenis_barang;
    private Integer stok_barang;
    private Integer harga_barang;

    public Array(Integer kode_barang, String nama_barang,String lempar_jenis, Integer jenis_barang, Integer stok_barang, Integer harga_barang) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.lempar_jenis = lempar_jenis;
        this.jenis_barang = jenis_barang;
        this.stok_barang = stok_barang;
        this.harga_barang = harga_barang;
    }

    public String getLempar_jenis() {
        return lempar_jenis;
    }

    public void setLempar_jenis(String lempar_jenis) {
        this.lempar_jenis = lempar_jenis;
    }
    
    public Integer getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(Integer kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public Integer getJenis_barang() {
        return jenis_barang;
    }

    public void setJenis_barang(Integer jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

    public Integer getStok_barang() {
        return stok_barang;
    }

    public void setStok_barang(Integer stok_barang) {
        this.stok_barang = stok_barang;
    }

    public Integer getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(Integer harga_barang) {
        this.harga_barang = harga_barang;
    }
    
   
}
