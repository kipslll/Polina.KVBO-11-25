package lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getFormat(int formatType) {
        SimpleDateFormat sdf;
        if (formatType == 1) {
            sdf = new SimpleDateFormat("dd.MM.yy");
        } else if (formatType == 2) {
            sdf = new SimpleDateFormat("dd MMM yyyy");
        } else {
            sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        }
        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", дата рождения: " + getFormat(2);
    }
}