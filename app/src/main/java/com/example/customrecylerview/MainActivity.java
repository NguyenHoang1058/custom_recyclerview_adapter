package com.example.customrecylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rclProduct;
    private ProductCustomAdapter productCustomAdapter;
    private ArrayList<Product> productArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial product array list
        productArrayList = new ArrayList<>();
        //add item to productArrayList
        productArrayList.add(
                new Product("Dây cáp ethernet xanh", R.drawable.bluecable, 12000, 25, 4, 15));
        productArrayList.add(
                new Product("Dây cáp ethernet đen", R.drawable.bluecable, 25000, 14, 5, 20));
        productArrayList.add(
                new Product("Dây cáp ethernet", R.drawable.ethernetcable, 30000, 39, 3, 25));
        productArrayList.add(
                new Product("Dây cáp", R.drawable.bluecable, 30000, 39, 3, 25));
        productArrayList.add(
                new Product("Dây cáp ethernet", R.drawable.ethernetcable, 30000, 39, 3, 25));
        productArrayList.add(
                new Product("Dây cáp", R.drawable.cable, 30000, 39, 3, 25));
        productArrayList.add(
                new Product("Dây cáp ethernet đen", R.drawable.blackcable, 25000, 14, 5, 20));
        productArrayList.add(
                new Product("Dây cáp ethernet xanh", R.drawable.bluecable, 12000, 25, 4, 15));
        productArrayList.add(
                new Product("Dây cáp", R.drawable.cable, 30000, 39, 3, 25));

        rclProduct = findViewById(R.id.rclMain);

        productCustomAdapter = new ProductCustomAdapter(productArrayList,this);

        rclProduct.setAdapter(productCustomAdapter);
        rclProduct.setLayoutManager(new GridLayoutManager(this,2));
    }
}