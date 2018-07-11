package om.forezp.servicefeign.controller;

import om.forezp.servicefeign.client.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author renpeng
 * @date 2018/5/23
 */
@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
//    http://localhost:8765/hi?name=forezp
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
