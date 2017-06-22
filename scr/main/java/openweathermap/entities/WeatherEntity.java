package openweathermap.entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "coord",
        "weather",
        "base",
        "main",
        "visibility",
        "wind",
        "clouds",
        "dt",
        "sys",
        "id",
        "name",
        "cod"
})
public class WeatherEntity {

    @JsonProperty("coord")
    private Coord coord;
    @JsonProperty("weather")
    private List<Weather> weather = null;
    @JsonProperty("base")
    private String base;
    @JsonProperty("main")
    private Main main;
    @JsonProperty("visibility")
    private long visibility;
    @JsonProperty("wind")
    private Wind wind;
    @JsonProperty("clouds")
    private Clouds clouds;
    @JsonProperty("dt")
    private long dt;
    @JsonProperty("sys")
    private Sys sys;
    @JsonProperty("id")
    private long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("cod")
    private long cod;

    @JsonProperty("coord")
    public Coord getCoord() {
        return coord;
    }

    @JsonProperty("coord")
    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public WeatherEntity withCoord(Coord coord) {
        this.coord = coord;
        return this;
    }

    @JsonProperty("weather")
    public List<Weather> getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public WeatherEntity withWeather(List<Weather> weather) {
        this.weather = weather;
        return this;
    }

    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    public WeatherEntity withBase(String base) {
        this.base = base;
        return this;
    }

    @JsonProperty("main")
    public Main getMain() {
        return main;
    }

    @JsonProperty("main")
    public void setMain(Main main) {
        this.main = main;
    }

    public WeatherEntity withMain(Main main) {
        this.main = main;
        return this;
    }

    @JsonProperty("visibility")
    public long getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    public WeatherEntity withVisibility(long visibility) {
        this.visibility = visibility;
        return this;
    }

    @JsonProperty("wind")
    public Wind getWind() {
        return wind;
    }

    @JsonProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public WeatherEntity withWind(Wind wind) {
        this.wind = wind;
        return this;
    }

    @JsonProperty("clouds")
    public Clouds getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public WeatherEntity withClouds(Clouds clouds) {
        this.clouds = clouds;
        return this;
    }

    @JsonProperty("dt")
    public long getDt() {
        return dt;
    }

    @JsonProperty("dt")
    public void setDt(long dt) {
        this.dt = dt;
    }

    public WeatherEntity withDt(long dt) {
        this.dt = dt;
        return this;
    }

    @JsonProperty("sys")
    public Sys getSys() {
        return sys;
    }

    @JsonProperty("sys")
    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public WeatherEntity withSys(Sys sys) {
        this.sys = sys;
        return this;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public WeatherEntity withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public WeatherEntity withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("cod")
    public long getCod() {
        return cod;
    }

    @JsonProperty("cod")
    public void setCod(long cod) {
        this.cod = cod;
    }

    public WeatherEntity withCod(long cod) {
        this.cod = cod;
        return this;
    }

}