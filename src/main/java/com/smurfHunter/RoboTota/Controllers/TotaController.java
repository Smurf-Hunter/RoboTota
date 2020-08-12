package com.smurfHunter.RoboTota.Controllers;

import com.smurfHunter.RoboTota.Model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TotaController {

    @PostMapping("/")
    public QueryResult repeat(@RequestBody Tota tota){

        List<String> textList = new ArrayList<>();
        textList.add(tota.getQueryResult().getParameters().getParamName());

        Text text = new Text();
        text.setText(textList);

        FulfillmentMessage fulfillmentMessage = new FulfillmentMessage();
        fulfillmentMessage.setText(text);

        List<FulfillmentMessage> fulfillmentMessages = new ArrayList<>();
        fulfillmentMessages.add(fulfillmentMessage);

        QueryResult queryResult = new QueryResult();
        queryResult.setFulfillmentMessages(fulfillmentMessages);

        return queryResult;

    }

}
