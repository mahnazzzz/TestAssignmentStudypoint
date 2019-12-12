
package interfaces;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;


public interface TeacherFunctions {
    int getMonthDiffirence(LocalDate date1, LocalDate date2);
    LocalDate dateToGregorianCalendar(LocalDate date);
    int daysUntilDeadLine(LocalDate teacherDate, LocalDate semesterDate);
}
