class RomanNumber {

    public static void main(String [] args) {
        System.out.println(convertNumberToRomanNumeral(4));

    }

    public static String convertNumberToRomanNumeral(int i) {
        String answer = "";
        int tempNum = i;

        int thousands = tempNum / 1000;
        tempNum -= thousands * 1000;

        // convert thousands to a roman numeral
        answer += convertThousands(thousands);

        int hundreds = tempNum / 100;
        tempNum -= hundreds * 100;

        answer += convertHundreds(hundreds);
        // convert

        int tens = tempNum / 10;
        tempNum -= tens * 10;

        answer += convertTens(tens);

        // convert

        int ones = tempNum;

        answer += convertOnes(ones);



        return answer;
    }

    public static String convertThousands(int thousands) {
        switch(thousands) {
            case 1:
                return "M";
            case 2:
                return "MM";
            case 3:
                return "MMM";
            default:
                return "";


        }
    }

    public static String convertHundreds(int hundreds) {
        switch(hundreds) {
            case 1:
                return "C";
            case 2:
                return "CC";
            case 3:
                return "CCC";
            case 4:
                return "CD";
            case 5:
                return "D";
            case 6:
                return "DC";
            case 7:
                return "DCC";
            case 8:
                return "DCCC";
            case 9:
                return "CM";
            default:
                return "";
        }
    }

    public static String convertTens(int tens) {
        switch(tens) {
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
            default:
                return "";
        }


    }

    public static String convertOnes(int ones) {
        switch(ones) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return "";
        }
    }
}
