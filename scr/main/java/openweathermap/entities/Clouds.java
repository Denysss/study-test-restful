package openweathermap.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "all"
})
public class Clouds {

    @JsonProperty("all")
    private long all;

    @JsonProperty("all")
    public long getAll() {
        return all;
    }

    @JsonProperty("all")
    public void setAll(long all) {
        this.all = all;
    }

    public Clouds withAll(long all) {
        this.all = all;
        return this;
    }

}
