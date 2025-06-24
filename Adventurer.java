
public class Adventurer {
    //attribue//
    private String coordinates;
    private String instructions;
    

//constructeur//
    public Adventurer( String coordinates, String instructions){
        this.coordinates = coordinates;
        this.instructions = instructions;
    }

    public int[] convertStringToIntCoordinates()
    {
        String[] parts = this.coordinates.split(",");// "3,0"=> [3, 0]
        int row = Integer.parseInt(parts[0]);
        int col = Integer.parseInt(parts[1]);

        return new int[]{row, col};       
    }


    public int[] Move(char[][] map, int [] ArrayofCoordinates)
    {
        int rows = map.length;
        int columns = map[0].length;

        for(int index = 0; index < instructions.length(); index++)  
        {
            int row = ArrayofCoordinates[0];
            int column = ArrayofCoordinates[1];
            char move = instructions.charAt(index);

            if(move == 'S' &&  row + 1 < rows && map[row+1][column] != '#') // si S et que le row +1 a la longueur du tab et qui n'ya pas de diez//
            {
                ArrayofCoordinates[0] +=1; //rajoute +1 sur ton deplacement//
                map[row][column] = 'X';  
            }
               
            
            
            if(move == 'N' && row - 1 >= 0 && map[row-1][column] != '#')
            {
                ArrayofCoordinates[0] -=1;
                map[row][column] = 'X';
            }
            

            if(move == 'E' && column + 1 < columns && map[row][column+1] != '#')
            {
                ArrayofCoordinates[1] +=1;
                map[row][column] = 'X';
            }
            

            if(move == 'O' && column -1 >= 0 && map[row][column-1] != '#')
            {
                ArrayofCoordinates[1] -=1;
                map[row][column] = 'X';
            }
        }

        return ArrayofCoordinates;
    }


}
