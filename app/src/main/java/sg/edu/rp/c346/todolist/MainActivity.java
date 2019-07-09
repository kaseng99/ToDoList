package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ArrayList<List> alTask;

    ListView lvTask;
    Adapter2 adapterToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTask = findViewById(R.id.listView);

        //aaAndroidVersions = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1, alAndroidVersions);
        alTask = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2019,7,1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2019,9,22);


        alTask.add(new List("MSA", date1));
        alTask.add(new List("Go for haircut",date2));


        adapterToDo = new Adapter2(MainActivity.this,R.layout.row, alTask);
        //lvAndroidVersions.setAdapter(aaAndroidVersions);
        lvTask.setAdapter(adapterToDo);
    }
}
