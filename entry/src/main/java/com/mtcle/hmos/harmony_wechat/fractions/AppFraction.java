package com.mtcle.hmos.harmony_wechat.fractions;

import com.google.gson.Gson;
import com.mtcle.hmos.harmony_wechat.ResourceTable;
import com.mtcle.hmos.harmony_wechat.adapter.MessageProvider;
import com.mtcle.hmos.harmony_wechat.bean.RespMessageIndex;
import com.mtcle.hmos.harmony_wechat.bean.WxMessage;
import com.mtcle.hmos.harmony_wechat.utils.ResourceUtils;
import ohos.aafwk.ability.fraction.Fraction;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.LayoutScatter;
import ohos.agp.components.ListContainer;

import java.util.List;

public class AppFraction extends Fraction {
    private Component component;
    @Override
    protected Component onComponentAttached(LayoutScatter scatter, ComponentContainer container, Intent intent) {
        component=scatter.parse(ResourceTable.Layout_tab_home,container,false);
        return component;
    }

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        initData();
    }

    private void initData(){
        String str= ResourceUtils.getProfileString(getFractionAbility(),ResourceTable.Profile_api_index);
        RespMessageIndex respMessageIndex=new Gson().fromJson(str,RespMessageIndex.class);
        List<WxMessage> datas=respMessageIndex.getData();
        ListContainer list=(ListContainer) getFractionAbility().findComponentById(ResourceTable.Id_message_page_list);
        MessageProvider provider=new MessageProvider(datas,getFractionAbility());
        list.setItemProvider(provider);
    }
}
