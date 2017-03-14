package testex;

import java.util.Date;

/**
 * Created by mazlumsert on 14/03/2017.
 */
public interface IDateFormatter {

     String getFormattedDate(String timeZone, Date time) throws JokeException;

}
