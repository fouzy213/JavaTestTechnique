import java.io.IOException;


public class game {

    public static void main(String[] args) {

        try{
            
           int[][] carte = CreateMap.loadMap("carte.txt");
           CreateMap.printTab(carte);

        }
        catch(IOException e) {
            System.err.println("Erreur lors de la lecture de la carte : " + e.getMessage());
            
        }
        
    }
    
}
