package net.cctv3.sliver.controller;

import net.cctv3.sliver.entity.FundIndustry;
import net.cctv3.sliver.mapper.FundIndustryMapper;
import net.cctv3.sliver.xUtils.AESUtils;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class FundIndustryController {
    @Autowired
    FundIndustryMapper fundIndustryMapper;

    @CrossOrigin
    @PostMapping("/insertFundIndustry.action")
    public String insertFundIndustry(@RequestBody FundIndustry fundIndustry) {
        HashMap<String, Object> hashMap = new HashMap<>();
        int rows = fundIndustryMapper.insertFundIndustry(fundIndustry);
        hashMap.put("status", rows == 1);
        String result = AESUtils.encrypt(JSON.toJSONString(hashMap));
        System.out.println(result);
        return result;
    }
}