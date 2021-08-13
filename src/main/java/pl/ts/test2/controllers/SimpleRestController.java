package pl.ts.test2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.ts.test2.model.Position;
import pl.ts.test2.services.IPositionService;

@RestController
public class SimpleRestController {

    @Autowired
    IPositionService positionService;

    //zwracamy javovwy odpowiednik odpowiedzi http
    @RequestMapping(value = "/api/rest1", method = RequestMethod.POST)
    public ResponseEntity<Position> savePosition(@RequestBody Position position){
        ResponseEntity<Position> responseEntity = ResponseEntity.ok().build();
        positionService.addPosition(position);
        return responseEntity;
    }

    //zwracamy pozycję
    @RequestMapping(value = "/api/rest2", method = RequestMethod.POST)
    public Position savePosition2(@RequestBody Position position){
        positionService.addPosition(position);
        return position;
    }


}
