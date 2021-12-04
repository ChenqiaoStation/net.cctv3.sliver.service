package net.cctv3.sliver.controller;

import net.cctv3.sliver.xUtils.AESUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserExperienceController {
    @RequestMapping("/selectUserExperiences.action")
    @ResponseBody
    public String selectUserExperiences() {
        return AESUtils.encrypt("Hello Spring boot!");
    }
}