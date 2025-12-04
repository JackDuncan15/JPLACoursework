package com.example.courseworkjplapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
public class Dictionary extends AppCompatActivity {

    EditText etxt_search;
    TextView txt_DictionaryDisplay;
    Button btn_search;
    OkHttpClient Client = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);

        etxt_search = (EditText) findViewById(R.id.etxt_search);
        txt_DictionaryDisplay = (TextView) findViewById(R.id.txt_DictionaryDisplay);
        btn_search = (Button) findViewById(R.id.btn_search);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = etxt_search.getText().toString();
                if (query.isEmpty()){
                    txt_DictionaryDisplay.setText("Please enter a search term");
                }
                String url = "https://jisho.org/api/v1/search/words?keyword=" + query;
                Request request = new Request.Builder().url(url).build();

                Client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(@NonNull Call call, @NonNull IOException e) {
                        runOnUiThread(()->txt_DictionaryDisplay.setText("Error: "+e.getMessage()));
                    }

                    @Override
                    public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                        if (!response.isSuccessful()){
                            runOnUiThread(()->txt_DictionaryDisplay.setText("API returned error"));
                        }
                        try{
                            JSONObject json = new JSONObject(response.body().string());
                            JSONArray data = json.getJSONArray("data");

                            if (data.length() == 0){
                                runOnUiThread(()-> txt_DictionaryDisplay.setText("no results found"));
                            }

                            JSONObject first = data.getJSONObject(0);
                            String word = first.getJSONArray("japanese").getJSONObject(0).optString("word","(No Kanji)");
                            String reading = first.getJSONArray("japanese").getJSONObject(0).optString("reading","");

                            JSONArray senses = first.getJSONArray("senses");
                            JSONArray englishDefs = senses.getJSONObject(0).getJSONArray("english_definitions");
                            StringBuilder defs = new StringBuilder();
                            for (int i = 0;i < englishDefs.length();i++){
                                defs.append("- ").append(englishDefs.getString(i)).append("\n");
                            }
                            String result = "Word: " + word + "\n" + "Reading: " + reading + "\n\n" + "Definitions:\n" + defs;

                            runOnUiThread(()-> txt_DictionaryDisplay.setText(result));
                        }catch(Exception e){
                            runOnUiThread(()->txt_DictionaryDisplay.setText("Parsing error: " + e.getMessage()));
                        }
                    }
                });
            }
        });
    }
}