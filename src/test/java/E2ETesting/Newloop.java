package E2ETesting;

import org.testng.Assert;

import java.util.Arrays;

public class Newloop {

        public static void main(String[] args) {
            String[] Workdays = {"Monday", "tuesday", "Wednesday", "Thursday", "Friday"};
            String days="";
            int dayindex=0;
            for(String Workday:Workdays) {
                days = days + "|" + Workday;
              //  System.out.println("Found"+Workday+"at position"+dayindex++);
                System.out.println(Workday.length());

            }

        }

    }


