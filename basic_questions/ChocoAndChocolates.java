package basic_questions;


import java.util.ArrayList;

public class ChocoAndChocolates {
    public static void main(String[] args) {
        String str = "aabcda";
        int totalMoney = 10;
        int[] prices = {5, 4, 4, 5, 1, 1, 1, 1, 1, 1, 1, 1};
        ArrayList<Character> chars = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            if (!chars.contains(ch)) {
                chars.add(ch);
            }
        }

        ArrayList<Integer> priceList = new ArrayList<>();
        for (int i = 0; i < chars.size(); i++) {
            priceList.add(prices[i]);
        }
        ArrayList<Integer> counts = new ArrayList<>();
        char maxChar = 'a';
        for (int i = 0, j = 1; i < str.length() && j < str.length(); i++, j++) {
            if (str.charAt(i) == str.charAt(j)) {
                maxChar = str.charAt(i);
            }
        }


        int startingIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == maxChar) {
                startingIndex = i;
                break;
            }
        }

        int totalChocolates = 0;
        int spendMoney = 0;
        String types="";
        while (totalMoney > 0) {
            if (maxChar == str.charAt(startingIndex)) {
                totalChocolates++;
                types+=str.charAt(startingIndex);
                startingIndex++;
            } else {

                totalMoney -= priceList.get(chars.indexOf(str.charAt(startingIndex)));
                if(totalMoney > 0){
                    totalChocolates++;
                    types+=str.charAt(startingIndex);
                }
                startingIndex++;
            }
        }
        System.out.println(chars);
        System.out.println(priceList);
        System.out.println(maxChar);
        System.out.println("Total Chocolates : " + totalChocolates);
        System.out.println("Total spended Money : "+spendMoney);
        System.out.println("Types of chocolates : "+ types);
    }
}
