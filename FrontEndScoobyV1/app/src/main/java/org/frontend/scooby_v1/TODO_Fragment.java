package org.frontend.scooby_v1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.app.Activity;

public class TODO_Fragment extends Fragment {
    public EditText todo;
    public View view;


    public TODO_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_todo, container, false);
        final Activity act = this.getActivity();
        todo=view.findViewById(R.id.todoList);
        String sModel=((Model) this.getActivity().getApplication()).getTodo();
        todo.setText(sModel);


        Thread updateText=new Thread(new Runnable(){
            public void run(){
                while(true){
                    try {
                        Thread.sleep(2000);
                    }catch(Exception e){}
                    ((Model) act.getApplication()).setTodo(todo.getText().toString());

                }

            }
        });
        updateText.start();
        //((Model) this.getActivity().getApplication()).setTodo(todo.getText().toString());
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_todo, container, false);
        return view;
    }
}

