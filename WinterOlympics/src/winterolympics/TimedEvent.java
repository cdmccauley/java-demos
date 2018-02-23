/*
 * TimedEvent class
 */

package winterolympics;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TimedEvent extends OlympicEvent {
    
    /*
     * constructor
     * pre: none
     * post: variables initialized
     */
    public TimedEvent() {
        super();
    }
    
    /*
     * overridden constructor
     * pre: none
     * post: variables initialized with arguments
     */
    public TimedEvent(String[] eventArgs, int numCompetitors) {
        super(eventArgs, numCompetitors);
    }
    
    /*
     * sort scores in ascending order
     * pre: none
     * post: sorted scores returned
     */
    public String[][] sortScores(String[][] sortAscending) {
        String parseSource; 
        String[] splitContainer = new String[3];
        String[] swapContainer;
        double seconds, minutes;
        double finalSeconds, finalMinutes, finalHours;
        DecimalFormat secFormat = new DecimalFormat("0.###");
        
        /* convert to seconds */
        for (int i = 0; i < sortAscending.length; i++) {
            parseSource = sortAscending[i][1];
            splitContainer = parseSource.split(":");
            seconds = Double.parseDouble(splitContainer[0]) * 60 * 60;
            seconds += Double.parseDouble(splitContainer[1]) * 60;
            seconds += Double.parseDouble(splitContainer[2]);
            sortAscending[i][1] = Double.toString(seconds);
        }
        
        /* sort ascending */
        for (int i = 0; i < sortAscending.length; i++) {
            for (int j = 0; j < sortAscending.length; j++) {
                if (Double.parseDouble(sortAscending[i][1]) < Double.parseDouble(sortAscending[j][1])) {
                    swapContainer = sortAscending[i];
                    sortAscending[i] = sortAscending[j];
                    sortAscending[j] = swapContainer;
                }
            }
        }
        
        /* convert to hours, minutes, seconds */
        secFormat.setRoundingMode(RoundingMode.HALF_UP);
        for (int i = 0; i < sortAscending.length; i++) {
            finalSeconds = Double.valueOf(secFormat.format(Double.parseDouble(sortAscending[i][1]) % 60));
            minutes = (Double.parseDouble(sortAscending[i][1]) - finalSeconds) / 60;
            finalMinutes = minutes % 60;
            finalHours = (minutes - finalMinutes) / 60;
            sortAscending[i][1] = (int)Math.round(finalHours) + ":" + (int)Math.round(finalMinutes) + ":" + finalSeconds;
        }
        
        return (sortAscending);
    }
}