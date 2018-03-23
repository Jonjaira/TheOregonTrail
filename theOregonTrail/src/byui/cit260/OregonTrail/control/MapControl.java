/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.OregonTrail.control;

import byui.cit260.OregonTrail.exceptions.MapControlException;
import byui.cit260.OregonTrail.model.Game;
import byui.cit260.OregonTrail.model.GenericScene;
import byui.cit260.OregonTrail.model.Location;
import byui.cit260.OregonTrail.model.Map;
import byui.cit260.OregonTrail.model.Player;
import byui.cit260.OregonTrail.model.Question;
import byui.cit260.OregonTrail.model.QuestionScene;
import byui.cit260.OregonTrail.model.QuestionType;
import byui.cit260.OregonTrail.model.Scene;
import byui.cit260.OregonTrail.model.SceneType;
import javaapplication1.JavaApplication1;

/**
 *
 * @author jonja
 */
public class MapControl {
    public static Map createMap( int noOfRows,
                                 int noOfColumns)
        throws MapControlException{
        Map map = new Map(noOfColumns, noOfColumns);

        Location locations[][] = createLocations(noOfRows, noOfColumns);
        map.setLocations(locations);
        
        Scene scenes[] = createScenes();
        Question questions[] = createQuestions();
        
        assignQuestionsToScenes(questions, scenes);
        
        assignScenesToLocations(map, scenes);
        
        return map;
    }
    
    private static Location[][] createLocations(int rows, int columns)
        throws MapControlException{
        if (rows < 1) {
            throw new MapControlException("Rows can't be less than 1");
        }
        
        if (columns < 1) {
            throw new MapControlException("Columns can't be less than 1");
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
        Scene[] scenes = new Scene[10];
        
        scenes[SceneType.start.ordinal()]     = new GenericScene();
        scenes[SceneType.mountains.ordinal()] = new GenericScene();
        scenes[SceneType.road.ordinal()]      = new GenericScene();
        scenes[SceneType.forest.ordinal()]    = new GenericScene();
        scenes[SceneType.desert.ordinal()]    = new GenericScene();
        scenes[SceneType.city.ordinal()]      = new QuestionScene();
        scenes[SceneType.town.ordinal()]      = new QuestionScene();
        scenes[SceneType.lake.ordinal()]      = new QuestionScene();
        scenes[SceneType.river.ordinal()]     = new QuestionScene();
        scenes[SceneType.finish.ordinal()]    = new GenericScene();
        
        return scenes;
    }
    
    private static Question[] createQuestions() {
        Question[] questions = new Question[10];
        
        questions[QuestionType.drinkWater.ordinal()]   = new Question("Do you want to drink some water?");
        questions[QuestionType.talkToPeople.ordinal()] = new Question("Do you want to talk to people?");
        questions[QuestionType.visitTown.ordinal()]    = new Question("Do you want to visit this place?");
        questions[QuestionType.fight.ordinal()]        = new Question("Do you want to fight?");
        questions[QuestionType.sellItem.ordinal()]     = new Question("Do you want to sell the Item?");
        questions[QuestionType.wannaHunt.ordinal()]    = new Question("Do you want to hunt?");
        questions[QuestionType.wannaRest.ordinal()]    = new Question("Do you want to rest?");
        questions[QuestionType.hitTheRoad.ordinal()]   = new Question("Do you want to hit the road?");
        questions[QuestionType.wannaExit.ordinal()]    = new Question("Do you want to exit?");
        questions[QuestionType.cancel.ordinal()]       = new Question("Do you want to cancel?");
        
        return questions;
    }
    private static void assignQuestionsToScenes(Question[] questions, Scene[] scenes) {
        QuestionScene cityScene = (QuestionScene)scenes[SceneType.city.ordinal()];
        Question[] questionsInCityScene = new Question[2];
        questionsInCityScene[0] = questions[QuestionType.visitTown.ordinal()];
        questionsInCityScene[1] = questions[QuestionType.wannaExit.ordinal()];
        cityScene.setQuestions(questionsInCityScene);

        QuestionScene townScene = (QuestionScene)scenes[SceneType.town.ordinal()];
        Question[] questionsInTownScene = new Question[2];
        questionsInCityScene[0] = questions[QuestionType.visitTown.ordinal()];
        questionsInCityScene[1] = questions[QuestionType.wannaExit.ordinal()];
        townScene.setQuestions(questionsInTownScene);

        QuestionScene lakeScene = (QuestionScene)scenes[SceneType.lake.ordinal()];
        Question[] questionsInLakeScene = new Question[2];
        questionsInCityScene[0] = questions[QuestionType.visitTown.ordinal()];
        questionsInCityScene[1] = questions[QuestionType.wannaExit.ordinal()];
        lakeScene.setQuestions(questionsInLakeScene);

        QuestionScene riverScene = (QuestionScene)scenes[SceneType.river.ordinal()];
        Question[] questionsInRiverScene = new Question[2];
        questionsInCityScene[0] = questions[QuestionType.visitTown.ordinal()];
        questionsInCityScene[1] = questions[QuestionType.wannaExit.ordinal()];
        riverScene.setQuestions(questionsInRiverScene);
    } 
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][0].setName("STR");
        locations[0][1].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][0].setName("STR");
        locations[0][2].setScene(scenes[SceneType.road.ordinal()]);
        locations[0][0].setName("ROD");
        locations[0][3].setScene(scenes[SceneType.mountains.ordinal()]);
        locations[0][0].setName("MTN");
        locations[0][4].setScene(scenes[SceneType.mountains.ordinal()]);
        locations[0][0].setName("MTN");
        locations[1][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][0].setName("STR");
        locations[1][1].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][0].setName("STR");
        locations[1][2].setScene(scenes[SceneType.road.ordinal()]);
        locations[0][0].setName("ROD");
        locations[1][3].setScene(scenes[SceneType.lake.ordinal()]);
        locations[0][0].setName("LAK");
        locations[1][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][0].setName("FRS");
        locations[2][0].setScene(scenes[SceneType.road.ordinal()]);
        locations[0][0].setName("ROD");
        locations[2][1].setScene(scenes[SceneType.road.ordinal()]);
        locations[0][0].setName("ROD");
        locations[2][2].setScene(scenes[SceneType.city.ordinal()]);
        locations[0][0].setName("CIT");
        locations[2][3].setScene(scenes[SceneType.road.ordinal()]);
        locations[0][0].setName("ROD");
        locations[2][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][0].setName("FOR");
        locations[3][0].setScene(scenes[SceneType.river.ordinal()]);
        locations[0][0].setName("RVR");
        locations[3][1].setScene(scenes[SceneType.lake.ordinal()]);
        locations[0][0].setName("LAK");
        locations[3][2].setScene(scenes[SceneType.town.ordinal()]);
        locations[0][0].setName("TWN");
        locations[3][3].setScene(scenes[SceneType.finish.ordinal()]);
        locations[0][0].setName("END");
        locations[3][4].setScene(scenes[SceneType.finish.ordinal()]);
        locations[0][0].setName("END");
        locations[4][0].setScene(scenes[SceneType.mountains.ordinal()]);
        locations[0][0].setName("MTN");
        locations[4][1].setScene(scenes[SceneType.mountains.ordinal()]);
        locations[0][0].setName("MTN");
        locations[4][2].setScene(scenes[SceneType.road.ordinal()]);
        locations[0][0].setName("ROD");
        locations[4][3].setScene(scenes[SceneType.finish.ordinal()]);
        locations[0][0].setName("END");
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
        locations[0][0].setName("END");
    }
    
    public static Location moveActor(Player actor, int newRow, int newColumn)
        throws MapControlException{
        
        if (actor == null) {
            throw new MapControlException("Player is null!");
        }
        
        Map map = JavaApplication1.getCurrentGame().getMap();
        int rowsInMap = map.getRowCount();
        int colsInMap = map.getColumnCount();
        
        if ((newRow < 1) || (newRow > rowsInMap)) {
            throw new MapControlException("Bad number of rows!");
        }
        
        if ((newColumn < 1) || (newColumn > colsInMap)) {
            throw new MapControlException("Bad number of Columns!");
        }
        
        Location newLocation = map.getLocation(newRow, newColumn);
        
        actor.setCurrentLocation(newLocation);
        
        return newLocation;
    }
}
