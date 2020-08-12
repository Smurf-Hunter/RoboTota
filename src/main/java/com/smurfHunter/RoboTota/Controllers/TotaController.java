package com.smurfHunter.RoboTota.Controllers;

import com.smurfHunter.RoboTota.Model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TotaController {

    @PostMapping("/")
    public QueryResult repeat(@RequestBody Tota tota){
        TotaReturn totaReturn = new TotaReturn();
        FulfillmentMessage fulfillmentMessage = new FulfillmentMessage();
        Text text = new Text();
        List<String> textList = new ArrayList<>();
        textList.add("Nahi");
        text.setText(textList);
        fulfillmentMessage.setText(text);
        QueryResult queryResult = new QueryResult();
        List<FulfillmentMessage> fulfillmentMessages = new ArrayList<>();
        fulfillmentMessages.add(fulfillmentMessage);
        queryResult.setFulfillmentMessages(fulfillmentMessages);

        totaReturn.setQueryResult(queryResult);
        return queryResult;

    }

}
