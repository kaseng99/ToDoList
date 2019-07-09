package sg.edu.rp.c346.todolist;

import java.util.Calendar;
import java.util.Date;

public class List {
    private String task;
    private Calendar date;

    public List(String task, Calendar date) {
        this.task = task;
        this.date = date;

    }

    public String getTask() {
        return task;
    }

    public Calendar getDate() {
        return date;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString(){
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH) +"/" + date.get(Calendar.YEAR);
return str;
    }

}
