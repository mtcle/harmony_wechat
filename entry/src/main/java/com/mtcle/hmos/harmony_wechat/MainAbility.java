package com.mtcle.hmos.harmony_wechat;

import com.mtcle.hmos.harmony_wechat.fractions.AppFraction;
import com.mtcle.hmos.harmony_wechat.fractions.ContactFraction;
import com.mtcle.hmos.harmony_wechat.fractions.FindFraction;
import com.mtcle.hmos.harmony_wechat.fractions.MeFraction;
import ohos.aafwk.ability.fraction.Fraction;
import ohos.aafwk.ability.fraction.FractionAbility;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.Image;
import ohos.agp.components.Text;
import ohos.agp.utils.Color;

public class MainAbility extends FractionAbility implements Component.ClickedListener {
    private DirectionalLayout job_pagedl, company_page_dl, chat_page_dl, mine_page_dl;

    private Image img_wx;
    private Image img_contact;
    private Image img_find;
    private Image mine_page_image;
    private Text job_pagetext, company_page_text, chat_page_text, mine_page_text;

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        setUIContent(ResourceTable.Layout_ability_maintab);
        initComponent();
        layoutShow(0);
    }


    private void initComponent() {
        img_wx = (Image) findComponentById(ResourceTable.Id_img_wx);
        img_contact = (Image) findComponentById(ResourceTable.Id_img_contact);
        img_find = (Image) findComponentById(ResourceTable.Id_img_find);
        mine_page_image = (Image) findComponentById(ResourceTable.Id_mine_page_image);
        job_pagetext = (Text) findComponentById(ResourceTable.Id_tv_wx);
        company_page_text = (Text) findComponentById(ResourceTable.Id_company_page_text);
        chat_page_text = (Text) findComponentById(ResourceTable.Id_chat_page_text);
        mine_page_text = (Text) findComponentById(ResourceTable.Id_tv_me);
        job_pagedl = (DirectionalLayout) findComponentById(ResourceTable.Id_dl_wx);
        company_page_dl = (DirectionalLayout) findComponentById(ResourceTable.Id_company_page_dl);
        chat_page_dl = (DirectionalLayout) findComponentById(ResourceTable.Id_chat_page_dl);
        mine_page_dl = (DirectionalLayout) findComponentById(ResourceTable.Id_mine_page_dl);
        job_pagedl.setClickedListener(this);
        company_page_dl.setClickedListener(this);
        chat_page_dl.setClickedListener(this);
        mine_page_dl.setClickedListener(this);
    }

    @Override
    public void onClick(Component component) {
        switch (component.getId()) {
            case ResourceTable.Id_dl_wx:
                img_wx.setPixelMap(ResourceTable.Media_ic_weixin_selected);

                img_contact.setPixelMap(ResourceTable.Media_ic_contacts_normal);
                img_find.setPixelMap(ResourceTable.Media_ic_find_normal);
                mine_page_image.setPixelMap(ResourceTable.Media_ic_me_normal);

                job_pagetext.setTextColor(Color.GREEN);
                company_page_text.setTextColor(Color.GRAY);
                chat_page_text.setTextColor(Color.GRAY);
                mine_page_text.setTextColor(Color.GRAY);
                layoutShow(0);
                break;
            case ResourceTable.Id_company_page_dl:
                img_wx.setPixelMap(ResourceTable.Media_ic_weixin_normal);
                img_contact.setPixelMap(ResourceTable.Media_ic_contacts_selected);
                img_find.setPixelMap(ResourceTable.Media_ic_find_normal);
                mine_page_image.setPixelMap(ResourceTable.Media_ic_me_normal);
                job_pagetext.setTextColor(Color.GRAY);
                company_page_text.setTextColor(Color.GREEN);
                chat_page_text.setTextColor(Color.GRAY);
                mine_page_text.setTextColor(Color.GRAY);
                layoutShow(1);
                break;
            case ResourceTable.Id_chat_page_dl:
                img_wx.setPixelMap(ResourceTable.Media_ic_weixin_normal);
                img_contact.setPixelMap(ResourceTable.Media_ic_contacts_normal);
                img_find.setPixelMap(ResourceTable.Media_ic_find_selected);
                mine_page_image.setPixelMap(ResourceTable.Media_ic_me_normal);
                job_pagetext.setTextColor(Color.GRAY);
                company_page_text.setTextColor(Color.GRAY);
                chat_page_text.setTextColor(Color.GREEN);
                mine_page_text.setTextColor(Color.GRAY);
                layoutShow(2);
                break;
            case ResourceTable.Id_mine_page_dl:
                img_wx.setPixelMap(ResourceTable.Media_ic_weixin_normal);
                img_contact.setPixelMap(ResourceTable.Media_ic_contacts_normal);
                img_find.setPixelMap(ResourceTable.Media_ic_find_normal);
                mine_page_image.setPixelMap(ResourceTable.Media_ic_me_selected);
                job_pagetext.setTextColor(Color.GRAY);
                company_page_text.setTextColor(Color.GRAY);
                chat_page_text.setTextColor(Color.GRAY);
                mine_page_text.setTextColor(Color.GREEN);
                layoutShow(3);
                break;
            default:
                break;
        }
    }

    private Fraction[] fractions = new Fraction[]{new AppFraction(), new ContactFraction(), new FindFraction(), new MeFraction()};

    private void layoutShow(int index) {
        if (index >= 0 && index < fractions.length - 1) {
            getFractionManager()
                    .startFractionScheduler()
                    .replace(ResourceTable.Id_mainstack, fractions[index])
                    .submit();
        }
    }
}
