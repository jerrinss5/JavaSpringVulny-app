public class OkTestLog3 {
  private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  @Override
  public void doFilter(ServletRequest request, ServletResponse response,
    FilterChain chain) throws IOException, ServletException {
      HttpServletRequest httpServletReq = (HttpServletRequest) request;
      String param = httpServletReq.getParameter("param");
      String cleanParam = "";
      // String cleanParam = Jsoup.clean(param, Whitelist.basic);
      // ok: crlf-injection-logs-deepsemgrep-sanitizer-copy
      log.log(log.getLevel(), cleanParam);
  }
}