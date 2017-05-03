package lanure.listview;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import java.util.ArrayList;
import java.util.HashMap;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.view.View;

public class MainActivity extends Activity {
    protected ListView lv;
    protected ListAdapter adapter;
    SimpleAdapter Adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> mylist;
    String[] Pil;
    String[] Ltn;
    String[] Gbr;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        Pil = new String[]{"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};

        // Ltn = new String[] {"Anjing Jinak", "Kambing Hutan", "Kucing-Kucingan", "Kuda-kudaan", "Naga Bonar"};
        Gbr = new String[]{Integer.toString(R.drawable.day),
                Integer.toString(R.drawable.day),
                Integer.toString(R.drawable.day),
                Integer.toString(R.drawable.day),
                Integer.toString(R.drawable.day),
                Integer.toString(R.drawable.day),
                Integer.toString(R.drawable.day)};


        mylist = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < Pil.length; i++) {
            map = new HashMap<String, String>();
            map.put("list", Pil[i]);
            //map.put("latin", Ltn[i]);
            map.put("gbr", Gbr[i]);
            mylist.add(map);
        }

        Adapter = new SimpleAdapter(this, mylist, R.layout.layout_isi_lv,
                new String[]{"list", "latin", "gbr"}, new int[]{R.id.tv_nama, R.id.tv_ltn, R.id.imV});
        lv.setAdapter(Adapter);

    }

//    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.activity_main, container, false);
//
//
//        ImageView imageViewHotel = (ImageView) view.findViewById(R.id.imV);
//        imageViewHotel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this ,Coba.class);
//                startActivity(intent);
//
//            }
//        });
//        return view;
//
//    }
}