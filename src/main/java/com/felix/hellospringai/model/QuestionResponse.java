package com.felix.hellospringai.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Felix
 * @since Dec 2023
 */
@Data
@Builder
public class QuestionResponse {
    String answer;
}