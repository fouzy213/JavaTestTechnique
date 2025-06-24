import java.io.IOException;


public class game {

    public static void main(String[] args) {
                                    //chaine de caratere "3;0"
        System.out.println(args[0]); //chaine de caratere "3"
        System.out.println(args[1]);//chaine de caratere "0"


        try{
            
           char[][] carte = CreateMap.loadMap("carte.txt");
          

           Adventurer adventurer = new Adventurer(args[0],args[1]);  //instancier (attribuer) classe Adventure ;

           int [] InitialPosition = adventurer.convertStringToIntCoordinates();

           int[] CurrentPosition = { InitialPosition[0], InitialPosition[1] };//position de mtn//
            
           int [] FinalPosition = adventurer.Move(carte, CurrentPosition);
           //on appelle la methode move qui dit comment se deplacer N S E O //
            System.out.println("This is initial coordinates = " + InitialPosition[0]+","+InitialPosition[1]);
        
            CreateMap.printTab(carte, InitialPosition, FinalPosition);//reafiche avec les mise a jours//
            System.out.println("This Final Position" + FinalPosition[0] +","+ FinalPosition[1]);
        }
        catch(IOException e) {
            System.err.println("Erreur lors de la lecture de la carte : " + e.getMessage());
            
        }
        
    }
    
}
