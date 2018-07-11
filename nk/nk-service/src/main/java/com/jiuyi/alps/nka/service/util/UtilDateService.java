package com.jiuyi.alps.nka.service.util;

import common.util.date.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * @author renpeng
 * @date 2018/6/6
 */
@Service
public class UtilDateService {

    private Logger logger = LoggerFactory.getLogger(getClass());
//    yyyyMMdd
    public static final String DATE_8_DATE_STR = "20180606";
//    yyyy-MM-dd
    public static final String DATE_10_DATE_STR= "2018-06-06";
//    yyyy-MM-dd HH:mm:ss
    public static final String DATETIME_19_DATE_STR = "2018-06-06 18:08:58";
//    yyyyMMdd HH:mm:ss
    public static final String DATETIME_17_DATE_STR = "20180606 18:08:58";
//    yyyyMMddHHmmss
    public static final String DATETIME_14_DATE_STR = "20180606180858";

//    yyyyMMdd
    public static final String DATE_8_FORMATTER = "yyyyMMdd";
//    yyyy-MM-dd
    public static final String DATE_10_FORMATTER = "yyyy-MM-dd";
//    yyyy-MM-dd HH:mm:ss
    public static final String DATETIME_19_FORMATTER = "yyyy-MM-dd HH:mm:ss";
//    yyyyMMdd HH:mm:ss
    public static final String DATETIME_17_FORMATTER_ = "yyyyMMdd HH:mm:ss";
//    yyyyMMddHHmmss
    public static final String DATETIME_14_FORMATTER = "yyyyMMddHHmmss";



    public static final Long DAYS = (long)3;
    public static final Long MONTHS = (long)3;
    public static final Long YEARS = (long)3;

    /**
     * 通过DateUtil了解里面的获取时间的方法
     * @return
     */
    public String findDate() {
        Date date=new Date();
        LocalDate localDate=LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(1), ZoneId.systemDefault());


        String a1=DateUtil.getCurrentDate();
        logger.info("a1=DateUtil.getCurrentDate()={}",a1);

        String a2= DateUtil.getCurrentDateShort();
        logger.info("a2=DateUtil.getCurrentDateShort()={}",a2);

        String a3=DateUtil.getCurrentDateTime();
        logger.info("a3=DateUtil.getCurrentDateTime()={}",a3);

        String a4=DateUtil.getCurrentDateTime14();
        logger.info("a4=DateUtil.getCurrentDateTime14()={}",a4);

        String a5=DateUtil.getCurrentDateTime17();
        logger.info("a5=DateUtil.getCurrentDateTime17()={}",a5);

        String a6=DateUtil.getCurrentDateTime19();
        logger.info("a6=DateUtil.getCurrentDateTime19()={}",a6);

        String a7=DateUtil.getCurrentDateTime(DATE_8_DATE_STR);
        logger.info("a7=DateUtil.getCurrentDateTime(DATE_8_DATE_STR)={}",a7);

        String a8=DateUtil.getCurrentDateTime(DATE_8_FORMATTER);
        logger.info("a8=DateUtil.getCurrentDateTime(DateTimeFormatter formatter)={}",a8);


        String a9=DateUtil.getDateTimeStr(localDateTime,DateUtil.DATE_TIME_FORMATTER_19);
        logger.info("a9=DateUtil.getDateTimeStr()={}",a9);


        String a10=DateUtil.getDateStr(localDate,DateUtil.DATE_TIME_FORMATTER_10);
        logger.info("a10=DateUtil.getDateStr(LocalDate dateTime, DateTimeFormatter formatter)={}",a10);

        LocalDateTime a11=DateUtil.parseDateTime(DATETIME_19_DATE_STR,DateUtil.DATE_TIME_FORMATTER_19);
        logger.info("a11=DateUtil.parseDateTime(String dateTime, DateTimeFormatter formatter)={}",a11+"");

        LocalDate a12=DateUtil.parseDate(DATETIME_19_DATE_STR,DateUtil.DATE_TIME_FORMATTER_19);
        logger.info("a12=DateUtil.parseDate(String date, DateTimeFormatter formatter)={}",a12.toString());

        long a13=DateUtil.betweenDays(DATE_10_DATE_STR,DATE_10_DATE_STR);
        logger.info("a13=DateUtil.betweenDays(String startDateStr, String endDateStr)={}",a13+"");

        long a14=DateUtil.betweenDays(localDate,localDate);
        logger.info("a14=DateUtil.betweenDays(LocalDate startDate, LocalDate endDate)={}",a14+"");

        long a15=DateUtil.betweenDays(localDateTime,localDateTime);
        logger.info("a15=DateUtil.betweenDays(LocalDateTime startDateTime, LocalDateTime endDateTime)=a1={}",a15+"");

        String a16=DateUtil.getAddDays(DATE_10_DATE_STR,DAYS);
        logger.info("a16=DateUtil.getAddDays(String startDate, Long days)={}",a16+"");

        LocalDate a17=DateUtil.getAddDays(localDate,DAYS);
        logger.info("a17=DateUtil.getAddDays(LocalDate startDate, Long days)={}",a17+"");

        String a18=DateUtil.getMinusMonths(DATE_10_DATE_STR,MONTHS);
        logger.info("a18=DateUtil.getMinusMonths(String startDate, Long months)={}",a18+"");

        LocalDate a19=DateUtil.getMinusMonths(localDate,MONTHS);
        logger.info("a19=DateUtil.getMinusMonths(LocalDate startDate, Long months)={}",a19+"");

        String a20=DateUtil.getMinusYears(DATE_10_DATE_STR,YEARS);
        logger.info("a20=DateUtil.getMinusYears(String startDate, Long years)={}",a20+"");

        String a21=DateUtil.getMinusYears(DATE_10_DATE_STR,YEARS);
        logger.info("a21=DateUtil.getMinusYears(String startDate, Long years)={}",a21+"");

        LocalDate a22=DateUtil.getMinusYears(localDate,YEARS);
        logger.info("a22=DateUtil.getMinusYears(LocalDate startDate, Long years)={}",a22+"");

        LocalDateTime a23=DateUtil.dateToLocalDateTime(date);
        logger.info("a23=DateUtil.dateToLocalDateTime(Date date)={}",a23+"");

        LocalDate a24=DateUtil.dateToLocalDate(date);
        logger.info("a24=DateUtil.dateToLocalDate(Date date)={}",a24+"");

        String a25=DateUtil.getDate10Str(date);
        logger.info("a25=DateUtil.getDate10Str(Date date)={}",a25+"");

        String a26=DateUtil.getDateTime19Str(date);
        logger.info("a26=DateUtil.getDateTime19Str(Date date)={}",a26+"");

        String a27=DateUtil.getDate8Str(date);
        logger.info("a27=DateUtil.getDate8Str(Date date)={}",a27+"");

//        String a28=DateUtil.dateTimeStrConvert(date);
//        logger.info("a28=DateUtil.dateTimeStrConvert(String DateTimeStr, DateTimeFormatter sourceFormatter, DateTimeFormatter targetFormatter)=a1={}",a28+"");

        LocalDate a29=DateUtil.getFirstDayOfMonth();
        logger.info("a29=DateUtil.getFirstDayOfMonth()={}",a29+"");

        LocalDate a30=DateUtil.getLastDayOfMonth();
        logger.info("a30=DateUtil.getLastDayOfMonth()={}",a30+"");

        int a31=DateUtil.getCurrentDateOfYear();
        logger.info("a31=DateUtil.getCurrentDateOfYear()={}",a31+"");

        int a32=DateUtil.getCurrentDateOfMonth();
        logger.info("a32=DateUtil.getCurrentDateOfMonth()={}",a32+"");

        return null;
    }

    /**
     *计算两个时间相差的月数
     * @return
     */
    public  int getMonthDiff(String d1) {
        Date currentDate = new Date();

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        //将String日期转换成date

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1=sdf.parse(d1);
//            Date date2=sdf.parse(d2);
            c1.setTime(date1);
//            c2.setTime(date2);
            c2.setTime(currentDate);
        } catch (Exception e) {
            logger.error("格式化时间错误 ",e);
        }
        //判断两个日期的大小

        if(c2.getTimeInMillis() < c1.getTimeInMillis()) return 0;
        int year1 = c1.get(Calendar.YEAR);
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);
        // 获取年的差值 假设 d1 = 2015-9-30   d2 = 2015-12-16
        int yearInterval = year2 - year1;
        // 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
        if(month2 < month1 || month1 == month2 && day2 < day1) yearInterval --;
        // 获取月数差值
        int monthInterval = (month2 + 12) - month1 ;
        if(day2 > day1) monthInterval ++;
        monthInterval %= 12;
        int i=yearInterval * 12 + monthInterval;
        return i== 0 ? 1 : Math.abs(i);
    }
    /**
     *Calendar获取时间
     * @return
     */
    public  void getlastDay() {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        Date start = calendar.getTime();
        calendar.add(Calendar.HOUR_OF_DAY, -24);
        Date end = calendar.getTime();
        String udpateTimeStart=DateUtil.getDateTime19Str(start);
        String udpateTimeEnd=DateUtil.getDateTime19Str(end);
        logger.info("Calendar.HOUR_OF_DAY,udpateTimeStart={},udpateTimeEnd={}",udpateTimeStart,udpateTimeEnd);
    }
    /**
     *
     * @return
     */
    public  void getlastDayByFormat(){
        String today1="2017-12-08 19:04:30";
        String lastMonth1="2017-12-12 19:20:35";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//小写的mm表示的是分钟
        try{
            Date startTime = sdf.parse(today1);
            Date endTime = sdf.parse(lastMonth1);
            logger.info("Calendar.HOUR_OF_DAY,startTime={},endTime={}",startTime,endTime);
        }catch (Exception e) {
            logger.error(" error ",e);
        }

    }

}
