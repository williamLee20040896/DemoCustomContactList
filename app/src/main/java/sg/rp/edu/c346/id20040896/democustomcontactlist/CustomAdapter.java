package sg.rp.edu.c346.id20040896.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactlist;

    public CustomAdapter(@NonNull Context context,int resource, ArrayList<Contact> object) {
        super(context, resource, object);
        parent_context = context;
        layout_id = resource;
        contactlist = object;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCC = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvNum = rowView.findViewById(R.id.textViewPhoneNum);
        ImageView ivGender = rowView.findViewById(R.id.imageViewGender);

        Contact currentItem = contactlist.get(position);
        tvName.setText(currentItem.getName());
        tvCC.setText("+ " + currentItem.getCountryCode());
        tvNum.setText(currentItem.getContact() + "");
        if(contactlist.get(position).getGender() == 'F'||contactlist.get(position).getGender() == 'f'){
            ivGender.setImageResource(R.drawable.female);
        }
        else if (contactlist.get(position).getGender() == 'M'||contactlist.get(position).getGender() == 'm'){
            ivGender.setImageResource(R.drawable.male);
        }

        return rowView;
    }
}
