import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainPredicate {

    public static void filtro(List<String> list, Predicate<String> condicao){
        for (String s : list){
            if(condicao.test(s)){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Santa Catarina",
                "Paraná",
                "São Paulo",
                "Rio de Janeiro",
                "Brasília",
                "Ceará"
        );

        System.out.println("Estados que iniciam com a letra s: ");
        filtro(list, (s)->s.toLowerCase().startsWith("s"));
        System.out.println();

        System.out.println("Estados que finalizam com a letra a:");
        filtro(list, (s)->s.endsWith("a"));
        System.out.println();

        System.out.println("Imprimi a lista inteira:");
        filtro(list, (s)->true);
        System.out.println();

        System.out.println("Não imprimi a lista");
        filtro(list, (s)->false);
        System.out.println();

        System.out.println("Nomes com mais de 10 caracteres:");
        filtro(list, (s)->s.length() > 10);
        System.out.println();
    }
}
