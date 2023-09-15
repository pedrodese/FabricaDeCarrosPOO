import java.util.ArrayList;

public class Fabrica {
    ArrayList<Carro> carrosFabricados = new ArrayList<>();

    public ArrayList<Carro> getCarrosFabricados() {
        return carrosFabricados;
    }

    public void setCarrosFabricados(Carro carrosFabricados) {
        this.carrosFabricados.add(carrosFabricados);
    }

    public static void fabricarCarro(Carro carro){
        carro.setModelo(EntradaSaida.modeloCarro());
        carro.setCor(EntradaSaida.corCarro());

    }
    public void setVenderCarros(int indice) {
        this.carrosFabricados.remove(indice);
    }

}
