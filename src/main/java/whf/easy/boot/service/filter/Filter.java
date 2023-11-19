package whf.easy.boot.service.filter;


public interface Filter {
    void doFilter(HttpRequest httpRequest, FilterChain filterChain);
}
