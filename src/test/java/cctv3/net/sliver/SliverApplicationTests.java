package cctv3.net.sliver;

import cctv3.net.sliver.xUtils.HttpClientUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SliverApplicationTests {

    @Test
    void contextLoads() {
        testConnectHttpClient();
    }

    private void testConnectHttpClient() {
        System.out.println(HttpClientUtils.doGet("https://h5.1234567.com.cn/AggregationStaticService/getFundThemeListAggr?CToken=&PassportID=&RankItems=ZDF&RankVectors=desc&ServerVersion=6.4.9&UToken=&UserId=&appVersion=6.4.9&category=1&plat=Iphone&product=EFund&uid=&version=6.4.9", "utf-8"));
    }
}
