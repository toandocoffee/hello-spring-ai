package com.felix.hellospringai.controller;

import com.felix.hellospringai.model.QuestionRequest;
import com.felix.hellospringai.model.QuestionResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.client.AiClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Felix
 * @since Dec 2023
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class BasicPromptController {
    private final AiClient aiClient;

    @PostMapping("/questions:ask")
    public ResponseEntity<QuestionResponse> ask(@RequestBody QuestionRequest questionRequest) {
        return ResponseEntity.ok(QuestionResponse.builder()
                .answer(aiClient.generate(questionRequest.getQuestion()))
                .build()
        );
    }
}
