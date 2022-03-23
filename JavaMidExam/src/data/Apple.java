package data;

/**
 *
 * @author fajar
 */
public class Apple extends Laptop{
    double ukLayar;
    
    public Apple(String nama, String brand, int ram, int stok,
            String processor, int jmlCore, String so, String storage){
            
            super(nama, brand, ram, stok, processor, jmlCore, so, storage);
    }
    
    public Apple(){
        super();
        super.setBrand("Apple");
    }

    public double getUkLayar() {
        return ukLayar;
    }

    public void setUkLayar(double ukLayar) {
        this.ukLayar = ukLayar;
    }
    
    
    public String toString(){
        return
        "\n============= ETALASE LAPTOP APPLE ================" +
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
            case "ssd m.2" -> {
                return "Best";
            }
            case "ssd sata" -> {
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
