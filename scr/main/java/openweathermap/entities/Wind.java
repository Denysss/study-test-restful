package openweathermap.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "speed",
        "deg"
})
public class Wind {

    @JsonProperty("speed")
    private long speed;
    @JsonProperty("deg")
    private long deg;

    @JsonProperty("speed")
    public long getSpeed() {
        return speed;
    }

    @JsonProperty("speed")
    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public Wind withSpeed(long speed) {
        this.speed = speed;
        return this;
    }

    @JsonProperty("deg")
    public long getDeg() {
        return deg;
    }

    @JsonProperty("deg")
    public void setDeg(long deg) {
        this.deg = deg;
    }

    public Wind withDeg(long deg) {
        this.deg = deg;
        return this;
    }

}
