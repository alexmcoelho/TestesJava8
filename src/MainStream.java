import java.util.Arrays;
import java.util.List;

public class MainStream {

    public static void main(String[] args){
        List<String> list = Arrays.asList(
                "Santa Catarina",
                "Paraná",
                "São Paulo",
                "Rio de Janeiro",
                "Brasília",
                "Ceará"

        );

        list.forEach(x -> System.out.println(x));

        System.out.println();

        //OUTRA MANEIRA DE IMPRIMIR A LISTA
        list.forEach(System.out::println);
    }
}
