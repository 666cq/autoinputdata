package cn.start;

import cn.config.MssqlConfig;
import cn.dao.InsertDao;
import cn.model.KeyData;

import java.sql.Connection;
import java.sql.Statement;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AutoInputStarter {

    public static void main(String[] args) throws Exception{

        Connection conn = MssqlConfig.openConnection();
        Statement statement = conn.createStatement();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        NumberFormat Nformat = NumberFormat.getInstance();
        KeyData keyData = new KeyData();

        //int randNumber =rand.nextInt(MAX - MIN + 1) + MIN; // randNumber 将被赋值为一个 MIN 和 MAX 范围内的随机数

        Random rand = new Random();

        int oneorignsum = 401064060;
        int twoorignsum = 451569974;
        int oneoutsum = 55406274;
        int twooutsum = 25212505;
        int usedforselfsum = 2907922;
        int fanflow = 5031511;
        int huiliu = 800972;

       while(true) {

           oneorignsum += 2000;
           twoorignsum += 2000;
           oneoutsum += 2000;
           twooutsum += 1000;
           usedforselfsum += 25;
           fanflow += 200;
           huiliu+=110;

           double f = rand.nextDouble();

           // 设置小数位数。
           Nformat.setMaximumFractionDigits(1);
           String f1 = Nformat.format(f);
           String temper = Nformat.format(36 + rand.nextFloat());

           Nformat.setMaximumFractionDigits(2);
           String f2 = Nformat.format(f);
           String total_cl = Nformat.format(0.8 + rand.nextFloat() / 10);
           String out_ph = Nformat.format(8.6 + rand.nextFloat() / 10);
           String orgin_water_level = Nformat.format(7 + rand.nextDouble());


           Nformat.setMaximumFractionDigits(3);
           String f3 = Nformat.format(f);
           String duty = Nformat.format(0.06 + rand.nextFloat() / 100);
           String oneoutpressure = Nformat.format(0.2 + rand.nextDouble() / 10);
           String twooutpressure = Nformat.format(0.4 + rand.nextDouble() / 10);
           String oneclearwaterlevel = Nformat.format(3 + rand.nextDouble());
           String twoclearwaterlevel = Nformat.format(3 + rand.nextDouble());

           //System.out.println(temper);



           keyData.setTime(simpleDateFormat.format(new Date()));
           keyData.setOne_water_in_flow((rand.nextInt(5000) + 4000) + "");
           keyData.setTwo_water_in_flow((rand.nextInt(5000) + 4200) + "");
           keyData.setOnechuchang_flow((rand.nextInt(3000) + 7200) + "");
           keyData.setTwochuchang_flow((rand.nextInt(2000) + 3200) + "");
           keyData.setSource_water_turbidity((Double.parseDouble(f2) + 18) + "");
           keyData.setSource_water_ph((Double.parseDouble(f2) + 7) + "");
           keyData.setOut_water_turbidity(duty);
           keyData.setOut_water_total_cl(total_cl);
           keyData.setOut_water_ph(out_ph);
           keyData.setOneout_water_pressure(oneoutpressure);
           keyData.setTwoout_water_pressure(twooutpressure);
           keyData.setOne_after_cl("0");
           keyData.setTwo_after_cl("0.78");
           keyData.setOne_clear_wate_level(oneclearwaterlevel);
           keyData.setTwo_clear_wate_level(twoclearwaterlevel);
           keyData.setOriginal_water_level(orgin_water_level);
           keyData.setTemperature(temper);
           keyData.setOne_pump_frequency_control("50");
           keyData.setSix_pump_frequency_control("49");
           keyData.setSeven_pump_frequency_control("49");
           keyData.setOne_water_in_flow_total(oneorignsum + "");
           keyData.setTwo_water_in_flow_total(twoorignsum + "");
           keyData.setOne_out_water_total(oneoutsum + "");
           keyData.setTwo_out_water_total(twooutsum + "");
           keyData.setUsedforself_total(usedforselfsum + "");
           keyData.setFan_flow(fanflow + "");
           keyData.setHuiliu_flow(huiliu + "");
           keyData.setOneyougongdiandu("6928.6");
           keyData.setTwoyougongdiandu("6713.7");
           keyData.setThreeyougongdiandu("7671.2");
           keyData.setFouryougongdiandu("236.2");
           keyData.setWorkyougongdiandu("88668");
           keyData.setBeiyongyougongdiandu("0");
           keyData.setOnesongshuidiandu("24567");
           keyData.setTwosongshuidiandu("14257");
           keyData.setThreesongshuidiandu("20408");
           keyData.setFoursongshuidiandu("21.4");
           keyData.setFivesongshuidiandu("60.5");
           keyData.setSixsongshuidiandu("2749.2");
           keyData.setSevensongshuidiandu("2463.9");

           try {
               InsertDao.insert(keyData, statement);
              /* if ("1".equals(insert)){
                   //System.out.println("插入成功");
               }else {
                   //System.out.println("插入成败");
               }*/
               Thread.sleep(10*1000);
           } catch (Exception e) {
               conn.close();
               MssqlConfig.closeConnection();
               throw new Exception("插入失败");
           }



       }




    }


}
