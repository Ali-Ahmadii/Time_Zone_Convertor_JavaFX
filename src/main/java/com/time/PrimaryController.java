package com.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;

public class PrimaryController
{
    @FXML
    private Label localtime;
    
    @FXML
    private ComboBox<String> comboo;

    @FXML
    private Button showbtn;
    
    @FXML
    public void initialize() 
    {
        comboo.setItems(FXCollections.observableArrayList("USA(Central)","USA(Mountain)","USA(Pacific)","USA(Alaska)","USA(Hawaii)","Canada(Newfoundland)","Canada(Atlantic)","Canada(Central)","Canada(Mountain)","Canada(Pacific)","Mexico(Mexican Pacific)","Mexico(Pacific)","Brazil(Fernando de Noronha)","Brazil(Brasilia)","Brazil(Amazon)","Brazil(Acre)","Argentina","Colombia","Cuba","Venezuela","United Kingdom","Germany","Denmark","Switzerland","France","Netherlands","Austria","Czech Republic","Armania","Norway","Italy","Spain","Ireland","Sweden","Russia(etropavlovsk-Kamchatski)","Russia(Magadan/Sakhalin)","Russia(Vladivostok)","Russia(Yakutsk)","Russia(Irkutsk)","Russia(Novosibirsk)","Russia(Samara)","Russia(Eastern European)","Ukrain","Finland","Belarus","People's Republic of China","Japan","South Korea","North Korea","Singapoor","Taiwan","HongKong","India","Australia(Norfolk Island Daylight)","Australia(Australian Central Daylight)","Australia(Australian Western)","New Zealand","Islamic Republic Of Iran","Afghanistan","Iraq","Syria","Isreal","lebanon","Saudi Arabia","UAE","Kuwait","Qatar","Azarbaijan","Turkey","Egypt","South Africa"));
    }
    @FXML
    void settime()
    {
        if(comboo.getValue()==null){
        Date d1 = new Date();
        SimpleDateFormat dateformater = new SimpleDateFormat("EEE  ,   yyyy-MM-dd   HH:mm");
        String strDate= dateformater.format(d1);
        // System.out.println(df.format(d1));
        localtime.setText(strDate.toString());
        showbtn.setText("Please Select a Country");
        }
        else
        {
            gettime(comboo.getValue());
            System.out.println(comboo.getValue());
        }
        }
        void gettime(String destination)
        {
            Date d1 = new Date();
            DateFormat df = new SimpleDateFormat("EEE  ,   yyyy-MM-dd   HH:mm");
            String getzone;
            getzone=timezonegetter(destination);
            df.setTimeZone(TimeZone.getTimeZone(getzone));
            System.out.println(df.format(d1));
            localtime.setText(df.format(d1));
        }
        public String timezonegetter(String destination)
        {
            if(destination.equals("USA(Central)"))
            return "America/Chicago";
            if(destination.equals("USA(Mountain)"))
            return "America/Denver";
            if(destination.equals("USA(Pacific)"))
            return "America/Los_Angeles";
            if(destination.equals("USA(Alaska)"))
            return "America/Anchorage";
            if(destination.equals("USA(Hawaii)"))
            return "Pacific/Honolulu";
            if(destination.equals("Canada(Newfoundland)"))
            return "Canada/Newfoundland";
            if(destination.equals("Canada(Atlantic)"))
            return "America/Halifax";
            if(destination.equals("Canada(Central)"))
            return "America/Winnipeg";
            if(destination.equals("Canada(Mountain)"))
            return "America/Edmonton";
            if(destination.equals("Canada(Pacific)"))
            return "America/Vancouver";
            if(destination.equals("Mexico(Mexican Pacific)"))
            return "America/La_Paz";
            if(destination.equals("Mexico(Pacific)"))
            return "America/Tijuana";
            if(destination.equals("Brazil(Fernando de Noronha)"))
            return "America/Noronha";
            if(destination.equals("Brazil(Brasilia)"))
            return "America/Belem";
            if(destination.equals("Brazil(Amazon)"))
            return "America/Manaus";
            if(destination.equals("Brazil(Acre)"))
            return "America/Rio_Branco";
            if(destination.equals("Argentina"))
            return "America/Argentina/Buenos_Aires";
            if(destination.equals("Colombia"))
            return "America/Bogota";
            if(destination.equals("Cuba"))
            return "Cuba";
            if(destination.equals("Venezuela"))
            return "America/Caracas";
            if(destination.equals("United Kingdom"))
            return "Europe/London";
            if(destination.equals("Germany")||destination.equals("Denmark")||destination.equals("Switzerland")||destination.equals("France")||destination.equals("Netherlands")||destination.equals("Austria")||destination.equals("Norway")||destination.equals("Czech Republic")||destination.equals("Italy")||destination.equals("Spain")||destination.equals("Sweden"))
            return "Europe/Oslo";
            if(destination.equals("Armenia"))
            return "Asia/Yerevan";
            if(destination.equals("Ireland"))
            return "Greenwich";
            if(destination.equals("Russia(etropavlovsk-Kamchatski)"))
            return "Asia/Kamchatka";
            if(destination.equals("Russia(Magadan/Sakhalin)"))
            return "Asia/Magadan";
            if(destination.equals("Russia(Vladivostok)"))
            return "Asia/Vladivostok";
            if(destination.equals("Russia(Yakutsk)"))
            return "Asia/Yakutsk";
            if(destination.equals("Russia(Irkutsk)"))
            return "Asia/Irkutsk";
            if(destination.equals("Russia(Novosibirsk)"))
            return "Asia/Novosibirsk";
            if(destination.equals("Russia(Samara)"))
            return "Europe/Samara";
            if(destination.equals("Russia(Eastern European)"))
            return "Europe/Kaliningrad";
            if(destination.equals("Ukrain")||destination.equals("Finland")||destination.equals("Belarus"))
            return "EET";
            if(destination.equals("People's Republic of China"))
            return "Asia/Shanghai";
            if(destination.equals("Japan"))
            return "Asia/Tokyo";
            if(destination.equals("South Korea"))
            return "Asia/Seoul";
            if(destination.equals("North Korea"))
            return "Asia/Pyongyang";
            if(destination.equals("Singapoor"))
            return "Asia/Singapore";
            if(destination.equals("Taiwan"))
            return "Asia/Taipei";
            if(destination.equals("HongKong"))
            return "Hongkong";
            if(destination.equals("India"))
            return "IST";
            if(destination.equals("Australia(Norfolk Island Daylight)"))
            return "Pacific/Norfolk";
            if(destination.equals("Australia(Australian Central Daylight)"))
            return "Australia/Adelaide";
            if(destination.equals("Australia(Australian Western)"))
            return "Australia/Perth";
            if(destination.equals("New Zealand"))
            return "Pacific/Chatham";
            if(destination.equals("Islamic Republic Of Iran"))
            return "Iran";
            if(destination.equals("Afghanistan"))
            return "Asia/Kabul";
            if(destination.equals("Iraq"))
            return "Asia/Baghdad";
            if(destination.equals("Syria"))
            return "Asia/Damascus";
            if(destination.equals("Israel"))
            return "Israel";
            if(destination.equals("lebanon"))
            return "Asia/Beirut";
            if(destination.equals("Saudi Arabia"))
            return "Asia/Riyadh";
            if(destination.equals("UAE"))
            return "Asia/Dubai";
            if(destination.equals("Kuwait"))
            return "Asia/Kuwait";
            if(destination.equals("Qatar"))
            return "Asia/Qatar";
            if(destination.equals("Azarbaijan"))
            return "Asia/Baku";
            if(destination.equals("Turkey"))
            return "Asia/Istanbul";
            if(destination.equals("Egypt"))
            return "Egypt";
            if(destination.equals("South Africa"))
            return "Africa/Johannesburg";
            else
            {
                return "null";
            }
        }
    }