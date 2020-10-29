package com.example.customrecylerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductCustomAdapter extends RecyclerView.Adapter<ProductCustomAdapter.ProductViewHolder> {

    private ArrayList<Product> productArrayList;
    private LayoutInflater layoutInflater;

    public ProductCustomAdapter(ArrayList<Product> productArrayList, Context context) {
        this.productArrayList = productArrayList;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ProductCustomAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new ProductViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductCustomAdapter.ProductViewHolder holder, int position) {
        Product product = productArrayList.get(position);
        holder.imgProduct.setImageResource(product.getImage());
        holder.ratingBar.setRating(product.getRate());

        holder.tvName.setText(product.getName());
        holder.tvPrice.setText(String.valueOf(product.getPrice()));
        holder.tvDiscount.setText(String.valueOf(product.getDiscount()));
        holder.tvPeopleRate.setText(String.valueOf(product.getPeopleRate()));
    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView imgProduct;
        TextView tvName, tvPrice, tvDiscount, tvPeopleRate;
        RatingBar ratingBar;
        ProductCustomAdapter productCustomAdapter;
        public ProductViewHolder(@NonNull View itemView, ProductCustomAdapter adapter) {
            super(itemView);
            imgProduct = itemView.findViewById(R.id.imgProduct);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvDiscount = itemView.findViewById(R.id.tvDiscount);
            ratingBar = itemView.findViewById(R.id.ratingBar);
            tvPeopleRate = itemView.findViewById(R.id.tvPeopleRate);
            productCustomAdapter = adapter;
        }
    }
}
