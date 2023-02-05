package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SettingCurrentDate {

    private Date date;

public String date(){
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
    String presentDate = formatter.format(date);
    return presentDate;
}
}
