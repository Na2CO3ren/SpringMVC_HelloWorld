package com.robin.springmvc.hello.view;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import java.util.Map;

@Component
public class MyView implements View {
    @Override
    public String getContentType() {
        return "text/html";
    }

    @Override
    public void render(Map<String, ?> model, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
        response.getWriter().println("Hello Robin");
    }
}
