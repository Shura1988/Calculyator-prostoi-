package my;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
public class Calculyator {
    public void calc (String[] args) throws IOException {

        boolean flag = true;
        while (flag) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("введите данные: ");
            String str = reader.readLine().replaceAll("[a-z,A-Z]|\\s+", "");
            String[] numb = str.split("[+-/*]");
            double[] numbers = new double[numb.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Double.valueOf(numb[i]);
            }
            String[] operator = str.split("\\d+");
            double res = numbers[0];
            for (int i = 1; i < operator.length; i++) {
                if (operator[i].compareTo("+") == 0) {
                    res = res + numbers[i];
                }
                if (operator[i].compareTo("-") == 0) {
                    res = res - numbers[i];
                }
                if (operator[i].compareTo("/") == 0) {
                    res = res / numbers[i];
                }
                if (operator[i].compareTo("*") == 0) {
                    res = res * numbers[i];
                }
            }
            System.out.println(res);

        }
    }

}

