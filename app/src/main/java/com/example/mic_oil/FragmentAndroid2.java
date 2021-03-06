package com.example.mic_oil;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Random;

public class FragmentAndroid2 extends Fragment{

    private void FragmentAndroid2() {}

    public void onAttach(MainActivity activity) {
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_android_2, container, false);

        return view;
    }

    @Override
    public void onViewCreated (View view, Bundle saveInstanceState){
        final ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress_circular);
        final Button goButton = (Button) view.findViewById(R.id.go);
        final EditText login = (EditText) view.findViewById(R.id.login);
        final EditText password = (EditText) view.findViewById(R.id.password);
        final Handler handler = new Handler();

        goButton.setVisibility(View.VISIBLE);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkNull(login, password)) {
                    goButton.setVisibility(View.INVISIBLE);
                    progressBar.setVisibility(View.VISIBLE);
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            Random randInt = new Random();
                            int rand = randInt.nextInt(2);

                            progressBar.setVisibility(View.INVISIBLE);
                            MainActivity.setFragment1(MainActivity.fragment1, MainActivity.fragmentManager);

                            if (rand == 1) {
                                Toast toast = Toast.makeText(getActivity(),
                                        "Успех!", Toast.LENGTH_SHORT);
                                toast.show();
                            }
                            else {
                                Toast toast = Toast.makeText(getActivity(),
                                        "Провал!", Toast.LENGTH_SHORT);
                                toast.show();
                            }
                        }
                    }, 2000);
                }
                else {
                    Toast toast = Toast.makeText(getActivity(),
                            "Попробуйте еще раз.", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }

    public boolean checkNull(EditText login, EditText password) {
        if ((login.getText().length() == 0) || (password.getText().length() == 0))
            return false;
        else
            return true;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}