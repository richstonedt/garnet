package com.richstonedt.garnet.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * <b><code>illegalFilter</code></b>
 * <p>
 * class_comment
 * </p >
 * <b>Create Time:</b> 2019/5/5 16:53
 *
 * @author Xuan Rui
 */
public class illegalFilter implements Filter {

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        illegalInfoHttpServletRequestWrapper xssRequest = new illegalInfoHttpServletRequestWrapper((HttpServletRequest) request);
        chain.doFilter(xssRequest, response);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }
}
