package com.udacity.kg.appportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  // Helpers
  private void showToast(CharSequence text) {
    Context context = getApplicationContext();
    int duration = Toast.LENGTH_SHORT;
    Toast.makeText(context, text, duration).show();
  }

  // Actions
  public void clickedSpotifyStreamerButton(View view) {
    showToast("This button will launch my Spotify Streamer app!");
  }

  public void clickedFootballScoresButton(View view) {
    showToast("This button will launch my Football Scores app!");
  }

  public void clickedLibraryAppButton(View view) {
    showToast("This button will launch my Library app!");
  }

  public void clickedBuildItBiggerButton(View view) {
    showToast("This button will launch my Build It Bigger app!");
  }

  public void clickedXYZReaderButton(View view) {
    showToast("This button will launch my XYZ Reader app!");
  }

  public void clickedCapstoneButton(View view) {
    showToast("This button will launch my capstone app!");
  }
}
