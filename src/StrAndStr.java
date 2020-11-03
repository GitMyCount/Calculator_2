public class StrAndStr {
    StringBuilder sdStr = new StringBuilder();
    void setStr() {
        String[] arr = sdStr.toString().split("\"");

        if(arr.length != 3) {
            System.err.println("Не верны входные данные");
            return;
        }

        arr[1] = arr[1].trim();
        if(arr[1].length() == 1) {
            if(arr.length == 3) {
                StrAndStrResult strArr = new StrAndStrResult();
                strArr.strArray = arr;
                strArr.setStrArray();
            }
            else {
                System.err.println("Не правильное колличество элементов");
            }
        }
        else {
            System.err.println("Не правильное колличество элементов");
        }
    }
}
