package com.mtcle.hmos.harmony_wechat.common;

import ohos.agp.components.Component;
import ohos.agp.components.Image;
import ohos.agp.components.LayoutScatter;
import ohos.agp.components.Text;
import ohos.app.Context;

import java.util.HashMap;
import java.util.Map;

/**
 * ViewHolder
 */
public class ViewHolder {
    /**
     * convertView
     */
    private final Component convertView;
    private final Map<Integer, Component> views = new HashMap<>();

    /**
     * constructor of ViewHolder
     *
     * @param convertView convertView
     */
    private ViewHolder(Component convertView) {
        this.convertView = convertView;
        convertView.setTag(this);
    }

    /**
     * Use singleton pattern to avoid multiple static classes
     *
     * @param context     context
     * @param convertView convertView
     * @param resource    resource
     * @return CommentViewHolder
     */
    public static ViewHolder getCommentViewHolder(Context context, Component convertView, int resource) {
        if (convertView == null) {
            return new ViewHolder(LayoutScatter.getInstance(context).parse(resource, null, false));
        } else {
            return (ViewHolder) convertView.getTag();
        }
    }

    /**
     * getConvertView
     *
     * @return convertView
     */
    public Component getConvertView() {
        return convertView;
    }

    /**
     * According to generics, specify the type of view
     *
     * @param resId resId
     * @return T
     */
    @SuppressWarnings("unchecked")
    public <T extends Component> T getView(int resId) {
        Component view = views.get(resId);
        if (view == null) {
            view = convertView.findComponentById(resId);
            views.put(resId, view);
        }
        return (T) view;
    }

    /**
     * set text
     *
     * @param viewId viewId
     * @param text   text
     * @return ViewHolder
     */
    public ViewHolder setText(int viewId, String text) {
        Text tv = getView(viewId);
        tv.setText(text);
        return this;
    }

    /**
     * set image
     *
     * @param viewId viewId
     * @param resId  ImageResource
     * @return ViewHolder
     */
    public ViewHolder setImageResource(int viewId, int resId) {
        Image image = getView(viewId);
        image.setPixelMap(resId);
        image.setScaleMode(Image.ScaleMode.STRETCH);
        return this;
    }

    /**
     * set onClick Listener
     *
     * @param viewId   viewId
     * @param listener listener
     * @return ViewHolder
     */
    public ViewHolder setOnClickListener(int viewId, Component.ClickedListener listener) {
        Component comp = getView(viewId);
        comp.setClickedListener(listener);
        return this;
    }

    /**
     * set OnTouch Listener
     *
     * @param viewId   viewId
     * @param listener listener
     * @return ViewHolder
     */
    public ViewHolder setOnTouchListener(int viewId, Component.TouchEventListener listener) {
        Component comp = getView(viewId);
        comp.setTouchEventListener(listener);
        return this;
    }
}
