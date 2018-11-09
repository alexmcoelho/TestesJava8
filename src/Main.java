import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public String integra(List<String> g7, List<String> g5, String texto, Boolean g5Parag7){
        if(!g5Parag7){
            return g5.get(g7.indexOf(texto));
        }
        return g7.get(g5.indexOf(texto));
    }

    public String lerArquivoCSV(){
        String nome = "";
        String matricula = "";
        String serieCod = "";
        String turnoCod = "";
        String tel = "";
        String cel = "";
        String situacaCarteira = "";
        String codEscola = "";
        String valuesSql = "";

        //abre um arquivo e cria um file
        File arquivoCSV = new File("g7parag5.csv");

        int contador = 0;
        String[] valoresEntreVirgulas = null;
        //cria um scanner para ler o arquivo
        Scanner leitor = null;
        try {
            leitor = new Scanner(arquivoCSV);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //variavel que armazenara as linhas do arquivo
        String linhasDoArquivo = new String();

        //ignora a primeira linha do arquivo
        leitor.nextLine();

        //percorre todo o arquivo
        while (leitor.hasNext()) {

            //recebe cada linha do arquivo
            linhasDoArquivo = leitor.nextLine();

            //separa os campos entre as virgulas de cada linha
            valoresEntreVirgulas = linhasDoArquivo.split(";");

            nome = valoresEntreVirgulas[0];
            matricula = valoresEntreVirgulas[1];

            valuesSql = valuesSql + "G7: " + nome + ", G5: " + matricula + "\n";
        }

        valuesSql = valuesSql.substring(0, valuesSql.length() - 1);

        return valuesSql;
    }

    public static void main(String[] args){
        Main m = new Main();
        List<String> g7 = new ArrayList<>();
        g7.add("Teste 1");
        g7.add("Teste 2");
        g7.add("Teste 3");

        List<String> g5 = new ArrayList<>();
        g5.add("Dado 1");
        g5.add("Dado 2");
        g5.add("Dado 3");

        System.out.println(m.lerArquivoCSV());

        System.out.println("Dado que será salvo na G5: " + m.integra(g7, g5, "Teste 2", false));

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Estudando expressão lambda");
            }
        };

        Runnable r2 = () -> System.out.println("Estudando expressão lambda 1");

        r1.run();
        r2.run();
    }

}
