
package com.smurfHunter.RoboTota.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "any"
})
public class Parameters {

    @JsonProperty("any")
    private String paramName;

    @JsonProperty("any")
    public String getParamName() {
        return paramName;
    }

    @JsonProperty("any")
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

}
