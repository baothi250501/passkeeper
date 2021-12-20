package com.example.passkeeper.ui.login;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.passkeeper.R;

public class EnterEmail extends Fragment implements View.OnClickListener {

    private EnterEmailViewModel mViewModel;
    private Button nextBtn;

    public static EnterEmail newInstance() {
        return new EnterEmail();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.enter_email_fragment, container, false);
        nextBtn = view.findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(EnterEmailViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onClick(View view) {
        Navigation.findNavController(view).navigate(R.id.action_enterEmail_to_verifyCode);
    }
}