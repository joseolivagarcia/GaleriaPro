package joseoliva.com.gallerypro;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapterViajes extends PagerAdapter {

    private TypedArray images;
    private LayoutInflater layoutInflater;

    public ImageAdapterViajes(Context context){

        images = context.getResources().obtainTypedArray(R.array.viajesImages);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        View itemView = layoutInflater.inflate(R.layout.element_image, container,false);
        ImageView image = itemView.findViewById(R.id.item_image);
        image.setImageDrawable(images.getDrawable(position));
        ((ViewGroup) image.getParent()).removeView(image);
        container.addView(image);
        return image;
    }


    @Override
    public int getCount() {
        return images.length();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container,int position, Object object){
        container.removeView((ImageView) object);
    }
}
