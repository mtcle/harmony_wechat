package com.mtcle.hmos.harmony_wechat.common;

import ohos.agp.components.BaseItemProvider;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.app.Context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * CommonProvider
 */
public abstract class CommonProvider<T> extends BaseItemProvider {
    /**
     * context
     */
    protected final Context context;
    /**
     * layout id
     */
    protected final int layoutId;
    /**
     * data
     */
    protected List<T> data;

    /**
     * constructor of CommonProvider
     *
     * @param data     data
     * @param context  context
     */
    public CommonProvider(List<T> data, Context context) {
        this.data = data;
        this.context = context;
        this.layoutId = getLayoutId();
    }

    @Override
    public int getCount() {
        return data != null ? data.size() : 0;
    }

    /**
     * return data
     *
     * @param position position
     * @return data
     */
    @Override
    public T getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Component getComponent(int position, Component component, ComponentContainer parent) {
        ViewHolder holder = ViewHolder.getCommentViewHolder(context, component, layoutId);

        convert(holder, getItem(position), position);
        return holder.getConvertView();
    }

    /**
     * convert to a new Collection,contains clear it
     *
     * @param holder   holder
     * @param item     item
     * @param position position
     */
    protected abstract void convert(ViewHolder holder, T item, int position);
    public abstract int getLayoutId();
    /**
     * convert to a new Collection,contains clear it
     *
     * @param dataList new Collection
     */
    public void replace(Collection<T> dataList) {
        if (dataList == null) {
            return;
        }
        data = new ArrayList<>();
        data.addAll(dataList);
        notifyDataChanged();
    }
}
