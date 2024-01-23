
/**
 * Stupid joke class for testing purposes
 * 
 * @author Brandon Cash
 */
public class DeezNuts{
    private String joke;

    public DeezNuts(String joke){
        this.joke = joke;
    }

    public DeezNuts(){
        this.joke = "";
    }

    public String getJoke(){
        return joke;
    }

    public void setJoke(String joke){
        this.joke = joke;
    }
}