package Questao01;
import FuncaoCarro.Carro;

public class App {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setModelo("Escort XR3");
        carro.setMarca("FORD");
        carro.setAnoFabricacao(1991);
        carro.setCategoria("Sedan");
        carro.setTipoCombustivel("Gasolina / Álcool");

        System.out.print("Informações Carro:\n\n"
                + "MODELO: " + carro.getModelo() + "\n"
                + "MARCA: " + carro.getMarca() + "\n"
                + "ANO: " + carro.getAnoFabricacao() + "\n"
                + "MODELO: " + carro.getCategoria() + "\n"
                + "Combustível: " + carro.getTipoCombustivel() + "\n\n");
        
        System.out.print("Luiz entrou no carro " + carro.getModelo() + ", ");
        System.out.print("ligou '");
        carro.ligar();
        System.out.print("', então acelerou '");
        carro.acelerar();
        System.out.print("', porém no meio do caminho um carro entra na sua faixa sem ligar a seta e então o Luiz freia o carro, ");
        carro.freiar();
        System.out.print(" e buzina ");
        carro.buzinar();
        
    }

}
