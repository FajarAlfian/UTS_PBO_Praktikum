package data;

/**
 *
 * @author fajar
 */
public class Asus extends Laptop{
    String storefront;
    double ukLayar;
    
    public Asus(String nama, String brand, int ram, int stok,
            String processor, int jmlCore, String so, String storage){
            
            super(nama, brand, ram, stok, processor, jmlCore, so, storage);
    }
    
    public Asus(){
        super();
        super.setBrand("Asus");
    }

    public double getUkLayar() {
        return ukLayar;
    }

    public void setUkLayar(double ukLayar) {
        this.ukLayar = ukLayar;
    }
    
    
    public String toString(){
        return
        "\n============= ETALASE LAPTOP ASUS ================" +
        "\nNama Laptop                : " +this.getNama() +
        "\nBrand Laptop               : " +this.getBrand() +
        "\nUkuran Layar               : " +this.getUkLayar()+ " inch"+
        "\nNama Processor             : " +this.getProcessor()+
        "\nJumlah Core pada Processor : " +this.getJmlCore()+
        "\nSistem Operasi             : " +this.getSo()+
        "\nUkuran RAM                 : " +this.getRam()+ " GB" +
        "\nJenis Storage              : " +this.getStorage() +
        "\nStok Laptop                : " +this.getStok()+ " Pcs"+
        "\nStore Position " + this.getNama() + " adalah " + this.getStorePosition()+
        "\n==================================================" ;
    }
    
    @Override
    public void setRam(int ram){
        if(ram <= 0){
            ram=0;
            super.setRam(ram);
        }
    }
    
    @Override
    public void setJmlCore(int jmlCore){
        if(jmlCore <= 0){
            jmlCore=0;
            super.setJmlCore(jmlCore);
        }
    }
    
    @Override
    public void setStok(int stok){
        if(stok <= 0){
            stok=0;
            super.setStok(stok);
        }
    }
   
    public String getStorePosition(){
        String storage = super.getStorage().toLowerCase().replaceAll("\\s+","");
        switch(storage) {
            case "ssdm.2" -> {
                return "Best";
            }
            case "ssdsata" -> {
                return "Good";
            }
            case "hdd" -> {
                return "Middle";
            }
            default -> {
                    return "unknown";
            }
        }
    }
}
