package com.mtcle.hmos.harmony_wechat;

import com.mtcle.hmos.harmony_wechat.utils.DebugUtils;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.app.Context;

/**
 * 本页技术、页面跳转
 */
public class SplashAbility extends Ability {
    private Context mContext;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        mContext = this;
        setUIContent(ResourceTable.Layout_ability_splash);


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000l);
                    DebugUtils.debug("启动");
                    toMain();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

//        findComponentById(ResourceTable.Id_text_helloworld).setClickedListener(new Component.ClickedListener() {
//            @Override
//            public void onClick(Component component) {
//
//            }
//        });

    }

    private void toMain() {
        /**
         * 1、ability 之间跳转使用intent，类似android的 activity
         * 2、abilitySlice 之间跳转使用 present（new B_Ability_Slice(),Intent）
         */
        Intent intent1 = new Intent();
        Operation operation = new Intent.OperationBuilder().withBundleName(mContext.getBundleName()).withAbilityName(MainAbility.class).build();
        intent1.setOperation(operation);
        startAbility(intent1);
        terminateAbility();//关闭当前页面
    }
}
