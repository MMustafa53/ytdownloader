package com.slproject.ytdownloader.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slproject.ytdownloader.Business.IYtDownloaderService;

@RestController //uygulamanın rest oldugunu belirtmek için annation ile belirtiyoruz.
// @RequestMapping("/api") //butun operasyonlar api ile başlar.Bunun bir api oldugunu belirten anatasyondur.Kaldırabiliriz ama durabilirde durursa linki ona göre ayarlamak lazım.
public class Controller {
	
	private IYtDownloaderService ytDownloaderService;
	
	@Autowired // Service'i sadece manager implemente ediyor.Otomatik bulur.
	public Controller(IYtDownloaderService ytDownloaderService) {
		this.ytDownloaderService = ytDownloaderService;
	}

	//Eğer yukarıdan apiyi silersek sadece / ile localhosta ulasabiliriz.s
	@GetMapping("/") //yotube linki buraya yazılacak.sanırım :)
	public String get() { //youtube linkini get ile alacak metod
		return ytDownloaderService.getLink(); //burası degiscek.
	}

}
