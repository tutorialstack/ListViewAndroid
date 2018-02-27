package in.tutorialstack.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import in.tutorialstack.adapter.CustomAdapter;

public class ListViewBaseAdapter extends AppCompatActivity {

    ListView simpleList;
    String names[] = {"Aman", "Rakesh", "Sunil", "Vikash", "Anil", "Rahul"};
    String phones[] = {"9876543210", "8765432109", "7654321098", "6543210987", "543210987", "4321098765"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_base_adapter);

        simpleList = (ListView) findViewById(R.id.lst_view);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), names, phones);
        simpleList.setAdapter(customAdapter);
    }
}
