package co.raogroup.cryptoapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import co.raogroup.cryptoapp.databinding.ActivityLoginBinding;

public class Login_activity extends AppCompatActivity {

  ActivityLoginBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityLoginBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    binding.goToSignUp.setOnClickListener(v -> {
      startActivity(new Intent(Login_activity.this, SignUp.class));
    });

  }
}