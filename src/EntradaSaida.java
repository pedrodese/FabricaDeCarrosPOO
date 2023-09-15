import javax.swing.*;
import java.util.ArrayList;

public class EntradaSaida
{

    public static int mostraMenuInicial(){
        String[] opcoes = {"Fabricar carro", "Ver informações de todos os carros", "Vender carros","Sair do programa"};
        JComboBox<String> menu = new JComboBox<>(opcoes);
        JOptionPane.showMessageDialog(null, menu,  "Selecione a opção desejada: ",JOptionPane.DEFAULT_OPTION);

        return menu.getSelectedIndex();

    }

    public static int carrosTotaisFabricados(){

        int validacao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos carros você deseja construir?"));
        while(validacao <= 0){
            JOptionPane.showMessageDialog(null, "Informe um valor válido! ","Valor invalido!", JOptionPane.WARNING_MESSAGE);
            validacao = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos carros você deseja construir?"));
        }
        return validacao;

    }

    public static String modeloCarro(){
        return JOptionPane.showInputDialog("Informe o modelo do carro: ");
    }

    public static String corCarro(){
        return JOptionPane.showInputDialog("Informe a cor do carro: ");
    }

    public static void exibeInfoCarros(ArrayList<Carro> carrosFabricados){
        String[] informacoes = new String[carrosFabricados.size()];
        for(int x=0;x<carrosFabricados.size();x++){
            informacoes[x] = "Modelo: " + carrosFabricados.get(x).getModelo() + "\n Cor: " + carrosFabricados.get(x).getCor();
        }
        JOptionPane.showMessageDialog(null,informacoes);
    }

    public static void exibeMsgEncerraPrograma(){
        JOptionPane.showMessageDialog(null,"O programa será encerrado!");
        System.exit(0);
    }

    public static int exibeMenuVenderCarros(ArrayList<Carro> carrosFabricados){
        String[]  listaCarros = new String[carrosFabricados.size()];
        for(int x=0;x<carrosFabricados.size();x++){
            listaCarros[x] = "Modelo: " + carrosFabricados.get(x).getModelo() + "\n Cor: " + carrosFabricados.get(x).getCor();
        }
        boolean validacao = false;
        if(carrosFabricados.isEmpty()){
            JOptionPane.showMessageDialog(null,"Não existem carros fabricados para venda no momento, fabrique mais carros","Estoque zerado!", JOptionPane.WARNING_MESSAGE);
            validacao = true;
        }
        if(validacao == false){
            JComboBox<String> menuVendas = new JComboBox<>(listaCarros);
            JOptionPane.showMessageDialog(null, menuVendas, "Selecione o carro que deseja vender: ", JOptionPane.DEFAULT_OPTION);
            return menuVendas.getSelectedIndex();
        }
            return -1;
    }
}
