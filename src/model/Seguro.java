package model;

import java.math.BigDecimal;
import java.util.Optional;

public class Seguro {

    private String cobertura;
    private BigDecimal valorFranquia;

    public Seguro() {
    }

    public Seguro(String cobertura, BigDecimal valorFranquia) {
        this.cobertura = cobertura;
        this.valorFranquia = valorFranquia;
    }

    public Optional<String> getCoberturaOptional(){
        return Optional.ofNullable(cobertura);
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public BigDecimal getValorFranquia() {
        return valorFranquia;
    }

    public void setValorFranquia(BigDecimal valorFranquia) {
        this.valorFranquia = valorFranquia;
    }
}
