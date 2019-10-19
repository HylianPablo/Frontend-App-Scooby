package org.frontend.scooby_v1;

import android.app.Application;

public class Model extends Application {
    private boolean area[];
    private String todoNotes;

    public Model(){
        area=new boolean[8];
        for(int i=0;i<8;i++){
            area[i]=false;
        }
        //area[0]=false;
        todoNotes="";
    }

    public void setBool(boolean b, int i){
        area[i]=b;
    }

    public boolean getBool(int i){
        return area[i];
    }

    public void setTodo(String s){
        todoNotes=s;
    }

    public String getTodo(){
        return todoNotes;
    }
}
