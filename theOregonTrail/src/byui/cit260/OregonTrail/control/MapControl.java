/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.control;

import byui.cit260.OregonTrail.model.GenericScene;
import byui.cit260.OregonTrail.model.Location;
import byui.cit260.OregonTrail.model.Map;
import byui.cit260.OregonTrail.model.QuestionScene;
import byui.cit260.OregonTrail.model.Scene;
import byui.cit260.OregonTrail.model.SceneType;

/**
 *
 * @author jonja
 */
public class MapControl {
    public static Map createMap( int noOfRows,
                                 int noOfColumns) {
        Map map = new Map(noOfColumns, noOfColumns);

        Location locations[][] = createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);
        
        Scene scenes[] = createScenes();
        
        return map;
    }
    
    private static Location[][] createLocations(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            return null;
        }
        
        Location locations[][] = new Location[rows][columns];
        
        for (int row_index = 0; row_index < rows; row_index++) {
            for (int col_index = 0; col_index < columns; col_index++) {
                locations[row_index][col_index] = new Location(row_index,
                                                               col_index,
                                                               false);
            }
        }
        
        return locations;
    }
    
    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[2];
        
        scenes[SceneType.generic.ordinal()] = new GenericScene();
        scenes[SceneType.question.ordinal()] = new QuestionScene();
        
        return scenes;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        
    }
}
