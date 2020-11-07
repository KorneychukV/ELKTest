package ru.rsatu.sseryakova.elk_log_app;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class main {

    final static Logger logger = Logger.getLogger(main.class);

    public static void main(String[] args) {

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());

        logger.debug("Current time is ".concat(formatter.format(date)));

    }

}
