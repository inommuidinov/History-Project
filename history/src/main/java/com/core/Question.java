package com.core;

import java.util.List;

public class Question {
    private Long id;

    private String text;

    private String answer;

    private List<String> variants;

    public boolean checkAnswer(Variant variant) {
        if (variant == Variant.NO)
            return false;
        return checkAnswer(variants.get(variant.toNum()));
    }

    public boolean checkAnswer(String answer) {
        return answer.equals(this.answer);
    }

    public List<String> getVariants() {
        return variants;
    }

    public String getText() {
        return text;
    }
}
