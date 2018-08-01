package com.github.punkkk.helloSpring;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
class Something {
    private final long number;
    private final String text;
}
