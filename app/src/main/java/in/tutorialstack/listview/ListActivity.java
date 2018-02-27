package in.tutorialstack.listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView lstView;
    String names[] = {"Aman", "Rakesh", "Sunil", "Vikash", "Anil", "Rahul"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lstView = (ListView) findViewById(R.id.lst_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.lst_view_item, R.id.txt_name, names);
        lstView.setAdapter(arrayAdapter);
    }

    public void callCustomAdapter(View view) {
        Intent intent = new Intent(ListActivity.this, ListViewBaseAdapter.class);
        startActivity(intent);
    }
}