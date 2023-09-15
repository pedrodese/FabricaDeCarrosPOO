import java.util.ArrayList;

public class Controladora {

    Carro carro = new Carro();
    Fabrica fabrica = new Fabrica();


    public void  menuInicial(){
        int contador = 0;
        int opcao;


        do {
            opcao = EntradaSaida.mostraMenuInicial();

            int count = 0;
            int qtd = 0;

            int indice;

            switch (opcao){


                case 0 -> {
                    count = 0;
                    qtd = EntradaSaida.carrosTotaisFabricados();
                    while(count < qtd){
                        Carro carro = new Carro();
                        carro.setModelo(EntradaSaida.modeloCarro());
                        carro.setCor(EntradaSaida.corCarro());
                        fabrica.setCarrosFabricados(carro);
                        count++;
                    }
                }
                case 1 -> {
                    EntradaSaida.exibeInfoCarros(fabrica.carrosFabricados);
                }
                case 2 -> {
                    indice = EntradaSaida.exibeMenuVenderCarros(fabrica.carrosFabricados);
                    System.out.println(indice);
                    if(indice >= 0){
                        fabrica.setVenderCarros(indice);
                    }

                }
                case 3 -> {
                    EntradaSaida.exibeMsgEncerraPrograma();
                }


            }
        }while(true);
    }


}
