package CONTROLLER;

import VIEW.EntradaSaida;
import MODEL.Fabrica;
import MODEL.Carro;

import javax.swing.*;

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
                        JOptionPane.showMessageDialog(null,"Carro fabricado com sucesso!","MODEL.Carro fabricado!",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                case 1 -> {
                    EntradaSaida.exibeInfoCarros(fabrica.getCarrosFabricados());
                }
                case 2 -> {
                    indice = EntradaSaida.exibeMenuVenderCarros(fabrica.getCarrosFabricados());
                    System.out.println(indice);
                    if(indice >= 0){
                        fabrica.setVenderCarros(indice);
                    }
                    JOptionPane.showMessageDialog(null,"Carro vendido com sucesso!","Venda concluida!",JOptionPane.INFORMATION_MESSAGE);

                }
                case 3 -> {
                    EntradaSaida.exibeMsgEncerraPrograma();
                }


            }
        }while(true);
    }


}
