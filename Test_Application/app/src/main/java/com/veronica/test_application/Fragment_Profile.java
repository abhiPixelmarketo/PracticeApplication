package com.veronica.test_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Profile extends Fragment {

    Button edit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_profile,null);

        edit= view.findViewById(R.id.edit_profile);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editProfile();
            }
        });

        return view;
    }

    public void editProfile(){
        Intent intent = new Intent(getActivity(),EditProfileActivity.class);
        startActivity(intent);

    }
}
