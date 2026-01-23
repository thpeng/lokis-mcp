package ch.thp.proto.loki;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LokisApplication {

    public static void main(String[] args) {
        SpringApplication.run(LokisApplication.class, args);
    }

    @Bean
    public ToolCallbackProvider timetableTools(TimetableTool timetableService) {
        return MethodToolCallbackProvider.builder().toolObjects(timetableService).build();
    }


}
