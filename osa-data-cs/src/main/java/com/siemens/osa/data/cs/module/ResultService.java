package com.siemens.osa.data.cs.module;

import com.siemens.osa.data.cs.entity.ResultInfo;
import com.siemens.osa.data.cs.repository.ResultInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {
    @Autowired
    private ResultInfoRepository resultInfoRepository;

    public List<ResultInfo> GetAllResult() {
        return resultInfoRepository.getAllResult();
    }
}