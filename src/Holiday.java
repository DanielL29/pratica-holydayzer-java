import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Holiday {
    private Logger logger = Logger.getLogger(Holiday.class.getName());
    private String date;
    private String holidayName;
    private List<Holiday> holidayArray = new ArrayList<>();

    public Holiday() {}

    public Holiday(String date, String holidayName) {
        this.date = date;
        this.holidayName = holidayName;
    }

    public String getDate() {
        return this.date;
    }

    public String getHolidayName() {
        return this.holidayName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public void addHoliday(Holiday holiday) {
        this.holidayArray.add(holiday);
    }

    public void findHoliday(String date) {
        String holidayMessage = "";

        for (int i = 0; i < this.holidayArray.size(); i++) {
            Holiday holiday = this.holidayArray.get(i);

            if (Objects.equals(holiday.date, date)) {
                holidayMessage = "\nNa data " + holiday.date + " e comemorado o feriado: " + holiday.holidayName + "\n";
            }
        }

        if (Objects.equals(holidayMessage, "")) {
            holidayMessage = "\nNao existe feriado com esta data no banco de dados\n";
        }

        logger.log(Level.INFO, holidayMessage);
    }

    public void showHolidays() {
        StringBuilder holidaysMessage = new StringBuilder();

        for (int i = 0; i < this.holidayArray.size(); i++) {
            Holiday holiday = this.holidayArray.get(i);

            holidaysMessage.append(holiday.date + " => " + holiday.holidayName + "\n");
        }

        logger.log(Level.INFO, holidaysMessage.toString());
    }
}