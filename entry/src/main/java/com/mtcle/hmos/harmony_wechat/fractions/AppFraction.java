package com.mtcle.hmos.harmony_wechat.fractions;

import com.mtcle.hmos.harmony_wechat.ResourceTable;
import ohos.aafwk.ability.fraction.Fraction;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.LayoutScatter;

public class AppFraction extends Fraction {
    @Override
    protected Component onComponentAttached(LayoutScatter scatter, ComponentContainer container, Intent intent) {
        Component component=scatter.parse(ResourceTable.Layout_tab_home,container,false);
        return component;
    }

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
    }
}
