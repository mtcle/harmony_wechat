package com.mtcle.hmos.harmony_wechat.utils;

import ohos.app.Context;
import ohos.global.resource.Resource;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ResourceUtils {
    public static String getProfileString(Context context, int fileNameId) {
        Resource resource = null;
        try {
            StringBuilder result = new StringBuilder();
            resource = context.getResourceManager().getResource(fileNameId);
            InputStreamReader inputStreamReader = new InputStreamReader(resource, "utf-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String lineTxt = "";
            while ((lineTxt = bufferedReader.readLine()) != null) {
                result.append(lineTxt);
            }
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
