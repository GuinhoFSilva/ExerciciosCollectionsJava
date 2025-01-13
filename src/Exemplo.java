import java.util.ArrayList;
import java.util.List;

public class Exemplo{
    public static void main (String [] args){
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Texto incrível");
        listaSemGenerics.add(2);

        for(Object elementoAtual : listaSemGenerics){
            System.out.println(elementoAtual);
        }

        List <String> listaComGenerics = new ArrayList<>();
        listaComGenerics.add("B");
        listaComGenerics.add("A");
        listaComGenerics.add("C");

        for(String elementoAtual : listaComGenerics){
            System.out.println(elementoAtual);
        }

        
    }

}