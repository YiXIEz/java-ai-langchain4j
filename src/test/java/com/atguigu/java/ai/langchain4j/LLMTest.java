package com.atguigu.java.ai.langchain4j;

import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LLMTest {
    @Test
    public void test() {
        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("http://langchain4j.dev/demo/openai/v1")
                .apiKey("demo")
                .modelName("gpt-4o-mini")
                .build();
        String answer = model.chat("介绍java");
        System.out.println(answer); // Hello World
    }
    @Autowired
    private OpenAiChatModel openAiChatModel;
    @Test

    public void test2() {
        String apiKey = "dd2c8345-4de9-4eaf-9299-c0e0c9a1a2de";

        OpenAiChatModel model = OpenAiChatModel.builder()
                .baseUrl("https://ark.cn-beijing.volces.com/api/v3/")
                .apiKey(apiKey)
                .modelName("ep-20250222110307-874fw")
                .build();
        String answer = model.chat("");
        System.out.println(answer);
    }
}
