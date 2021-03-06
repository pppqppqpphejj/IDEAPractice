package com.hisen.jars.json;

import com.alibaba.fastjson.JSON;
import java.util.HashMap;
import java.util.Map;

/**
 * 将map转化为json
 * Created by hisenyuan on 2017/3/22 at 14:59.
 */
public class Map2Json {

  public static void main(String[] args) {
    fastjson();
  }

  /**
   * 阿里巴巴的fastjson把map转换成json
   */
  public static void fastjson() {
    Map<String, String> map = new HashMap<String, String>();
    map.put("name", "hisen");
    map.put("age", "20");
    map.put("gender", "female");
    map.put("add", "北京");
    map.put("email", "hisenyuan@gmail.com");
    map.put("phone", "15555555555");

    String jsonString = JSON.toJSONString(map);
    System.out.println("-------------fastjson-----------------");
    System.out.println(jsonString);
  }
}
