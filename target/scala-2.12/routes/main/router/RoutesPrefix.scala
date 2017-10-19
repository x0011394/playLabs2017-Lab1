
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playapps/HelloWorld/conf/routes
// @DATE:Thu Oct 19 11:37:52 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
