package alex.learn.web.filters;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * author  : zhiguang
 * date    : 2018/7/25
 * 未完成
 */
@Order(1)
@WebFilter(filterName="ContentTypeFilter")
public class ContentTypeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String url = httpServletRequest.getRequestURI().substring(httpServletRequest.getContextPath().length());
        System.out.println("filter url:    "+url);
        RequestModifierA wrapperA = new RequestModifierA(httpServletRequest);
        Map<String, String[]> parameterMap = new HashMap<>(wrapperA.getParameterMap());

        //问题：里面没有这个key
        String[] strings = parameterMap.get("Content-Type");
        if(targeted(url)){
            strings = new String[1];
            strings[0] = "application/json;charset=utf-8";
            parameterMap.put("Content-Type", strings);
            wrapperA.setParameterMap(parameterMap);
            chain.doFilter(wrapperA, response);
        }
    }

    @Override
    public void destroy() {

    }

    private boolean targeted(String url) {
        if (null != url && url.endsWith("one")) {
            System.out.println("target found.");
            return true;
        }
        return false;
    }


    //内部包装类
    //修改content-type
    private class RequestModifierA extends HttpServletRequestWrapper {

        private Map<String, String[]> parameterMap; // 所有参数的Map集合

        public RequestModifierA(HttpServletRequest request) {
            super(request);
            parameterMap = request.getParameterMap();
            System.out.println("created .... ");
        }

        @Override
        public Enumeration<String> getParameterNames() {
            Vector<String> vector = new Vector<String>(parameterMap.keySet());
            return vector.elements();
        }


        @Override
        public String getParameter(String name) {
            String[] results = parameterMap.get(name);
            return results[0];
        }



        @Override
        public String[] getParameterValues(String name) {
            return parameterMap.get(name);
        }

        @Override
        public Map<String, String[]> getParameterMap() {
            return parameterMap;
        }

        public void setParameterMap(Map<String, String[]> parameterMap) {
            this.parameterMap = parameterMap;
        }


        //完全不会被调用。。。。
/*        @Override
        public Enumeration<String> getHeaderNames() {
            Enumeration<String> enumeration = super.getHeaderNames();
            Vector<String> v = new Vector<>();
            Enumeration<String> en = v.elements();

            while( enumeration.hasMoreElements()){
                String e = enumeration.nextElement();
                if(null !=e && e.equalsIgnoreCase("Content-Type")){
                    System.out.println("--------"+e);
                }
                System.out.println(e);
                v.add(e);
            }
            return v.elements();
        }*/



        /*@Override
        public String getParameter(String name) {
            System.out.println(name);
            if (null != name && name.equals("Content-Type")) {
                String value = super.getParameter(name);
                System.out.println(value);
                return value;
            }

            //value = value == null ? null : convert(value);
           return super.getParameter(name);
        }*/


       /* @Override
        public Enumeration<String> getHeaders(String name) {
            if (null != name && name.equals("Content-Type")) {
                return new Enumeration<String>() {
                    private boolean hasGetted = false;
                    @Override
                    public String nextElement() {
                        if (hasGetted) {
                            throw new NoSuchElementException();
                        } else {
                            hasGetted = true;
                            return "application/json;charset=utf-8";
                        }
                    }
                    @Override
                    public boolean hasMoreElements() {
                        return !hasGetted;
                    }
                };
            }
            return super.getHeaders(name);
        }*/



    }
}

