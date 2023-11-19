package whf.easy.boot.service.filter;

public class FilterClient {

    public static void main(String[] args) {
        FilterChain filterChain = new StandardFilterChain();

        filterChain.addFilter(new ForTest1Filter());
        filterChain.addFilter(new ForTest2Filter());

        filterChain.doFilter(new StandardHttpRequest());
    }
}