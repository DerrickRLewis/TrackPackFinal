package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by admin on 6/9/16.
 */



@Controller
public class TrackingController {

    @Autowired
    UserRepository users;


    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(HttpSession session, String userName, String password)  {
        User user = users.findFirstByName(userName);
        if (user == null){
            user = new User(userName, password);
            users.save(user);
        }
        else if ( password.equals(user.password)) {
            session.setAttribute("user", user);
        }else session.setAttribute("invalidUser","invalidUser");
        return "redirect:/";
    }


    @Autowired
    TrackRepository trackRepo;




    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String homeLogin(Model model, HttpSession session) {


        if ( session.getAttribute("user") != null) {

            List<Tracking> pullTrackingData = trackRepo.findAll();
            Object rateList = session.getAttribute("rateList");
            model.addAttribute("rateList", rateList);
            model.addAttribute("trackedData", pullTrackingData);
            model.addAttribute("invalidUser", session.getAttribute("invalidUser"));
            model.addAttribute("user", (User) session.getAttribute("user"));
            return "home";
        }else
            return "login";
    }

    @RequestMapping(path = "/track-number", method = RequestMethod.POST)
    public String addTrackNumber(String tracking) {
        TrackingData trackingData = new TrackingData();
        Tracking tracked = trackingData.callServiceAndSave(tracking);
        trackRepo.save(tracked);
        return "redirect:/";
    }

    @RequestMapping(path = "/get-rates", method = RequestMethod.POST)
    public String generateRates(HttpSession session, String shipFromStreetAddress, String shipFromCity, String shipFromZipCode, String shipFromState, String shipToStreetAddress, String shipToCity, String shipToState, String shipToZipCode) {
        ShippingAddress userShipment = new ShippingAddress(shipFromStreetAddress, shipFromCity, shipFromZipCode, shipFromState, shipToStreetAddress, shipToCity, shipToState, shipToZipCode);
        List<Rate> rateList = RateData.call(userShipment);
        session.setAttribute("rateList", rateList);

        return "redirect:/";
    }



    @RequestMapping(path = "/logout", method = RequestMethod.POST)
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

}