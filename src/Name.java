import java.util.ArrayList;
import java.util.List; 

public class Name{ 

    private List<String> g7 = new ArrayList<>();
    private List<String> g5 = new ArrayList<>();

    public Name(){ 
        g7.add("Teste 1");
        g7.add("Teste 2");
        g7.add("Teste 3");
        g7.add("Teste 4");
        g5.add("Dado 1");
        g5.add("Dado 2");
        g5.add("Dado 3");
        g5.add("Dado 4");
    } 

    public String integrates(String text, Boolean g5Forg7) { 
        if(!g5Forg7 && g7.contains(text)){ 
            return g5.get(g7.indexOf(text)); 
        } else if(g5Forg7 && g5.contains(text)){ 
            return g7.get(g5.indexOf(text)); 
        } 
        return null; 
    } 
}