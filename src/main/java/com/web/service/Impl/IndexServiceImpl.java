package com.web.service.Impl;

import com.web.Config.myannotation.SystemServiceLog;
import com.web.service.IndexService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexServiceImpl  implements IndexService {
    @Override
    @SystemServiceLog(description = "get")
    public String get() {
        return new String(String.valueOf(1/0));
    }
}
