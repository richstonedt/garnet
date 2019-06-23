package com.richstonedt.garnet.filter;

import org.springframework.context.annotation.Configuration;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * The type Char encoding filter.
 */
@Configuration
public class CharEncodingFilter implements Filter {

    /**
     * The Encoding.
     */
    private String encoding;

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig cfg) throws ServletException {
        String e = cfg.getInitParameter("enconding");
        if (e == null || "".equals(e.trim())) {
            encoding = "UTF-8";
        } else {
            encoding = e;
        }
    }
}
