package com.example.dm2.aplicacionexamengooglemaps;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private final LatLng CiudadJardin= new LatLng(42.84057601472622, -2.674350649999951);
    private final LatLng restaurante= new LatLng(42.8386418, -2.6724073);
    private final LatLng hospital= new LatLng(42.8371098, -2.679343);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        mMap.addMarker(new MarkerOptions().position(CiudadJardin).title("Ciudad Jardin")).setIcon(BitmapDescriptorFactory.fromResource(android.R.drawable.ic_menu_compass));
        mMap.addMarker(new MarkerOptions().position(restaurante).title("Restaurante")).setIcon(BitmapDescriptorFactory.fromResource(android.R.drawable.ic_menu_add));
        mMap.addMarker(new MarkerOptions().position(hospital).title("Hospital")).setIcon(BitmapDescriptorFactory.fromResource(android.R.drawable.alert_light_frame));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CiudadJardin));
    }
}
