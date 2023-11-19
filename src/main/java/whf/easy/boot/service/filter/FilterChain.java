package whf.easy.boot.service.filter;


public interface FilterChain {

    void doFilter(HttpRequest httpRequest);

    void addFilter(Filter filter);
}
