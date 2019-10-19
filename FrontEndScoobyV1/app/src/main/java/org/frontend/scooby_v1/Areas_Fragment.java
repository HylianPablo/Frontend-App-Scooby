package org.frontend.scooby_v1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Areas_Fragment extends Fragment implements View.OnClickListener{
    private ArrayList<Button> arrBut=new ArrayList<>();
    private Button Patio1;
    private Button Patio2;
    private Button Patio3;
    private Button Patio4;
    private Button Patio5;
    private Button Patio6;
    private Button Patio7;
    private Button Abuelos;

    private Button Reset;
    private View view;

    public Areas_Fragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //view=(View) getView.inflate(R.layout.activity_second,null);
        view = inflater.inflate(R.layout.fragment_dummy, container, false);
        Patio1= (Button)view.findViewById(R.id.area1Button);
        Patio2=(Button)view.findViewById(R.id.area2Button);
        Patio3=(Button)view.findViewById(R.id.area3Button);
        Patio4=(Button)view.findViewById(R.id.area4Button);
        Patio5=(Button)view.findViewById(R.id.area5Button);
        Patio6=(Button)view.findViewById(R.id.area6Button);
        Patio7=(Button)view.findViewById(R.id.area7Button);
        Abuelos=(Button)view.findViewById(R.id.areaGrandpaButton);
        Reset= (Button) view.findViewById(R.id.resetButton);

        Patio1.setOnClickListener(this);
        Patio2.setOnClickListener(this);
        Patio3.setOnClickListener(this);
        Patio4.setOnClickListener(this);
        Patio5.setOnClickListener(this);
        Patio6.setOnClickListener(this);
        Patio7.setOnClickListener(this);
        Abuelos.setOnClickListener(this);
        Reset.setOnClickListener(this);

        arrBut.add(Patio1);
        arrBut.add(Patio2);
        arrBut.add(Patio3);
        arrBut.add(Patio4);
        arrBut.add(Patio5);
        arrBut.add(Patio6);
        arrBut.add(Patio7);
        arrBut.add(Abuelos);

        updateState();
        return view;
        //return inflater.inflate(R.layout.fragment_dummy, container, false);
    }

    public void onClick(View v){
        System.out.println(v.getId());
        switch(v.getId()){
            case R.id.area1Button:
                if(((Model)this.getActivity().getApplication()).getBool(0)) {
                    Patio1.setText("PATIO 1 - SUCIO");
                    Patio1.setBackgroundResource(R.color.colorAccent);
                    ((Model) this.getActivity().getApplication()).setBool(false,0);
                }else{
                    Patio1.setText("PATIO 1 - LIMPIO");
                    Patio1.setBackgroundResource(R.color.colorPrimary);
                    ((Model) this.getActivity().getApplication()).setBool(true,0);
                }
                break;
            case R.id.area2Button:
                if(((Model)this.getActivity().getApplication()).getBool(1)) {
                    Patio2.setText("PATIO 2 - SUCIO");
                    Patio2.setBackgroundResource(R.color.colorAccent);
                    ((Model) this.getActivity().getApplication()).setBool(false,1);
                }else{
                    Patio2.setText("PATIO 2 - LIMPIO");
                    Patio2.setBackgroundResource(R.color.colorPrimary);
                    ((Model) this.getActivity().getApplication()).setBool(true,1);
                }
                break;
            case R.id.area3Button:
                if(((Model)this.getActivity().getApplication()).getBool(2)) {
                    Patio3.setText("PATIO 3 - SUCIO");
                    Patio3.setBackgroundResource(R.color.colorAccent);
                    ((Model) this.getActivity().getApplication()).setBool(false,2);
                }else{
                    Patio3.setText("PATIO 3 - LIMPIO");
                    Patio3.setBackgroundResource(R.color.colorPrimary);
                    ((Model) this.getActivity().getApplication()).setBool(true,2);
                }
                break;
            case R.id.area4Button:
                if(((Model)this.getActivity().getApplication()).getBool(3)) {
                    Patio4.setText("PATIO 4 - SUCIO");
                    Patio4.setBackgroundResource(R.color.colorAccent);
                    ((Model) this.getActivity().getApplication()).setBool(false,3);
                }else{
                    Patio4.setText("PATIO 4 - LIMPIO");
                    Patio4.setBackgroundResource(R.color.colorPrimary);
                    ((Model) this.getActivity().getApplication()).setBool(true,3);
                }
                break;
            case R.id.area5Button:
                if(((Model)this.getActivity().getApplication()).getBool(4)) {
                    Patio5.setText("PATIOS 5 - SUCIOS");
                    Patio5.setBackgroundResource(R.color.colorAccent);
                    ((Model) this.getActivity().getApplication()).setBool(false,4);
                }else{
                    Patio5.setText("PATIOS 5 - LIMPIOS");
                    Patio5.setBackgroundResource(R.color.colorPrimary);
                    ((Model) this.getActivity().getApplication()).setBool(true,4);
                }
                break;
            case R.id.area6Button:
                if(((Model)this.getActivity().getApplication()).getBool(5)) {
                    Patio6.setText("PATIOS 6 - SUCIOS");
                    Patio6.setBackgroundResource(R.color.colorAccent);
                    ((Model) this.getActivity().getApplication()).setBool(false,5);
                }else{
                    Patio6.setText("PATIOS 6 - LIMPIOS");
                    Patio6.setBackgroundResource(R.color.colorPrimary);
                    ((Model) this.getActivity().getApplication()).setBool(true,5);
                }
                break;
            case R.id.area7Button:
                if(((Model)this.getActivity().getApplication()).getBool(6)) {
                    Patio7.setText("PATIOS 7 - SUCIOS");
                    Patio7.setBackgroundResource(R.color.colorAccent);
                    ((Model) this.getActivity().getApplication()).setBool(false,6);
                }else{
                    Patio7.setText("PATIOS 7 - LIMPIOS");
                    Patio7.setBackgroundResource(R.color.colorPrimary);
                    ((Model) this.getActivity().getApplication()).setBool(true,6);
                }
                break;
            case R.id.areaGrandpaButton:
                if(((Model)this.getActivity().getApplication()).getBool(7)) {
                    Abuelos.setText("PATIO ABUELOS - SUCIO");
                    Abuelos.setBackgroundResource(R.color.colorAccent);
                    ((Model) this.getActivity().getApplication()).setBool(false,7);
                }else{
                    Abuelos.setText("PATIO ABUELOS - LIMPIO");
                    Abuelos.setBackgroundResource(R.color.colorPrimary);
                    ((Model) this.getActivity().getApplication()).setBool(true,7);
                }
                break;
            case R.id.resetButton:
                for(int i=0;i<4;i++) {
                    arrBut.get(i).setText("PATIO "+(i+1)+" - SUCIO");
                    arrBut.get(i).setBackgroundResource(R.color.colorAccent);
                }
                for(int i=4;i<7;i++) {
                    arrBut.get(i).setText("PATIOS "+(i+1)+" - SUCIOS");
                    arrBut.get(i).setBackgroundResource(R.color.colorAccent);
                }
                arrBut.get(7).setText("PATIO ABUELOS - SUCIO");
                arrBut.get(7).setBackgroundResource(R.color.colorAccent);
                for(int j=0;j<8;j++){
                    ((Model)this.getActivity().getApplication()).setBool(false,j);
                }
                break;
            default:
                //Probablemente se pueda quitar al debuggear
                Patio1.setText("Error");
                break;
        }

    }

    public void updateState(){
        for(int i=0;i<4;i++) {
            if (((Model) this.getActivity().getApplication()).getBool(i)) {
                arrBut.get(i).setText("PATIO "+(i+1)+" - LIMPIO");
                arrBut.get(i).setBackgroundResource(R.color.colorPrimary);
            } else {
                arrBut.get(i).setText("PATIO "+(i+1)+" - SUCIO");
                Patio1.setBackgroundResource(R.color.colorAccent);
            }
        }
        for(int i=4;i<7;i++) {
            if (((Model) this.getActivity().getApplication()).getBool(i)) {
                arrBut.get(i).setText("PATIOS "+(i+1)+" - LIMPIOS");
                arrBut.get(i).setBackgroundResource(R.color.colorPrimary);
            } else {
                arrBut.get(i).setText("PATIOS "+(i+1)+" - SUCIOS");
                Patio1.setBackgroundResource(R.color.colorAccent);
            }
        }
        if (((Model) this.getActivity().getApplication()).getBool(7)) {
            arrBut.get(7).setText("PATIO ABUELOS - LIMPIO");
            arrBut.get(7).setBackgroundResource(R.color.colorPrimary);
        } else {
            arrBut.get(7).setText("PATIO ABUELOS - SUCIO");
            Patio1.setBackgroundResource(R.color.colorAccent);
        }
    }

}
