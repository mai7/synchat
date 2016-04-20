
import static spark.Spark.*;
public class HelloSpark {
    public static void main( String[] args ) {
        get("/hello", (req, rsp) -> "Hello, world");
        get("/foo/*/bar/*", (req, rsp) -> {
           return "hello " + req.splat()[0] + ","+req.splat()[1];
        });
        get("/hello/:name", (req, rsp) -> "hello," + req.params(":name"));
        get("/*",(req, rsp) -> {halt(333,"No no"); return null;});
    }
}
