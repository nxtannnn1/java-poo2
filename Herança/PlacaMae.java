package Herança;

public class PlacaMae extends Componente {

    protected String soquete;
    protected String ram;
    protected String slot;

    public PlacaMae() {

    }

    public PlacaMae(String marca, String modelo, String soquete, String ram, String slot) {
        super(marca, modelo);
        this.soquete = soquete;
        this.ram = ram;
        this.slot = slot;
    }

    public void setSoquete(){
        this.soquete=soquete;
    }

    public void setRam(){
        this.ram=ram;
    }

    public void setSlot (){
        this.slot=slot;
    }

    public String getSoquete(){
        return this.soquete;
    }

    public String getRam(){
        return this.ram;
    }

    public String getSlot(){
        return this.slot;
    }

    public void exibirDescricao(){
        System.out.println("\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nSoquete: "
                + getSoquete() + "\nRAM: " + getRam()+"\nSlot: "+getSlot());
    }


}
