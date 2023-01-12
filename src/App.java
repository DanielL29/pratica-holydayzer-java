public class App {
    public static void main(String[] args) {
        Holiday[] holidays = new Holiday[]{
            new Holiday("01/01/2023", "Confraternizacao mundial"),
            new Holiday("21/02/2023", "Carnaval"),
            new Holiday("17/04/2023", "Pascoa"),
            new Holiday("21/04/2023", "Tiradentes"),
            new Holiday("01/05/2023", "Dia do trabalho"),
            new Holiday("08/06/2023", "Corpus Christi"),
            new Holiday("07/09/2023", "Independencia do Brasil"),
            new Holiday("12/10/2023", "Nossa Senhora Aparecida"),
            new Holiday("02/11/2023", "Finados"),
            new Holiday("15/11/2023", "Proclamacao da Republica"),
            new Holiday("25/12/2023", "Natal")
        };

        Holiday holiday = new Holiday();

        for (int i = 0; i < holidays.length; i++) {
            holiday.addHoliday(holidays[i]);
        }

        holiday.findHoliday("13/09/2023");
        holiday.findHoliday("25/12/2023");
        holiday.showHolidays();
    }
}
