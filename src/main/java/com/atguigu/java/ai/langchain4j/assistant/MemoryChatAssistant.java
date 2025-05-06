package com.atguigu.java.ai.langchain4j.assistant;

import dev.langchain4j.service.spring.AiService;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

@AiService(
        wiringMode = EXPLICIT,
        chatModel = "qwenChatModel",
        chatMemory = "memoryChatMemory"
)
public interface MemoryChatAssistant {
    String chat(String userMessage);
}
