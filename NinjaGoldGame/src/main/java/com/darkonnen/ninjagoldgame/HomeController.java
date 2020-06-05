package com.darkonnen.ninjagoldgame;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/gold")

public class HomeController {
	
	@RequestMapping("")
	public String index(HttpSession session) {
		
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
			session.setAttribute("activities", new ArrayList<String>());
		}
			
		return "index.jsp";
	}
	
	@SuppressWarnings("unchecked")
	
	@RequestMapping(value="/gold", method=RequestMethod.POST)
	public String findGold(HttpSession session, @RequestParam(value="place") String place, Model model) {
		
		String timeStamp = new SimpleDateFormat("MMMMM dd yyyy HH:mm a").format(new Date());
		
		if( place.equals("farm") ) {
			
			Integer randGold = getRandomGold(20,10);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold + randGold);
			((ArrayList<String>) session.getAttribute("activities")).add(String.format("You entered a farm and earned %s gold. %s", randGold, timeStamp));

		} else if (place.equals("cave")) {
			
			Integer randGold = getRandomGold(10,5);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold + randGold);
			((ArrayList<String>) session.getAttribute("activities")).add(String.format("You entered a cave and earned %s gold. %s", randGold, timeStamp));
			
		} else if (place.equals("house")) {
			
			Integer randGold = getRandomGold(5,2);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold + randGold);
			((ArrayList<String>) session.getAttribute("activities")).add(String.format("You entered a house and earned %s gold. %s", randGold, timeStamp));
			
		} else if(place.equals("casino")) {
			
			Integer randGold = getRandomGold(50,-50);
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold + randGold);

			if(randGold < 0) {
				((ArrayList<String>) session.getAttribute("activities")).add(String.format("You entered a casino and lost %s gold. Ouch .. %s", randGold, timeStamp));				
			}else {
				((ArrayList<String>) session.getAttribute("activities")).add(String.format("You entered a casino and earned %s gold. %s", randGold, timeStamp));				
			}
		}	
		
		return "redirect:/gold";
	}
	
	
	public int getRandomGold(int max, int min) {
		Random rand = new Random();
		int value = rand.nextInt((max - min) + 1) + min;
		return value;
	}


}
