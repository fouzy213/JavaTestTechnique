import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class CreateMap {

    public static void printTab(char[][] map, int[] InitialPosition, int [] FinalPosition)
    {
        for (int row = 0; row < map.length; row++) {
         for (int col = 0; col < map[0].length; col++) {
            // Si c'est la position de départ
            if (row == InitialPosition[0] && col == InitialPosition[1]) {
                System.out.print('D'); // Départ
            }
            // Si c'est la position d'arrivée (et différente du départ)
            else if (row == FinalPosition[0] && col == FinalPosition[1]) {
                System.out.print('F'); // Fin
            }
            else {
                System.out.print(map[row][col]); // Cellule normale
            }
        }
            System.out.println();
        }
    }
 
    public static char[][] loadMap(String pathToFile) throws IOException
    {
            
            Path pathToMap = Paths.get("carte.txt");
            List<String> lignes = Files.readAllLines(pathToMap);

            // ca charge un tableau de la taille du fichie
            char[][] map = new char[lignes.size()][];

            for (int row = 0; row < lignes.size(); row++)
            {
                String ligne = lignes.get(row);
                map[row] = new char [ligne.length()];

                for ( int column = 0 ; column < ligne.length() ;column ++){

                    char atIndex = ligne.charAt(column); //similaire to ligne[index] car les Strings ne s’indexent pas comme des tableaux on doit utiliser charAt()
                    
                    if(atIndex == '#')
                    {
                        map[row][column] = '#';
                    }
                    else map[row][column] = '°';
                    
                }
            }

            return map;
    }
    
}
