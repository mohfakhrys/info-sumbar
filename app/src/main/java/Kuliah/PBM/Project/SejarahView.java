package Kuliah.PBM.Project;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class SejarahView extends AppCompatActivity{

    private ListView listView;
    private String JSON_STRING;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah_view);
        listView = (ListView) findViewById(R.id.listView);
        getJSON();
    }

    private void showEmployee(){
        JSONObject jsonObject = null;
        ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String, String>>();
        try {
            jsonObject = new JSONObject(JSON_STRING);
            JSONArray result = jsonObject.getJSONArray(konfigurasi.TAG_JSON_ARRAY);

            for(int i = 0; i<result.length(); i++){
                JSONObject jo = result.getJSONObject(i);
                String sejarah = jo.getString(konfigurasi.TAG_SEJARAH);

                HashMap<String,String> employees = new HashMap<>();
                employees.put(konfigurasi.TAG_SEJARAH,sejarah);
                list.add(employees);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ListAdapter adapter = new SimpleAdapter(
                SejarahView.this, list, R.layout.activity_sejarah_list,
                new String[]{konfigurasi.TAG_SEJARAH},
                new int[]{ R.id.sejarah});

        listView.setAdapter(adapter);
    }

    private void getJSON(){
        class GetJSON extends AsyncTask<Void,Void,String> {

            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(SejarahView.this,"Mengambil Data","Mohon Tunggu...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                JSON_STRING = s;
                showEmployee();
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequest(konfigurasi.URL_GET_SEJARAH);
                return s;
            }
        }
        GetJSON gj = new GetJSON();
        gj.execute();
    }
}
