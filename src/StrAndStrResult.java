public class StrAndStrResult {
    String[] strArray = new String[3];

    String elem1;
    String elem2;
    String elem3;

    void setStrArray(){
        elem1 = strArray[0];
        elem2 = strArray[1];
        elem3 = strArray[2];
        if(elem1.length() < 11 && elem3.length() < 11) {
            if (elem2.equals("+")) {
                System.out.printf("%s" + elem1 + elem3 + "%s", "\"","\"");
            }
            else if (elem2.equals("-")) {
                String myStr = elem1.replaceAll(elem3, "");
                System.out.printf("%s" + myStr + "%s", "\"","\"");
            }
            else {
                System.err.println("Не верный знак арифметической операции");
            }
        }
        else {
            System.err.println("Длинна строк не более 10 символов");
        }
    }
}
