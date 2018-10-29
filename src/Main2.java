public class Main2 {

    //RETORNA UM VALOR DO TIPO DOUBLE
    interface num{
        double getValue();
    }

    //VERIFICANDO SE O NÚMERO É PAR
    interface valorNumeric {
        boolean teste(int n);
    }

    //VERIFICA SE O NÚMER É DIVÍSIVEL DE OUTRO NÚMERO
    interface isDiv{
        boolean isDiv(int x, int y);
    }

    //RETORNANDO A SOMA DE DOIS VALORES
    interface soma{
        int teste2(int x, int y);
    }

    public static void main(String[] args){
        num n;
        n = () -> 33.11;
        System.out.println(n.getValue());

        //VERIFICANDO SE O NÚMERO É PAR
        valorNumeric isPar = (int i) -> (i % 2) == 0;
        System.out.println(isPar.teste(2));

        //RETORNANDO A SOMA DE DOIS VALORES
        soma somando = (int num1, int num2) -> (num1 + num2);
        System.out.println(somando.teste2(2,3));

        //FAZENDO O QUE QUISER COM OS DOIS VALORES PASSADOS COMO PARÂMETROS
        soma testando = (int num1, int num2) -> {
            return num1 - num2;
        };
        System.out.println(testando.teste2(3, 2));

        //RETORNANDO A SOMA DE DOIS VALORES
        isDiv div = (int num1, int num2) -> (num1%num2 == 0);
        System.out.println(div.isDiv(5,3));

    }
}
