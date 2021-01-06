package test.introspected;

import edu.umd.cs.findbugs.annotations.Nullable;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.http.annotation.Header;
import lombok.Data;

import static io.micronaut.http.HttpHeaders.CONTENT_TYPE;

@Introspected
@Data // Lombok getters and setters
public class PostBean extends BaseBean {

    @Header(CONTENT_TYPE)
    @Nullable
    private String contentType;
}

