package data;


/**
 *
 * @author fajar
 */
public class Laptop {
    
    private String nama;
    private String brand;
    private String processor;
    private int jmlCore;
    private String so;
    private int ram;
    private String storage;
    private int stok;

    
    Laptop(String nama, String brand, int ram, int stok,
            String processor, int jmlCore, String so, String storage){
        this.nama=nama;
        this.brand=brand;
        this.processor=processor;
        this.jmlCore=jmlCore;
        this.so=so;
        this.ram=ram;
        this.storage=storage;
        this.stok=stok;
    }
    
    Laptop(){
        setNama(nama);
        setBrand(brand);
        setRam(ram);
        setStok(stok);
        setProcessor(processor);
        setJmlCore(jmlCore);
        setSo(so); 
        setStorage(storage); 
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getJmlCore() {
        return jmlCore;
    }

    public void setJmlCore(int jmlCore) {
        this.jmlCore = jmlCore;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}
