package com.slproject.ytdownloader.DataAccess;

import org.springframework.stereotype.Repository;

@Repository //burası repository oldugunu belirten anatasyon
public class YtDownloaderDal implements IYtDownloaderDal  {
	@Override
	public String getLink() { //linki alacağımız metod.
		return "Youtube linki alındı.";
	}

}
