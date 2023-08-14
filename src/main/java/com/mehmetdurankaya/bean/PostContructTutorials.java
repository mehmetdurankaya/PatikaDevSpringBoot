package com.mehmetdurankaya.bean;

import com.mehmetdurankaya.controller.BeanController;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

public class PostContructTutorials {
    @Autowired
    Logger LOG;
    //    public BeanController() {
//        LOG.info("Log info çağrıldı");
//    }

    // bean henüz başlamadığından null alıyoruz ve burada bağımlılığı enjecte edemiyoruz.
    //Görevi : bir bean nesnesi oluşturulduğunda hemen oluşur.
    @PostConstruct
    public void init(){
        LOG.info("Log info çağrıldı");
    }
    public static void main(String[] args){
        PostContructTutorials postContructTutorials=new PostContructTutorials();
        System.out.println(postContructTutorials);
    }
}
