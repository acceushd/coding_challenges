public class NumberToEnglish {
    public String numToEng(int num) {
        if (num == 0) {
            return "zero";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (num > 100) {
            int num2 = num / 100;
            switch (num2) {
                case 1 -> stringBuilder.append("one ");
                case 2 -> stringBuilder.append("two ");
                case 3 -> stringBuilder.append("three ");
                case 4 -> stringBuilder.append("four ");
                case 5 -> stringBuilder.append("five ");
                case 6 -> stringBuilder.append("six ");
                case 7 -> stringBuilder.append("seven ");
                case 8 -> stringBuilder.append("eight ");
                case 9 -> stringBuilder.append("nine ");
            }
            stringBuilder.append("hundred ");
        }
        if (num > 20) {
            int num2;
            if (num > 100) {
                num2 = (num / 10) % 10;
            } else {
                num2 = num / 10;
            }
            switch (num2) {
                case 2 -> stringBuilder.append("twenty ");
                case 3 -> stringBuilder.append("thirty ");
                case 4 -> stringBuilder.append("forty ");
                case 5 -> stringBuilder.append("fifty ");
                case 6 -> stringBuilder.append("sixty ");
                case 7 -> stringBuilder.append("seventy ");
                case 8 -> stringBuilder.append("eighty ");
                case 9 -> stringBuilder.append("ninety ");
            }
        }
        int num3;
        if (num > 100) {
            num3 = num % 100;
        } else {
            num3 = num;
        }
        if (num3 < 20 && num3 > 9) {
            switch (num3) {
                case 11 -> stringBuilder.append("eleven");
                case 12 -> stringBuilder.append("twelve");
                case 13 -> stringBuilder.append("thirteen ");
                case 14 -> stringBuilder.append("fourteen ");
                case 15 -> stringBuilder.append("fifteen ");
                case 16 -> stringBuilder.append("sixteen ");
                case 17 -> stringBuilder.append("seventeen ");
                case 18 -> stringBuilder.append("eighteen ");
                case 19 -> stringBuilder.append("nineteen ");
                case 10 -> stringBuilder.append("ten");
            }
        } else {
            int num2 = num3 % 10;
            switch (num2) {
                case 1 -> stringBuilder.append("one");
                case 2 -> stringBuilder.append("two");
                case 3 -> stringBuilder.append("three");
                case 4 -> stringBuilder.append("four");
                case 5 -> stringBuilder.append("five");
                case 6 -> stringBuilder.append("six");
                case 7 -> stringBuilder.append("seven");
                case 8 -> stringBuilder.append("eight");
                case 9 -> stringBuilder.append("nine");
            }
        }

        return stringBuilder.toString().trim();
    }
}
