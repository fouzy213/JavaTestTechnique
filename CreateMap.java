import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class CreateMap {

    public static void printTab(int[][] map)
    {
        for (int[] row : map) {
            for (int cell : row) {
                System.out.print(cell);
        }
            System.out.println();
        }
    }
 
    public static int[][] loadMap(String pathToFile) throws IOException
    {
            
            Path pathToMap = Paths.get("carte.txt");
            List<String> lignes = Files.readAllLines(pathToMap);

            // ca charge un tableau de la taille du fichie
            int[][] map = new int[lignes.size()][];

            for (int row = 0; row < lignes.size(); row++)
            {
                String ligne = lignes.get(row);
                map[row] = new int [ligne.length()];

                for ( int column = 0 ; column < ligne.length() ;column ++){

                    char atIndex = ligne.charAt(column); //similaire to ligne[index] car les Strings ne s’indexent pas comme des tableaux on doit utiliser charAt()
                    
                    if(atIndex == '#')
                    {
                        map[row][column] = 1;
                    }
                    else map[row][column] = 0;
                    
                }
            }

            return map;
    }
    
}
