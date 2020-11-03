public class ParsLine {
    String parsLine;

    void setLine(){
        StringBuilder sd = new StringBuilder(parsLine);

        if(sd.charAt(0) == '"') {
            sd.deleteCharAt(0);

            if(sd.charAt(sd.length()-1) == '"') {
                StrAndStr str = new StrAndStr();
                str.sdStr = sd;
                str.setStr();
            }
            else {
                StrAndNumb str = new StrAndNumb();
                str.sdNumb = sd;
                str.setNumb();
            }
        }
        else {
            System.err.println("Не правильный ввод данных... первый элемент - строка в двойных кавычках...");
        }
    }
}
