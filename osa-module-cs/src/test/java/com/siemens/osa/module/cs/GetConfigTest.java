package com.siemens.osa.module.cs;

import com.siemens.osa.data.cs.entity.ConfigInfo;
import com.siemens.osa.data.cs.mapper.ConfigInfoMapper;
import com.siemens.osa.module.cs.service.getCS.impl.GetConfigServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class GetConfigTest {
    @Autowired
    ConfigInfoMapper configInfoMapper;

    @Test
    public void testGetAllConfig() {
        GetConfigServiceImpl getConfigService = new GetConfigServiceImpl(configInfoMapper);
        List<ConfigInfo> configInfoList = getConfigService.getConfig();
        for (ConfigInfo configInfo: configInfoList) {
            System.out.println(configInfo);
            String[] data = configInfo.getData();
            if (data != null)
                for (String datum : data) {
                    System.out.println(datum);
                }
        }
    }

    @Test
    public void testGetConfigById(){
        int id = 2;
        GetConfigServiceImpl getConfigService = new GetConfigServiceImpl(configInfoMapper);
        Map<String, ConfigInfo> configById = getConfigService.getConfigById(id);
        ConfigInfo configInfo = configById.get("BL999_6629");
        System.out.println(configInfo);
        String[] data = configInfo.getData();
        for (String s : data) {
            System.out.println(s);
        }
    }

    @Test
    public void testGetConfigListById(){
        int id = 2;
        GetConfigServiceImpl getConfigService = new GetConfigServiceImpl(configInfoMapper);
        List<String> result = getConfigService.getConfigListById(id, "BL696_0461");
        for (String res: result) {
            System.out.println(res);
        }
    }
}
