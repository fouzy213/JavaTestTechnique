import java.io.IOException;


public class game {

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);


        try{
            
           char[][] carte = CreateMap.loadMap("carte.txt");
          

           Adventurer adventurer = new Adventurer(args[0],args[1]);

           int [] InitialPosition = adventurer.convertStringToIntCoordinates();

           int[] CurrentPosition = { InitialPosition[0], InitialPosition[1] };
            
           int [] FinalPosition = adventurer.Move(carte, CurrentPosition);
           
            System.out.println("This is initial coordinates = " + InitialPosition[0]+","+InitialPosition[1]);
        
            CreateMap.printTab(carte, InitialPosition, FinalPosition);
            System.out.println("This Final Position" + FinalPosition[0] +","+ FinalPosition[1]);
        }
        catch(IOException e) {
            System.err.println("Erreur lors de la lecture de la carte : " + e.getMessage());
            
        }
        
    }
    
}
