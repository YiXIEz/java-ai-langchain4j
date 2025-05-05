package com.atguigu.java.ai.langchain4j.assistant;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AIServiceTest {
    @Autowired
    private OpenAiChatModel openAiChatModel;
    @Test
    public void testChat() {
//创建AIService
        Assistant assistant = AiServices.create(Assistant.class,openAiChatModel);
//调用service的接口
        String answer = assistant.chat("Hello");
        System.out.println(answer);
    }

    @Autowired
    private Assistant assistant;
    @Test
    public void test1(){
        String answer = assistant.chat("我是谁");
        System.out.println(answer);
    }
}
