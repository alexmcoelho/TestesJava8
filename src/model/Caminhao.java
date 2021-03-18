package model;

import java.util.Optional;

public class Caminhao {

    private String modelo;
    private Seguro seguro;

    public Caminhao() {
    }

    public Caminhao(String modelo, Seguro seguro) {
        this.modelo = modelo;
        this.seguro = seguro;
    }

    public Optional<Seguro> getSeguroOptional(){
        Optional<Seguro> seguroOptional = Optional.ofNullable(seguro);
        return seguroOptional;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
}
