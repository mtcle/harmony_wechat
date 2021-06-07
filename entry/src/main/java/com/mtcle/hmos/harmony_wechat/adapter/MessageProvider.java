package com.mtcle.hmos.harmony_wechat.adapter;

import com.mtcle.hmos.harmony_wechat.ResourceTable;
import com.mtcle.hmos.harmony_wechat.bean.WxMessage;
import com.mtcle.hmos.harmony_wechat.common.CommonProvider;
import com.mtcle.hmos.harmony_wechat.common.ViewHolder;
import com.mtcle.hmos.harmony_wechat.utils.ImageLoader;
import ohos.agp.components.Image;
import ohos.app.Context;

import java.util.List;

/**
 * 类似android的 adapter 一样的用法，使用holder提高性能
 */
public class MessageProvider extends CommonProvider<WxMessage> {
    public MessageProvider(List<WxMessage> data, Context context) {
        super(data, context);
    }

    @Override
    protected void convert(ViewHolder holder, WxMessage item, int position) {
        Image image=holder.getView(ResourceTable.Id_img_icon);
        ImageLoader.loadImage(context,item.getFromUserAvatar(),image);
        holder.setText(ResourceTable.Id_tv_msg_time,item.getTime());
        holder.setText(ResourceTable.Id_message_nicknametext,item.getFromUserName());
        holder.setText(ResourceTable.Id_msg_text,item.getContent());
    }

    @Override
    public int getLayoutId() {
        return ResourceTable.Layout_message_item;
    }
}
