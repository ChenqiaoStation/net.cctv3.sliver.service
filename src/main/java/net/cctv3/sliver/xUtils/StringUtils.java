package net.cctv3.sliver.xUtils;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;

public class StringUtils {
    public static String hashMap2AESStringWithTime(HashMap<String, Object> hashMap) {
        hashMap.put("time", System.currentTimeMillis());
        return AESUtils.encrypt(JSON.toJSONString(hashMap));
    }
}