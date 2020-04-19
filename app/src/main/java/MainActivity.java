import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

import com.baidu.mapapi.SDKInitializer;

import com.baidu.mapapi.map.MapView;

public class MainActivity extends AppCompatActivity {
    private MapViewmapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            SDKInitializer.initialize(getApplicationContext());
        }
        catch (Exception e){
            Log.e("Error",e.getMessage());
        }
        setContentView(R.layout.activity_main);
        mapView=findViewById(R.id.mapView);
    }
}