package FuncaoCarro;

public class Carro {

    private String modelo;

    public String getModelo() {

        return modelo;

    }

    public void setModelo(String modelo) {

        this.modelo = modelo;

    }

    private int anoFabricacao;

    public int getAnoFabricacao() {

        return anoFabricacao;

    }

    public void setAnoFabricacao(int anofabricacao) {

        this.anoFabricacao = anofabricacao;

    }

    private String marca;

    public String getMarca() {

        return marca;

    }

    public void setMarca(String marca) {

        this.marca = marca;

    }

    private String categoria;

    public String getCategoria() {

        return categoria;

    }

    public void setCategoria(String categoria) {

        this.categoria = categoria;

    }

    private String tipoCombustivel;

    public String getTipoCombustivel() {

        return tipoCombustivel;

    }

    public void setTipoCombustivel(String tipoCombustivel) {

        this.tipoCombustivel = tipoCombustivel;

    }
    
    
    public void andar(){
        
        System.out.print("Andando...");
        
    }
    
    public void ligar(){
        
        System.out.print("tsc-tsc-tsc-Vrum...");
        
    }
    
    public void freiar(){
        
        System.out.print("Parando...");
        
    }
    
    public void acelerar(){
        
        System.out.print("Vrum - Vrummmm - Vrummmmmmmm...");
        
    }
    
    public void buzinar(){
        
        System.out.print("biiiiiiiii...");
        
    }

}