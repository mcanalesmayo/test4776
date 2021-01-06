package test.introspected;

import edu.umd.cs.findbugs.annotations.Nullable;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.PathVariable;
import lombok.Data;

@Data // Lombok getters and setters
public class BaseBean {

    @Header("X-Client-Id")
    @Nullable
    private String clientId;

    @PathVariable
    private String parentField;
}
