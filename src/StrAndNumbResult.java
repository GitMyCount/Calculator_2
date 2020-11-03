public class StrAndNumbResult {
    String[] numbArray = new String[3];
    int a;
    void setNumbArray() {
        StringBuilder sd = new StringBuilder(numbArray[0]);
        try {
            a = Integer.parseInt(numbArray[2].trim());
        } catch (NumberFormatException nfe) {
            System.err.println("Не правильный ввод: третья должна быть цифра");
            System.exit(0);
        }
        if (a > 0 && a < 11 && numbArray[0].length() < 11) {
            if (numbArray[1].equals("*")) {
                sd.append(sd.toString().repeat(a - 1));

                if (sd.length() > 40) {
                    String sd2 = sd.substring(0, 40);
                    System.out.printf("%s" + sd2 + "%s", "\"", "...\"");
                }
                else {
                    System.out.printf("%s" + sd + "%s", "\"", "\"");
                }
            }
            else if (numbArray[1].equals("/")) {
                int b = numbArray[0].length();
                int c = b / a;
                String sd2 = sd.substring(0, c);
                System.out.printf("%s" + sd2 + "%s", "\"", "\"");
            }
            else {
                System.err.println("Не верный знак арифметической операции");
            }
        }
        else {
            System.err.println("Ошибка. Длинна строки не более 10 символов и число от 1 до 10...");
        }
    }
}
