package test.introspected;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.RequestBean;

@Controller
public class TestController {

    @Post("/{parentField}")
    public MutableHttpResponse<String> myPostMethod(@RequestBean PostBean bean) {
        return HttpResponse.ok(bean.getClientId());
    }
}
