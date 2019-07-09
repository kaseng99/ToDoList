package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Adapter2 extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<List> versionList;

    public Adapter2(Context context , int resource , ArrayList<List> objects){
        super(context, resource , objects);

        parent_context = context;
        layout_id = resource;
        versionList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTask = rowView.findViewById(R.id.textViewTask);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);




        // Obtain the Android Version information based on the position
        List currentVersion = versionList.get(position);

        // Set values to the TextView to display the corresponding information


        tvTask.setText(currentVersion.getTask());
        tvDate.setText(currentVersion.getDate().getDateString());


        return rowView;
    }
}
