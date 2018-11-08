package openweathermap;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import openweathermap.entities.WeatherEntity;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest {

    private static final String APPID = "06b495773e3844b006d8be941b7cfc24";
    private static final String ENDPOINT = "/data/2.5/weather";

    @Test
    public void test() {
        WeatherEntity entity = given().spec(RegSpec.getOpenWheatherMapSpec())
                .basePath(ENDPOINT)
                .queryParam("q", "Kiev")
                .queryParam("appid", APPID)
                .queryParam("lang", "en")
                .queryParam("units", "metric")
                .when().get()
                .then().statusCode(HttpStatus.SC_OK).extract().as(WeatherEntity.class);

        assertThat(entity.getName()).as("Verify city name").isEqualTo("Kiev");
    }
}
