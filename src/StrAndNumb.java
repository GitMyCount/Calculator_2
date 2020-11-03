public class StrAndNumb {
    StringBuilder sdNumb = new StringBuilder();
    void setNumb(){
        String[] arr = sdNumb.toString().split("\"");
        if(arr.length != 2) {
            System.err.println("Не верны входные данные");
            return;
        }
        String s = arr[1].trim();
        String[] arr2 = s.split(" ");
        if(arr2.length == 2){
            String[] arr3 = new String[3];
            arr3[0] = arr[0];
            arr3[1] = arr2[0];
            arr3[2] = arr2[1];
            StrAndNumbResult array = new StrAndNumbResult();
            array.numbArray = arr3;
            array.setNumbArray();
        }
        else {
            System.err.println("Не верное количество элементов в строке...");
        }
    }
}
