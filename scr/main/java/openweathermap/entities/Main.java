package openweathermap.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "temp",
        "pressure",
        "humidity",
        "temp_min",
        "temp_max"
})
public class Main {

    @JsonProperty("temp")
    private double temp;
    @JsonProperty("pressure")
    private long pressure;
    @JsonProperty("humidity")
    private long humidity;
    @JsonProperty("temp_min")
    private long tempMin;
    @JsonProperty("temp_max")
    private long tempMax;

    @JsonProperty("temp")
    public double getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Main withTemp(double temp) {
        this.temp = temp;
        return this;
    }

    @JsonProperty("pressure")
    public long getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(long pressure) {
        this.pressure = pressure;
    }

    public Main withPressure(long pressure) {
        this.pressure = pressure;
        return this;
    }

    @JsonProperty("humidity")
    public long getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(long humidity) {
        this.humidity = humidity;
    }

    public Main withHumidity(long humidity) {
        this.humidity = humidity;
        return this;
    }

    @JsonProperty("temp_min")
    public long getTempMin() {
        return tempMin;
    }

    @JsonProperty("temp_min")
    public void setTempMin(long tempMin) {
        this.tempMin = tempMin;
    }

    public Main withTempMin(long tempMin) {
        this.tempMin = tempMin;
        return this;
    }

    @JsonProperty("temp_max")
    public long getTempMax() {
        return tempMax;
    }

    @JsonProperty("temp_max")
    public void setTempMax(long tempMax) {
        this.tempMax = tempMax;
    }

    public Main withTempMax(long tempMax) {
        this.tempMax = tempMax;
        return this;
    }

}
