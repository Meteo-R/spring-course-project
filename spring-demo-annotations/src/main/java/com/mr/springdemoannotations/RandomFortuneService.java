package com.mr.springdemoannotations;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class RandomFortuneService implements FortuneService {

    private static final List<String> FORTUNES = Arrays.asList(
            "Your limitation - it's only your imagination",
            "Push yourself, because no one else is going to do it for you",
            "Sometimes later becomes never"
    );

    @Override
    public String getFortune() {
        int random = ThreadLocalRandom.current().nextInt(0, FORTUNES.size());
        return FORTUNES.get(random);
    }
}
