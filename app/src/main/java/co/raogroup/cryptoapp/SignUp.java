package co.raogroup.cryptoapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import co.raogroup.cryptoapp.databinding.ActivitySignUpBinding;

public class SignUp extends AppCompatActivity {

  ActivitySignUpBinding binding;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivitySignUpBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());


    binding.goToLogin.setOnClickListener(v -> {

      startActivity(new Intent(SignUp.this, Login_activity.class));

    });


  }
}