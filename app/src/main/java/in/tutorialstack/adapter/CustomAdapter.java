package in.tutorialstack.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import in.tutorialstack.listview.R;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String names[];
    String phones[];
    LayoutInflater inflter;

    public CustomAdapter(Context context, String[] names, String[] phones) {
        this.context = context;
        this.names = names;
        this.phones = phones;
        inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.lst_base_adapter_item, null);

        TextView txtName = (TextView) view.findViewById(R.id.txt_name);
        TextView txtPhone = (TextView) view.findViewById(R.id.txt_phone);
        ImageView imgPic = (ImageView) view.findViewById(R.id.img_pic);

        txtName.setText(names[i]);
        txtPhone.setText(phones[i]);

        return view;
    }
}