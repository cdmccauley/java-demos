/*
 * ScoredEvent class
 */

package winterolympics;

public class ScoredEvent extends OlympicEvent {
    
    /*
     * constructor
     * pre: none
     * post: variables initialized
     */
    public ScoredEvent() {
        super();
    }
    
    /*
     * overridden constructor
     * pre: none
     * post: variables initialized with arguments
     */
    public ScoredEvent(String[] eventArgs, int numCompetitors) {
        super(eventArgs, numCompetitors);
    }
    
    /*
     * sort scores in descending order
     * pre: none
     * post: sorted scores returned
     */
    public String[][] sortScores(String[][] sortDescending) {
        String[] swapContainer;
        
        for (int i = 0; i < sortDescending.length; i++) {
            for (int j = 0; j < sortDescending.length; j++) {
                if (Double.parseDouble(sortDescending[i][1]) > Double.parseDouble(sortDescending[j][1])) {
                    swapContainer = sortDescending[i];
                    sortDescending[i] = sortDescending[j];
                    sortDescending[j] = swapContainer;
                }
            }
        }
        return (sortDescending);
    }
}