package fpt.codeteam.src.service.impl;

import fpt.codeteam.src.service.iclass.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "Hello";
    }
}
