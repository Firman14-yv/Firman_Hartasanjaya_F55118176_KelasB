package com.firman.ujian;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

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
     * we just add a marker near Paluabara, Palu.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in paluabara and move the camera
        LatLng paluabara = new LatLng(-0.8757758091782569, 119.88242721580174);
        mMap.addMarker(new MarkerOptions().position(paluabara).title("Saya berada Di Paluabara Swimming Pool"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(paluabara));

        LatLng cafe = new LatLng(-0.8740645005659857, 119.883641868552);
        mMap.addMarker(new MarkerOptions().position(cafe).title("Paluabara Cafe"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cafe));


        mMap.addPolyline(new PolylineOptions().add(
                paluabara,
                new LatLng(-0.8757758091782569, 119.88242721580174),
                new LatLng(-0.8755462323030629, 119.88235325598004),
                new LatLng(-0.87546694232527, 119.88262584710104),
                new LatLng(-0.8754039495173873, 119.8827139579644),
                new LatLng(-0.8753480526562439, 119.88277644009267),
                new LatLng(-0.8751051817802817, 119.88328006579142),
                new LatLng(-0.8751051817802817, 119.88375586120262),
                new LatLng(-0.8750001399086912, 119.88382866976158),
                new LatLng(-0.874867311813889, 119.8838252480334),
                new LatLng(-0.8744014830860101, 119.88348822628383),
                new LatLng(-0.8740595449404669, 119.88363691234981),
                cafe
                ).width(10)
                        .color(Color.BLUE)

        );
    }
}