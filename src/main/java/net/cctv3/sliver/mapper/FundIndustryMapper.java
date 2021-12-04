package net.cctv3.sliver.mapper;

import net.cctv3.sliver.entity.FundIndustry;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FundIndustryMapper {
    int insertFundIndustry(FundIndustry fundIndustry);
}
