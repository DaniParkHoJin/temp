package filters;

import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class CommonResponseWrapper extends HttpServletResponseWrapper {
    public CommonResponseWrapper(ServletResponse request) {
        super((HttpServletResponse) request);

        // 응답 후 공통 기능 정의
        System.out.println("ResponseWrapper");
    }
}
