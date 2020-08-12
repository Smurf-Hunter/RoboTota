package com.smurfHunter.RoboTota.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "param-name"
})
public class Parameters {

    @JsonProperty("param-name")
    private String paramName;

    @JsonProperty("param-name")
    public String getParamName() {
        return paramName;
    }

    @JsonProperty("param-name")
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

}
