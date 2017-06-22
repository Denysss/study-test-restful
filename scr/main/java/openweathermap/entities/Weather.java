package openweathermap.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "main",
        "description",
        "icon"
})
public class Weather {

    @JsonProperty("id")
    private long id;
    @JsonProperty("main")
    private String main;
    @JsonProperty("description")
    private String description;
    @JsonProperty("icon")
    private String icon;

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Weather withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("main")
    public String getMain() {
        return main;
    }

    @JsonProperty("main")
    public void setMain(String main) {
        this.main = main;
    }

    public Weather withMain(String main) {
        this.main = main;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Weather withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Weather withIcon(String icon) {
        this.icon = icon;
        return this;
    }

}
