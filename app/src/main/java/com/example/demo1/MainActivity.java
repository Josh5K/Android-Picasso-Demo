package com.example.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        String imgURL = "https://images-na.ssl-images-amazon.com/images/I/81Wg7D86ONL._SX425_.jpg";

        //Basic usage
        //By default Picasso will save / load images in cache.
        Picasso.with(MainActivity.this).load(imgURL).into(imageView);

        //Loading from file
        //Picasso.with(MainActivity.this).load(new File("PATH TO FILE")).into(imageView);

        //Doesn't Store in Cache
        //Picasso.with(MainActivity.this).load(imgURL).memoryPolicy(MemoryPolicy.NO_STORE).into(imageView);

        //Doesn't Load from Cache
        //Picasso.with(MainActivity.this).load(imgURL).memoryPolicy(MemoryPolicy.NO_CACHE).into(imageView);

        //Doesn't Load from LocalDisk
        //Picasso.with(MainActivity.this).load(imgURL).networkPolicy(NetworkPolicy.NO_CACHE).into(imageView);

        //Load with placeholder.
        //Picasso.with(MainActivity.this).load(imgURL).placeholder(R.drawable.ic_launcher_foreground).into(imageView);
    }
}
