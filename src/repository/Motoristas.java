package repository;

import model.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Motoristas {

    private Map<String, Motorista> motoristas = new HashMap<>();

    public Motoristas() {
        Seguro seguro = new Seguro("Parcial - não cobre roubo", new BigDecimal("5000"));
        Caminhao caminhao = new Caminhao("Mercedes Atron", seguro);
        Motorista motoristaJoao = new Motorista("João", 40, caminhao);

        Motorista motoristaJose = new Motorista("José", 25, null); // Não tem caminhão

        motoristas.put("João", motoristaJoao);
        motoristas.put("José", motoristaJose);
    }

    public Motorista porNome(String nome) {
        return motoristas.get(nome);
    }

}
