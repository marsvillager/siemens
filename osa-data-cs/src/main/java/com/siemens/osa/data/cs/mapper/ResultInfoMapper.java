package com.siemens.osa.data.cs.mapper;

import com.siemens.osa.data.cs.entity.ResultInfo;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ResultInfoMapper {
    List<ResultInfo> getAllResult();

    @MapKey("rule_id")
    Map<String, ResultInfo> getResultById(@Param("id") Integer id);

//    void addResult(@Param("timestamp") Timestamp timestamp, @Param("id") Integer id, @Param("os") String os,
//                   @Param("server_ip") String server_ip, @Param("host_ip") String host_ip, @Param("rule_id") String rule_id,
//                   @Param("expected") String expected, @Param("actual") String actual, @Param("status") String status);
}
