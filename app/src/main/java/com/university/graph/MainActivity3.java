package com.university.graph;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.ar.sceneform.ux.ArFragment;
public class MainActivity3 extends AppCompatActivity {
    ArFragment arFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.arFragment);
        arFragment.setOnTapPlaneGlbModel("catenoid.glb");
//                arFragment.setOnTapPlaneGlbModel("https://github.com/codemaker2015/3d-models/blob/master/glb_files/model.glb?raw=true");
    }
}