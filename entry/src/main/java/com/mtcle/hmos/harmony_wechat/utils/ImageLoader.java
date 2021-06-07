package com.mtcle.hmos.harmony_wechat.utils;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import ohos.agp.components.Image;
import ohos.app.Context;

public class ImageLoader {
    public static void loadImage(Context context, String uri, Image img){
        Glide.with(context)
                .load(uri)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .skipMemoryCache(true)
                .into(img);
    }
}
