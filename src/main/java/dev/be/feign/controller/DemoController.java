package dev.be.feign.controller;

import dev.be.feign.common.dto.BaseResponseInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.be.feign.service.DemoService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/get")
    public ResponseEntity<BaseResponseInfo> getController() {
        return demoService.get();
    }

    @GetMapping("/post")
    public ResponseEntity<BaseResponseInfo> postController() {
        return demoService.post();
    }

    @GetMapping("/error")
    public String errorDecoderController() {
        return demoService.errorDecoder();
    }
}
