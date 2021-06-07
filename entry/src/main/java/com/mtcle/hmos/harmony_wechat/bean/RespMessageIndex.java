package com.mtcle.hmos.harmony_wechat.bean;

import com.mtcle.hmos.harmony_wechat.common.BaseBean;

import java.util.List;

public class RespMessageIndex extends BaseBean {

    /**
     * code : 200
     * msg : success
     * data : [{"msgId":"10001","fromUserName":"刘成","fromUserId":"1","fromUserAvatar":"https://pic4.zhimg.com/v2-289751bcec271385b1c515e2bc3a69e5_r.jpg","content":"中午一起吃个饭吧~","time":"刚刚"},{"msgId":"10001","fromUserName":"小薇","fromUserId":"1","fromUserAvatar":"https://tupian.qqw21.com/article/UploadPic/2020-1/202012121242630231.jpg","content":"在吗~","time":"刚刚"},{"msgId":"10001","fromUserName":"小许","fromUserId":"1","fromUserAvatar":"https://img2.woyaogexing.com/2018/11/08/9d20f8de63f2348a!480x480.jpg","content":"跑哪去了，赶紧出来！","time":"刚刚"},{"msgId":"10001","fromUserName":"欧阳酥","fromUserId":"1","fromUserAvatar":"https://img2.woyaogexing.com/2018/11/08/3bd6d92aa92108e5!480x480.jpg","content":"中午一起吃个饭吧~","time":"刚刚"},{"msgId":"10001","fromUserName":"刘成","fromUserId":"1","fromUserAvatar":"https://pic4.zhimg.com/v2-289751bcec271385b1c515e2bc3a69e5_r.jpg","content":"中午一起吃个饭吧~","time":"刚刚"},{"msgId":"10001","fromUserName":"刘成","fromUserId":"1","fromUserAvatar":"https://pic4.zhimg.com/v2-289751bcec271385b1c515e2bc3a69e5_r.jpg","content":"中午一起吃个饭吧~","time":"刚刚"},{"msgId":"10001","fromUserName":"刘成","fromUserId":"1","fromUserAvatar":"https://pic4.zhimg.com/v2-289751bcec271385b1c515e2bc3a69e5_r.jpg","content":"中午一起吃个饭吧~","time":"刚刚"},{"msgId":"10001","fromUserName":"刘成","fromUserId":"1","fromUserAvatar":"https://pic4.zhimg.com/v2-289751bcec271385b1c515e2bc3a69e5_r.jpg","content":"中午一起吃个饭吧~","time":"刚刚"},{"msgId":"10001","fromUserName":"刘成","fromUserId":"1","fromUserAvatar":"https://pic4.zhimg.com/v2-289751bcec271385b1c515e2bc3a69e5_r.jpg","content":"中午一起吃个饭吧~","time":"刚刚"}]
     */

    private int code;
    private String msg;
    /**
     * msgId : 10001
     * fromUserName : 刘成
     * fromUserId : 1
     * fromUserAvatar : https://pic4.zhimg.com/v2-289751bcec271385b1c515e2bc3a69e5_r.jpg
     * content : 中午一起吃个饭吧~
     * time : 刚刚
     */

    private List<WxMessage> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<WxMessage> getData() {
        return data;
    }

    public void setData(List<WxMessage> data) {
        this.data = data;
    }
}
