package com.slproject.ytdownloader.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slproject.ytdownloader.DataAccess.IYtDownloaderDal;

@Service //bunun bir iş katmanı oldugunu belirten anatasyon
public class YtDownloaderManager implements IYtDownloaderService {
	//iş katmanı
	
		private IYtDownloaderDal ytDownloaderDal; //Data access layer ile bağlıyoruz.
		
		@Autowired //bu database olmadıgı için belki gereksiz olabilir.
		public YtDownloaderManager(IYtDownloaderDal ytDownloaderDal) { //constructor olusturuldu.
		this.ytDownloaderDal = ytDownloaderDal;
	}
		@Override
		public String getLink() { //linki alacağımız metod.
			return ytDownloaderDal.getLink();
		}

}




