package java.model;

import java.util.Date;

/**
 * Created by nofuruct on 18.05.15.
 */
public class Report {

    private int id;

    private String message;

    private Date date;

    public Report() {
    }

    public Report(int id, String message, Date date) {
        this.id = id;
        this.message = message;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
