import model.Caminhao;
import model.Motorista;
import model.Seguro;
import repository.Motoristas;

import java.math.BigDecimal;
import java.util.Optional;

public class MainOptional {

    private String cobertura = "Valor não definido";

    public void cobertura(Optional<Motorista> motoristaOptional){
        cobertura = "";
    }

    public void setCobertura(String cobertura){
        this.cobertura = cobertura;
    }

    public String getCobertura(){
        return cobertura;
    }

    public static void main(String[] args){
        Motoristas motoristas = new Motoristas();
        MainOptional mainOptional = new MainOptional();
        Motorista motorista = motoristas.porNome("José");
        //String cobertura = motorista.getCaminhao().getSeguro().getCobertura();
        //cobertura = cobertura != null ? cobertura : "Sem seguro";

        //TESTANDO O OPTIONAL
        /*Seguro seguro = new Seguro("Total com franquia reduzida", new BigDecimal("600"));
        Seguro seguro2 = null;
        Optional<Seguro> seguroOptional = Optional.ofNullable(seguro);
        seguroOptional.map(Seguro::getCobertura).ifPresent(System.out::println);*/

        System.out.println("Forma 01 de usar o Optional");
        Optional<Motorista> motoristaOptional = Optional.ofNullable(motorista);
        String cobertura2 = motoristaOptional.flatMap(Motorista::getCaminhoOptional)
                .flatMap(Caminhao::getSeguroOptional)
                .map(Seguro::getCobertura)
                .orElse("Valor não definido");
        System.out.println(cobertura2);


        System.out.println("Forma 02 de usar o Optional");
        Optional<Motorista> motoristaOptional2 = Optional.of(motorista);
        motoristaOptional2.flatMap(Motorista::getCaminhoOptional)
                .flatMap(Caminhao::getSeguroOptional)
                .flatMap(Seguro::getCoberturaOptional)
                .ifPresent(tel -> {
                    // Executado somente se pessoa, dados e telefone nao forem null
                    mainOptional.setCobertura(tel);
                });
        System.out.println(mainOptional.getCobertura());
    }
}
