package openweathermap;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class RegSpec {

    private static RequestSpecification reqSpec;

    private RegSpec() {

    }

    public static RequestSpecification getOpenWheatherMapSpec() {

        if (reqSpec == null) {
            reqSpec = new RequestSpecBuilder()
                    .addFilter(new RequestLoggingFilter())
                    .addFilter(new ResponseLoggingFilter())
                    .setBaseUri("http://api.openweathermap.org")
                    .build();
        }

        return reqSpec;
    }
}
