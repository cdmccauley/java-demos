/*
 * OlympicEvent class
 */

package winterolympics;

public abstract class OlympicEvent {
    private int initCounter;
    private String eventName, eventYear;
    private String[][] contestantScore;
    
    /*
     * constructor
     * pre: none
     * post: variables initialized
     */
    public OlympicEvent() {
        eventYear = null;
        eventName = null;
        contestantScore = new String[0][0];
        initCounter = 0;
    }
    
    /*
     * overidden constructor
     * pre: none
     * post: variables initialized with arguments
     */
    public OlympicEvent(String[] eventArgs, int numCompetitors) {
        this.eventName = eventArgs[0];
        this.eventYear = eventArgs[1];
        this.contestantScore = new String[numCompetitors][2];
        this.initCounter = 0;
        
        for (int i = 2; i <= 11; i += 2) {
            contestantScore[initCounter][0] = eventArgs[i];
            contestantScore[initCounter][1] = eventArgs[i + 1];
            initCounter++;
        }
    }
    
    /*
     * access names and scores array
     * pre: none
     * post: array returned
     */
    public String[][] getContestantScore() {
        return contestantScore;
    }
    
    /*
     * sort scores
     * pre: none
     * post: scores are sorted
     */
    public abstract String[][] sortScores(String[][] array);
    
    /*
     * tostring override
     * pre: none
     * post: string representation of event returned
     */
    public String toString() {
        return(eventName + " " + eventYear);
    }
}