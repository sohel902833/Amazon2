package com.example.likeamazon.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.likeamazon.Interface.ItemClickListner;
import com.example.likeamazon.R;

public class CartViewHolder  extends RecyclerView.ViewHolder  implements View.OnClickListener {


    public TextView txtProductname,txtProductPrice,txtProductQuantity;
    private ItemClickListner itemClickListner;



    public CartViewHolder(@NonNull View itemView) {
        super(itemView);

        txtProductname=itemView.findViewById(R.id.cart_product_name);
        txtProductPrice=itemView.findViewById(R.id.cart_product_price);
        txtProductQuantity=itemView.findViewById(R.id.cart_product_quantity);





    }

    @Override
    public void onClick(View v) {
            itemClickListner.onClick(v,getAdapterPosition(),false);
    }

    public void setItemClickListner(ItemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;
    }
}
