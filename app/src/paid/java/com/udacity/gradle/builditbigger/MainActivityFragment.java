package com.udacity.gradle.builditbigger;
import android.content.Intent;
import android.mobilestudio.jokeslibrary.LibActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.JokesClass;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static com.udacity.gradle.builditbigger.R.id.bt_tellJoke;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        // Create an ad request. Check logcat output for the hashed device ID to
        // get test ads on a physical device. e.g.

        Button mJoke = (Button) root.findViewById(bt_tellJoke);
        final JokesClass joker = new JokesClass();
        mJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Java Library
                //  Toast.makeText(getActivity(),joker.getJoke() , Toast.LENGTH_SHORT).show();
                // Android Library
                startActivity(new Intent(getActivity(), LibActivity.class).putExtra("joke",joker.getJoke()));
            }
        });
        return root;
    }


}
