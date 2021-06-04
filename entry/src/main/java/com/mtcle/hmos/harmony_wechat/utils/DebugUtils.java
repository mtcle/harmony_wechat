package com.mtcle.hmos.harmony_wechat.utils;

import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class DebugUtils {
    private static final int LOG_LABEL_TYPE = HiLog.LOG_APP;
    private static final int LOG_LABEL_DOMAIN = 1;
    private static final String LOG_TAG = "DebugUtils";
    public static HiLogLabel label = new HiLogLabel(LOG_LABEL_TYPE, LOG_LABEL_DOMAIN, LOG_TAG);

    public static void debug(String str) {
        HiLog.debug(label, "===>" + str);
    }

    public static void info(String str) {
        HiLog.info(label, "===>" + str);
    }

    public static void warn(String str) {
        HiLog.warn(label, "===>" + str);
    }

    public static void error(String str) {
        HiLog.error(label, "===>" + str);
    }
}
