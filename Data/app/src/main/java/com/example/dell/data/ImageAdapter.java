package com.example.dell.data;

import android.content.Context;
import android.graphics.Matrix;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageAdapter extends PagerAdapter {
    Context context;


    private String[] GalImages = new String[] {
            "http://objects.chopard.com/media/catalog/product/cache/2/thumbnail/361x510/9df78eab33525d08d6e5fb8d27136e95/1/6/168569-3001_01_4.jpg",
            "http://objects.chopard.com/media/catalog/product/cache/2/thumbnail/361x510/9df78eab33525d08d6e5fb8d27136e95/1/6/168569-3001_02_5.jpg",
            "http://objects.chopard.com/media/catalog/product/cache/2/thumbnail/361x510/9df78eab33525d08d6e5fb8d27136e95/1/6/168569-3001_03_4.jpg"

    };
    ImageAdapter(Context context){
        this.context=context;

    }
    @Override
    public int getCount() {
        return GalImages.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
      ImageView  imageView = new ImageView(context);
        int padding = context.getResources().getDimensionPixelSize(R.dimen.padding_medium);
        imageView.setPadding(padding, padding, padding, padding);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        Picasso.with(context).load(GalImages[position]).into(imageView);
        container.addView(imageView, 0);

        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }



}
