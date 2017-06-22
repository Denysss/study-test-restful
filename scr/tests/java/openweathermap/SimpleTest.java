package openweathermap;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import openweathermap.entities.WeatherEntity;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest {

    private final String appid = "06b495773e3844b006d8be941b7cfc24";
    private final String endpoint = "/data/2.5/weather";

    @Test
    public void test() {
        WeatherEntity entity = given().spec(RegSpec.getOpenWheatherMapSpec())
                .basePath(endpoint)
                .queryParam("q", "Kiev")
                .queryParam("appid", appid)
                .queryParam("lang", "en")
                .queryParam("units", "metric")
                .when().get()
                .then().statusCode(HttpStatus.SC_OK).extract().as(WeatherEntity.class);

        assertThat(entity.getName()).as("Verify city name").isEqualTo("Kiev");
    }
}
