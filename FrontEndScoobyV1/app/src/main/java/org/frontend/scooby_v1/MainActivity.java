package org.frontend.scooby_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import  android.app.ProgressDialog;
import java.util.*;
import retrofit2.*;
import retrofit2.converter.gson.*;
import android.widget.ListView;
import android.widget.ArrayAdapter;



public class MainActivity extends AppCompatActivity {

    private EditText User;
    private EditText Password;
    private TextView Info;
    private Button LoginButton;
    ListView list;
    ArrayList<String> titles = new ArrayList<>();
    ArrayAdapter arrayAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User= (EditText) findViewById(R.id.etName);
        Password= (EditText) findViewById(R.id.etPassword);
        Info = (TextView) findViewById(R.id.tvInfo);
        LoginButton = (Button) findViewById(R.id.btnLogin);
        //arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,titles);

        //list.setAdapter(arrayAdapter);

        LoginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                validate(User.getText().toString(),Password.getText().toString());
            }
        });

    }
    private void getPosts() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://51.83.70.87:3000/paddock/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PostService postService = retrofit.create(PostService.class);
        Call< List<Post> > call = postService.getPost();

        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                for(Post post : response.body()) {
                    titles.add(post.getTitle());
                    titles.add(post.getBody());
                }
               // arrayAdapter.notifyDataSetChanged();
                for(int i=0;i<titles.size();i++){
                    System.out.println(titles.get(i));
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                System.out.println("Error");
            }
        });
    }



    private void validate(String user, String passwd){
        //Cambiar por validación en backend
        getPosts();
        System.out.println("test");
        /*if(user.equals("admin") && passwd.equals("passwd")){
            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
        }*/
    }
}
