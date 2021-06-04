package com.mtcle.hmos.harmony_wechat.adapter;

import com.mtcle.hmos.harmony_wechat.ResourceTable;
import com.mtcle.hmos.harmony_wechat.WxMessage;
import com.mtcle.hmos.harmony_wechat.common.CommonProvider;
import com.mtcle.hmos.harmony_wechat.common.ViewHolder;
import ohos.app.Context;

import java.util.List;

public class MessageProvider extends CommonProvider<WxMessage> {
    public MessageProvider(List<WxMessage> data, Context context) {
        super(data, context);
    }

    @Override
    protected void convert(ViewHolder holder, WxMessage item, int position) {

    }

    @Override
    public int getLayoutId() {
        return ResourceTable.Layout_message_item;
    }
}
